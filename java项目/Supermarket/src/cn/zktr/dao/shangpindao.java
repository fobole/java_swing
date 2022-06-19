package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Xm3hyDao.Xm3hyRowMapper;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm2spcx;
import cn.zktr.entity.Xm3users;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class shangpindao extends BaseDao{
	public List<Xm2spcx> selectByAll() throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join supplier s on g.sid=s.sid order by g.gid desc ";
		return super.executeQuery(sql, null, new shangpinRowMapper());
	}
	/**
	 * 带条件的查询
	 * @param parma
	 * @return
	 * @throws Exception 
	 */
	public List<Xm2spcx> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join supplier s on g.sid=s.sid ");
		if(parma!=null){
			sql.append(" and (g.gid like '%"+parma+"%' or g.gname like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
//		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new shangpinRowMapper());
		   
	}
	
	//类型
	public List<Xm2spcx> selecttype() throws Exception{
		String sql="select * from category";
		return super.executeQuery(sql, null, new TypeRowmapper());
	}
	
	class TypeRowmapper implements RowMapper<Xm2spcx>{

		@Override
		public Xm2spcx map(ResultSet rs) throws Exception {
			Xm2spcx g=new Xm2spcx();
			g.setCid(rs.getInt("cid"));
			g.setCtype(rs.getString("ctype"));
//			System.out.println(rs.getInt("cid")+rs.getString("ctype"));
			return g;
		}
	}
		
	
	
	//供应商
		public List<Xm1st> selectgys() throws Exception{
			String sql="select * from supplier where sztai=0";
			return super.executeQuery(sql, null, new gysRowmapper());
		}
		class gysRowmapper implements RowMapper<Xm1st>{

			@Override
			public Xm1st map(ResultSet rs) throws Exception {
				Xm1st g=new Xm1st();
				g.setSid(rs.getInt("sid"));
				g.setSbusiness(rs.getString("sbusiness"));
//				System.out.println(rs.getInt("cid")+rs.getString("ctype"));
				return g;
			}
		}
	
	
	class shangpinRowMapper implements RowMapper<Xm2spcx>{

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
			g.setGdate(rs.getTimestamp("gdate"));
			g.setCtype(rs.getString("ctype"));
			g.setSbusiness(rs.getString("sbusiness"));
			return g;
		}

		
	}
}


