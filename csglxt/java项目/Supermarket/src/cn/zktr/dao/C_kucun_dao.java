package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_kucun_dao extends BaseDao{
	public List<C_kucun_biandong> selectByAll() throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid order by g.gid desc";
		return super.executeQuery(sql, null, new kucunRowMapper());
	}
	public List<C_kucun_biandong> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g  join category c on g.cid=c.cid join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		
		return super.executeQuery(sql.toString(), null, new kucunRowMapper());
		   
	}
	
	class kucunRowMapper implements RowMapper<C_kucun_biandong>{

		@Override
		public C_kucun_biandong map(ResultSet rs) throws Exception {
			C_kucun_biandong g=new C_kucun_biandong();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setCtype(rs.getString("ctype"));
			g.setStshu(rs.getInt("stshu"));
			return g;
		}
		
	}
	
}
