package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KkcpdDao1.Kkcpd2RowMapper;
import cn.zktr.dao.KkcpdDao2.Kkcpd3RowMapper;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd3;
import cn.zktr.entity.Kkcpd4;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao4 extends BaseDao{
	public List<Kkcpd4> selectByAll() throws Exception{
		String sql="select * from goods g INNER JOIN checkf c INNER JOIN inventory i INNER JOIN stock s on g.gid=c.gid and c.lid=i.lodd and g.gid=s.gid";
		System.out.println(sql);
		return super.executeQuery(sql, null, new Kkcpd4RowMapper());
	}
	public List<Kkcpd4> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g INNER JOIN checkf c INNER JOIN inventory i INNER JOIN stock s on g.gid=c.gid and c.lid=i.lodd and g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Kkcpd4RowMapper());
		   
	}
	class Kkcpd4RowMapper implements RowMapper<Kkcpd4>{

		@Override
		public Kkcpd4 map(ResultSet rs) throws Exception {
			Kkcpd4 g=new Kkcpd4();
			g.setGid(rs.getInt("gid"));
			g.setChpanshu(rs.getInt("chpanshu"));
			
			g.setStshu(rs.getInt("stshu"));
			g.setGname(rs.getString("gname"));
			g.setLdate(rs.getDate("ldate"));
			g.setGspec(rs.getString("gspec"));
			g.setLodd(rs.getString("lodd"));
			return g;
		}

	}
}
