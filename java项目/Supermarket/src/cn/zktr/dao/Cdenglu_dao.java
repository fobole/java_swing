package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Cyonghui_denglu;
import cn.zktr.entity.Xm4st;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Cdenglu_dao extends BaseDao{
	
	/**
	 * 登录（根据用户名和密码查询用户是否存在）
	 * 
	 */
	public List<Cyonghui_denglu> denglu(String uname,String upwd) throws Exception{
		String sql="select * from employee where ename=? and epwd=? and estate=0;";
		return super.executeQuery(sql, new Object[] {uname,upwd}, new denglurowMapper());
	}
	
	//忘记密码
	public int wanji(String pwd,String ename,String ephone) throws Exception {
		String sql="update employee set epwd=?  where ename=? and ephone=?";
	
		return super.executeUpdate(sql, new Object[] {pwd,ename,ephone});
	}
	
	//修改密码
	
	public int xiugai(String pwd2,String ename,String pwd) throws Exception {
		String sql="update employee set epwd=? where ename=? and epwd=?";
	
		return super.executeUpdate(sql, new Object[] {pwd2,ename,pwd});
	}
	
	class denglurowMapper implements RowMapper<Cyonghui_denglu>{

		@Override
		public Cyonghui_denglu map(ResultSet rs) throws Exception {
			Cyonghui_denglu d=new Cyonghui_denglu();
			d.setEid(rs.getInt("eid"));
			d.setEname(rs.getString("ename"));
			d.setEpwd(rs.getString("epwd"));
			d.setEposition(rs.getString("eposition"));
			d.setEphone(rs.getString("ephone"));
			d.setEadd(rs.getString("eadd"));
			d.setEstate(rs.getInt("estate"));
			return d;
		}
		
	}
}
