package cn.zktr.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
* 公共的增删改查Dao
* 
* @author zhaoTingTing
* @date 2019年8月21日
*/
public class BaseDao {
	// 准备连接字段
	String url = "jdbc:mysql://localhost:3306/supermarket?useEncode=true"
			+ "&characterEncoding=utf-8&useOldAliasMatedateBehavior=true";
	
	String username = "root";
	String password = "";
	Connection con = null;
	PreparedStatement st = null; 
	ResultSet rs = null;
	
	// 获得连接对象
	private Connection getConnection() throws Exception {
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 连接对象
			return DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			throw e;
		} finally {
			closeAll();
		}
	}
	
	/**
	 * 关闭连接
	 */
	private void closeAll() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 公共的查询
	 * 
	 * @throws Exception
	 */
	public <T> List<T> executeQuery(String sql, Object[] params, RowMapper<T> rowMapper) throws Exception {
		List<T> list = new ArrayList<>();
		con = getConnection();
		// 创建执行对象
		st = con.prepareStatement(sql);
		bind(params);
		rs = st.executeQuery();
		while (rs.next()) {
			// 封装泛型对象
			T t = rowMapper.map(rs);
			list.add(t);
		}
		return list;
	}
	
	/**
	 * 公共的增删改
	 * @param sql增删改语句
	 * @param params参数
	 * @return 执行增删改后的受影响行，0表示修改失败
	 * @throws SQLException
	 */
	public int executeUpdate(String sql, Object[] params) throws Exception {
		con = getConnection();
		// 创建执行对象
		st = con.prepareStatement(sql);
		// 绑定参数
		bind(params);
		return st.executeUpdate();
	
	}
	/**
	 * 绑定参数
	 * @param 前台传回的参数列表
	 * @throws SQLException
	 */
	private void bind(Object[] params) throws SQLException {
		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				st.setObject(i + 1, params[i]);
			}
		}
	}

}
