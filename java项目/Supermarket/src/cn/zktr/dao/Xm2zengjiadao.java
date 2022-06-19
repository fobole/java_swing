package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Xm3zengjiadao.Xm3zengjiaRowMapper;
import cn.zktr.entity.Xm2spcx;
import cn.zktr.entity.Xm2st;
import cn.zktr.entity.xm3hyzhengjia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Xm2zengjiadao extends BaseDao {
	public List<Xm2spcx> selectByAll(Xm2st good) throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join supplier s on g.sid=s.sid order by g.gid desc";
		return super.executeQuery(sql, null, new Xm2zengjiaRowMapper());
	}
	
	public int intstevip(Xm2st zj) throws Exception {
		String sql="insert into goods values (null,?,?,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[] {zj.getGname(), zj.getGbid(), zj.getGprice(), zj.getGspec(), zj.getCid(), zj.getSid(),zj.getSztai(),zj.getGopera(),zj.getGdate(),});
	}
	public int updatexg(int gid,Xm2st xzj) throws Exception {
		String sql="update goods set gname=?,gbid=?,gprice=?,gspec=?,cid=?,sid=?,sztai=?,gopera=?,gdate=? where gid=?";
		return super.executeUpdate(sql, new Object[] {xzj.getGname(),xzj.getGbid(),xzj.getGprice(),xzj.getGspec(),xzj.getCid(),xzj.getSid(),xzj.getSztai(),xzj.getGopera(),xzj.getGdate(),gid});
	}
	
	//下架商品
	public int updatexgj(int gid) throws Exception {
		String sql="update goods set  sztai=1  where gid=?";
		return super.executeUpdate(sql, new Object[] {gid});
	}
	//上架商品
	public int updatexgj2(int gid) throws Exception {
		String sql="update goods set  sztai=0  where gid=?";
		return super.executeUpdate(sql, new Object[] {gid});
	}
	
	public List<Xm2spcx> selectByAll(String parma) throws Exception{ 
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join supplier s on g.sid=s.sid order by g.gid desc");
		if(parma!=null){
			sql.append(" and (g.gid like '%"+parma+"%' or g.gname like '%"+parma+"%')");
		}
		sql.append(" order by goods desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Xm2zengjiaRowMapper());
		   
	}
	
	class Xm2zengjiaRowMapper implements RowMapper<Xm2spcx>{

		@Override
		public Xm2spcx map(ResultSet rs) throws Exception {
			Xm2spcx g=new Xm2spcx();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setCid(rs.getInt("cid"));
			g.setSid(rs.getInt("sid"));
			g.setSztai(rs.getInt("sztai"));
			g.setGopera(rs.getString("gopera"));
			g.setGdate(rs.getDate("gdate"));
			return g;
		}
		
	}


}
