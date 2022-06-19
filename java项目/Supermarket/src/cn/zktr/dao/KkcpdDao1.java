package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KkcpdDao.Kkcpd1RowMapper;
import cn.zktr.entity.Kkcpd1;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao1 extends BaseDao{
	public List<Kkcpd2> selectByAll() throws Exception{
		String sql="select * from goods g INNER JOIN checkf c INNER JOIN stock s  INNER JOIN category a on g.gid=c.gid and g.gid=s.gid and g.gid=a.cid;";
		return super.executeQuery(sql, null, new Kkcpd2RowMapper());
	}
	class Kkcpd2RowMapper implements RowMapper<Kkcpd2>{

		@Override
		public Kkcpd2 map(ResultSet rs) throws Exception {
			Kkcpd2 g=new Kkcpd2();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setStshu(rs.getInt("stshu"));
			g.setGspec(rs.getNString("gspec"));
			g.setChpanshu(rs.getInt("chpanshu"));
			g.setCtype(rs.getString("ctype"));
			return g;
		}
		
	}
}
