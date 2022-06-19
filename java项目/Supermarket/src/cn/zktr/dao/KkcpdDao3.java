package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KkcpdDao.Kkcpd1RowMapper;
import cn.zktr.entity.Kkcpd1;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd3;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao3 extends BaseDao{
	public List<Kkcpd3> selectByAll() throws Exception{
		String sql="select * from goods g INNER JOIN checkf c INNER JOIN stock s  INNER JOIN inventory i on g.gid=c.gid and g.gid=s.gid and g.gid=i.lid";
		return super.executeQuery(sql, null, new Kkcpd3RowMapper());
	}
	class Kkcpd3RowMapper implements RowMapper<Kkcpd3>{

		@Override
		public Kkcpd3 map(ResultSet rs) throws Exception {
			Kkcpd3 g=new Kkcpd3();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGspec(rs.getString("gspec"));
			g.setStshu(rs.getInt("stshu"));
			g.setLshu(rs.getInt("lshu"));
			return g;
		}

}
}
