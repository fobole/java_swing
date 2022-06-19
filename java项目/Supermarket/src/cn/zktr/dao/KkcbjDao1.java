package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KkcpdDao1.Kkcpd2RowMapper;
import cn.zktr.dao.KkcpdDao4.Kkcpd4RowMapper;
import cn.zktr.entity.Kkcbj1;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd4;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcbjDao1 extends BaseDao{
	public List<Kkcbj1> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid   order  by g.gid desc";
		return super.executeQuery(sql, null, new Kkcbj1RowMapper());
	}
	public List<Kkcbj1> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Kkcbj1RowMapper());
		   
	}
	class  Kkcbj1RowMapper implements RowMapper<Kkcbj1>{
		@Override
		public Kkcbj1 map(ResultSet rs) throws Exception {
			Kkcbj1 g=new Kkcbj1();
			g.setGid(rs.getInt("gid"));
			g.setGspec(rs.getString("gspec"));
			g.setGname(rs.getString("gname"));
			g.setStshu(rs.getInt("stshu"));
			g.setStmax(rs.getInt("stmax"));
			g.setStmin(rs.getInt("stmin"));

			return g;
		}
		
	}
	

}
