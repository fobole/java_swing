package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import cn.zktr.dao.Xm3zengjiadao.Xm3zengjiaRowMapper;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.xm3hyzhengjia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Xm1dao extends BaseDao{
	public List<Xm1st> selectByAll() throws Exception{
		String sql="select * from Supplier  order by sid desc";
		return super.executeQuery(sql, null, new Xm1stRowMapper());
	}
	public int intste1(Xm1st zj) throws Exception {
		String sql="insert into Supplier values (null,?,?,?,?,0)";
		return super.executeUpdate(sql, new Object[] {zj.getSbusiness(),zj.getSname(),zj.getSphone(),zj.getSaddress(),});
	}
	public int updatexg(int sid,Xm1st zj) throws Exception {
		String sql="update Supplier set Sbusiness=?,Sname=?,Sphone=?,Saddress=? where sid=?";
		return super.executeUpdate(sql, new Object[] {zj.getSbusiness(),zj.getSname(),zj.getSphone(),zj.getSaddress(),sid});
	}
	//下架供应商
	public int updatexgs(int sid) throws Exception {
		String sql="update Supplier set  sztai=1  where sid=?";
		return super.executeUpdate(sql, new Object[] {sid});
	}
	//上架供应商
	public int updatexgs2(int sid) throws Exception {
		String sql="update Supplier set  sztai=0  where sid=?";
		return super.executeUpdate(sql, new Object[] {sid});
	}
	public List<Xm1st> selectByAll(String parma) throws Exception{ 
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from Supplier ");
		if(parma!=null){
			sql.append(" and (sid like '%"+parma+"%' or sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by sid desc");
		
		return super.executeQuery(sql.toString(), null, new Xm1stRowMapper());
		   
	}
	
	class Xm1stRowMapper implements RowMapper<Xm1st>{

		public Xm1st map(ResultSet rs) throws Exception {
			Xm1st g=new Xm1st();
			g.setSid(rs.getInt("Sid"));
			g.setSbusiness(rs.getString("Sbusiness"));
			g.setSname(rs.getString("Sname"));
			g.setSphone(rs.getString("Sphone"));
			g.setSaddress(rs.getString("Saddress"));
			g.setSztai(rs.getInt("Sztai"));
			
			return g;
}
}}