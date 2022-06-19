package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import cn.zktr.entity.xm3hyzhengjia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Xm3zengjiadao extends BaseDao{
	public List<xm3hyzhengjia> selectByAll() throws Exception{
		String sql="select * from vip order by vid desc";
		return super.executeQuery(sql, null, new Xm3zengjiaRowMapper());
	}
	
	public int intstevip(xm3hyzhengjia zj,String vopera) throws Exception {
		String sql="insert into vip values (null,?,?,?,?,0,?,?)";
		return super.executeUpdate(sql, new Object[] {zj.getVname(),zj.getVphone(),zj.getVpwd(),zj.getVgrade(),vopera,new Date()});
	}
	
	public int updatexg(int vid,xm3hyzhengjia xzj) throws Exception {
		String sql="update vip set vname=?,vphone=?,vpwd=?,vgrade=? where vid=?";
		return super.executeUpdate(sql, new Object[] {xzj.getVname(),xzj.getVphone(),xzj.getVpwd(),xzj.getVgrade(),vid});
	}
	//会员不可用
	public int updatexgs(int vid) throws Exception {
		String sql="update vip set  vstate=1  where vid=?";
		return super.executeUpdate(sql, new Object[] {vid});
	}
	//会员可用
	public int updatexgs2(int vid) throws Exception {
		String sql="update vip set  vstate=0  where vid=?";
		return super.executeUpdate(sql, new Object[] {vid});
	}
	public List<xm3hyzhengjia> selectByAll(String parma) throws Exception{ 
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from vip where 1=1");
		if(parma!=null){
			sql.append(" and (vid like '%"+parma+"%' or vname like '%"+parma+"%')");
		}
		sql.append(" order by vid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Xm3zengjiaRowMapper());
		   
	}
	
	class Xm3zengjiaRowMapper implements RowMapper<xm3hyzhengjia>{

		public xm3hyzhengjia map(ResultSet rs) throws Exception {
			xm3hyzhengjia g=new xm3hyzhengjia();
			g.setVid(rs.getInt("Vid"));
			g.setVname(rs.getString("Vname"));
			g.setVphone(rs.getString("Vphone"));
			g.setVgrade(rs.getString("Vgrade"));
			g.setVpwd(rs.getString("Vpwd"));
			g.setVstate(rs.getInt("Vstate"));
			g.setVopera(rs.getString("Vopera"));
			g.setVdate(rs.getDate("Vdate"));
			return g;
		}
		
	}

}
