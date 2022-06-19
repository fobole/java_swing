package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Xm1dao.Xm1stRowMapper;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm4st;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Xm4dao extends BaseDao {
	public List<Xm4st> selectByAll() throws Exception{
		String sql="select * from employee  order by eid desc";
		return super.executeQuery(sql, null, new Xm4stRowMapper());
	}
	public int intste(Xm4st zj) throws Exception {
		String sql="insert into employee values (null,?,?,?,?,?,0)";
		return super.executeUpdate(sql, new Object[] {zj.getEname(),zj.getEpwd(),zj.getEposition(),zj.getEphone(),zj.getEadd(),});
	}
	public int updatexg(int eid,Xm4st zj) throws Exception {
		String sql="update employee set ename=?,epwd=?,eposition=?,ephone=?,eadd=?  where eid=?";
	
		return super.executeUpdate(sql, new Object[] {zj.getEname(),zj.getEpwd(),zj.getEposition(),zj.getEphone(),zj.getEadd(),eid});
	}
	//离职
	public int updatexgs(int eid) throws Exception {
		String sql="update employee set  estate=1  where eid=?";
		return super.executeUpdate(sql, new Object[] {eid});
	}
	//在职
	public int updatexgs2(int eid) throws Exception {
		String sql="update employee set  estate=0  where eid=?";
		return super.executeUpdate(sql, new Object[] {eid});
	}
	public List<Xm4st> selectByAll(String parma) throws Exception{ 
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from employee where 1=1");
		if(parma!=null){
			sql.append(" and (eid like '%"+parma+"%' or ename like '%"+parma+"%')");
		}
		sql.append(" order by eid desc");
		
		return super.executeQuery(sql.toString(), null, new Xm4stRowMapper());
		   
	}
	
	class Xm4stRowMapper implements RowMapper<Xm4st>{

		public Xm4st map(ResultSet rs) throws Exception {
			Xm4st g=new Xm4st();
			g.setEid(rs.getInt("Eid"));
			g.setEname(rs.getString("Ename"));
			g.setEpwd(rs.getString("Epwd"));
			g.setEposition(rs.getString("Eposition"));
			g.setEphone(rs.getString("Ephone"));
			g.setEadd(rs.getString("Eadd"));
			g.setEstate(rs.getInt("Estate"));
			return g;
}
}}

