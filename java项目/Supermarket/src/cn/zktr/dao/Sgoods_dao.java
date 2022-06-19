package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Sgoods_zengjia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Sgoods_dao extends BaseDao{
	public List<Sgoods_zengjia> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid order by g.gid desc";
		return super.executeQuery(sql, null, new GoodsRowMapper());
	}
	public List<Sgoods_zengjia> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
//		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new GoodsRowMapper());
		   
	}
	class GoodsRowMapper implements RowMapper<Sgoods_zengjia>{

		@Override
		public Sgoods_zengjia map(ResultSet rs) throws Exception {
			Sgoods_zengjia g=new Sgoods_zengjia();
//			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setStshu(rs.getInt("stshu"));
			return g;
		}
	}
	
	
}