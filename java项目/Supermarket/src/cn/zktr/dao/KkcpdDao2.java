package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Kkcpd3;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao2 extends BaseDao{
	public List<Kkcpd3> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid order by g.gid desc";
		return super.executeQuery(sql, null, new Kkcpd3RowMapper());
	}
	public List<Kkcpd3> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Kkcpd3RowMapper());
		   
	}
	class Kkcpd3RowMapper implements RowMapper<Kkcpd3>{

		@Override
		public Kkcpd3 map(ResultSet rs) throws Exception {
			Kkcpd3 g=new Kkcpd3();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getInt("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setStshu(rs.getInt("stshu"));
			return g;
		}
	
	}
}
