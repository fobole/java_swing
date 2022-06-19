package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Cgoods_dao extends BaseDao{
	public List<Cgoods_jiujia> selectByAll() throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid order by g.gid desc";
		return super.executeQuery(sql, null, new GoodsRowMapper());
	}
	public List<Cgoods_jiujia> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
//		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new GoodsRowMapper());
		   
	}
	class GoodsRowMapper implements RowMapper<Cgoods_jiujia>{

		@Override
		public Cgoods_jiujia map(ResultSet rs) throws Exception {
			Cgoods_jiujia g=new Cgoods_jiujia();
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
	//根据供应商，类型查
	public List<Cgoods_jiujia> gys_cha(int sid,int cid) throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid  where g.sid=? and g.cid=? order by g.gid desc";
		return super.executeQuery(sql, new Object[] {sid,cid }, new GoodsRowMapper());
	}
	public List<Cgoods_jiujia> gys_cha(int sid,int cid,String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid where (g.sid=? and g.cid=?)");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		return super.executeQuery(sql.toString(), new Object[] {sid,cid}, new gysRowMapper());
		   
	}
	class gysRowMapper implements RowMapper<Cgoods_jiujia>{

		@Override
		public Cgoods_jiujia map(ResultSet rs) throws Exception {
			Cgoods_jiujia g=new Cgoods_jiujia();
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
	//根据供应商查
		public List<Cgoods_jiujia> gys_cha(int sid) throws Exception{
			String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid  where g.sid=? order by g.gid desc";
			return super.executeQuery(sql, new Object[] {sid}, new GoodsRowMapper());
		}
		public List<Cgoods_jiujia> gys_cha(int sid,String parma) throws Exception{
			//字符串拼接
			StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid where (g.sid=? )");
			if(parma!=null){
				sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
			}
			sql.append(" order by g.gid desc");
//			System.out.println(sql.toString());
			return super.executeQuery(sql.toString(), new Object[] {sid}, new gRowMapper());
			   
		}
		class gRowMapper implements RowMapper<Cgoods_jiujia>{

			@Override
			public Cgoods_jiujia map(ResultSet rs) throws Exception {
				Cgoods_jiujia g=new Cgoods_jiujia();
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
		
		//退货--根据供应商，类型查
		public List<Cgoods_jiujia> gys_chatui(int sid,int cid) throws Exception{
			String sql="select * from details d join goods g on d.gid=g.gid join supplier s on g.sid=s.sid join category c on g.cid=c.cid where g.sid=? and g.cid=? and stshu>0  order by g.gid desc";
			return super.executeQuery(sql, new Object[] {sid,cid }, new GoodsRowMapper());
		}
		public List<Cgoods_jiujia> gys_chatui(int sid,int cid,String parma) throws Exception{
			//字符串拼接
			StringBuffer sql=new StringBuffer("select * from details d join goods g on d.gid=g.gid join supplier s on g.sid=s.sid join category c on g.cid=c.cid where g.sid=? and g.cid=?  and stshu>0  and stshu>0 ");
			if(parma!=null){
				sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
			}
			sql.append(" order by g.gid desc");
			return super.executeQuery(sql.toString(), new Object[] {sid,cid}, new gystuiRowMapper());
			   
		}
		class gystuiRowMapper implements RowMapper<Cgoods_jiujia>{

			@Override
			public Cgoods_jiujia map(ResultSet rs) throws Exception {
				Cgoods_jiujia g=new Cgoods_jiujia();
				g.setGid(rs.getInt("gid"));
				g.setGname(rs.getString("gname"));
				g.setGbid(rs.getDouble("gbid"));
				g.setGprice(rs.getDouble("gprice"));
				g.setGspec(rs.getString("gspec"));
				g.setStshu(rs.getInt("deshu"));
				g.setCid(rs.getInt("cid"));
				g.setCtype(rs.getString("ctype"));
				return g;
			}
			
		}
		//退货---根据供应商查
			public List<Cgoods_jiujia> gys_chatuig(int sid) throws Exception{
				String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid  where g.sid=? order by g.gid desc";
				return super.executeQuery(sql, new Object[] {sid}, new GoodsRowMapper());
			}
			public List<Cgoods_jiujia> gys_chatuig(int sid,String parma) throws Exception{
				//字符串拼接
				StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid join supplier su on g.sid=su.sid where (g.sid=?) ");
				if(parma!=null){
					sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
				}
				sql.append(" order by g.gid desc");
//				System.out.println(sql.toString());
				return super.executeQuery(sql.toString(), new Object[] {sid}, new gtuiRowMapper());
				   
			}
			class gtuiRowMapper implements RowMapper<Cgoods_jiujia>{

				@Override
				public Cgoods_jiujia map(ResultSet rs) throws Exception {
					Cgoods_jiujia g=new Cgoods_jiujia();
					g.setGid(rs.getInt("gid"));
					g.setGname(rs.getString("gname"));
					g.setGbid(rs.getDouble("gbid"));
					g.setGprice(rs.getDouble("gprice"));
					g.setGspec(rs.getString("gspec"));
					g.setStshu(rs.getInt("deshu"));
					g.setCid(rs.getInt("cid"));
					g.setCtype(rs.getString("ctype"));
					return g;
				}
				
			}
}
