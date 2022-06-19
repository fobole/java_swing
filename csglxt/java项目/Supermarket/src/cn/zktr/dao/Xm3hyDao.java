package cn.zktr.dao;



import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Xm3users;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Xm3hyDao extends BaseDao {

	public List<Xm3users> selectByAll() throws Exception{
		String sql="select * from vip";
		return super.executeQuery(sql, null, new Xm3hyRowMapper());
	}
	/**
	 * 带条件的查询
	 * @param parma
	 * @return
	 * @throws Exception 
	 */
	public List<Xm3users> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from vip ");
		if(parma!=null){
			sql.append(" and (vid like '%"+parma+"%' or vname like '%"+parma+"%')");
		}
		sql.append(" order by vid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Xm3hyRowMapper());
		   
	}
	
	
	class Xm3hyRowMapper implements RowMapper<Xm3users>{

		@Override
		public Xm3users map(ResultSet rs) throws Exception {
			Xm3users g=new Xm3users();
			g.setVid(rs.getInt("Vid"));
			g.setVname(rs.getString("Vname"));
			g.setVphone(rs.getString("Vphone"));
			g.setVgrade(rs.getString("Vgrade"));
			g.setVpwd(rs.getString("Vpwd"));
			g.setVstate(rs.getInt("Vstate"));
			g.setVopera(rs.getString("Vopera"));
//			g.setVdate(rs.getDate("Vdate"));
			return g;
		}

		
	}
}
