package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Sgoods_dao2 extends BaseDao{
	
	public List<Sgoods_jiujia> selectByAllx() throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid  where g.sztai=0  order by g.gid  desc ";
		return super.executeQuery(sql, null, new GoodsRowMapper());
	}
	public List<Sgoods_jiujia> selectByAllx(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid  where g.sztai=0 ");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		
		sql.append(" order by g.gid  desc ");
//		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new GoodsRowMapper());
		   
	}
	
	

	
	//销售退货
	public List<Sgoods_jiujia> selectByAll() throws Exception{
		
		
		String sql="select * from saletdatails sa join goods g on sa.gid=g.gid join category c on g.cid=c.cid join stock s on g.gid=s.gid  where g.sztai=0  GROUP BY g.gname  order by g.gid  desc ";
		return super.executeQuery(sql, null, new GoodsRowMapper());
	}
	public List<Sgoods_jiujia> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from saletdatails sa join goods g on sa.gid=g.gid join category c on g.cid=c.cid join stock s on g.gid=s.gid  where g.sztai=0 ");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		
		sql.append("  GROUP BY g.gname  order by g.gid  desc ");
//		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new GoodsRowMapper());
		   
	}
	
	//销售总数
	public List<Sgoods_jiujia> selectByAllhe(int gid) throws Exception{
		String sql="select sum(sdshu) from saletdatails sa join goods g on sa.gid=g.gid join category c on g.cid=c.cid join stock s on g.gid=s.gid  join come co on sa.saodd=co.coodd  where g.sztai=0  and g.gid=?  and co.cotype=3   GROUP BY g.gname  order by g.gid  desc";
		return super.executeQuery(sql, new Object[] {gid}, new GoodsRowMapperhe());
	}
	class GoodsRowMapperhe implements RowMapper<Sgoods_jiujia>{

		@Override
		public Sgoods_jiujia map(ResultSet rs) throws Exception {
			Sgoods_jiujia g=new Sgoods_jiujia();
			g.setSdshu(rs.getInt("sum(sdshu)"));
//			System.out.println(rs.getInt("sum(sdshu)"));
			return g;
		}
		
	}
	public List<Sgoods_jiujia> tuihe() throws Exception{
		String sql="select sum(deshu) from details d join goods g on d.gid=g.gid GROUP BY g.gid";
		return super.executeQuery(sql, new Object[] {}, new Goods1RowMapperhe());
	}
	class Goods1RowMapperhe implements RowMapper<Sgoods_jiujia>{

		@Override
		public Sgoods_jiujia map(ResultSet rs) throws Exception {
			Sgoods_jiujia g=new Sgoods_jiujia();
			g.setSdshu(rs.getInt("sum(deshu)"));
//			System.out.println(rs.getInt("sum(sdshu)"));
			return g;
		}
		
	}
	
	class GoodsRowMapper implements RowMapper<Sgoods_jiujia>{

		@Override
		public Sgoods_jiujia map(ResultSet rs) throws Exception {
			Sgoods_jiujia g=new Sgoods_jiujia();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setStshu(rs.getInt("stshu"));
			g.setCid(rs.getInt("cid"));
			g.setCtype(rs.getString("ctype"));
			
			return g;
		}
		
	}
}
