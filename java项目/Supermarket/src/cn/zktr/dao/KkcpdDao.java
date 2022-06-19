package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.Kkcpd1;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao extends BaseDao{
	public List<Kkcpd1> selectByAll() throws Exception{
		String sql="select * from inventory where ltiao>0 order by lid desc";
		return super.executeQuery(sql, null, new Kkcpd1RowMapper());
	}
	class Kkcpd1RowMapper implements RowMapper<Kkcpd1>{

		@Override
		public Kkcpd1 map(ResultSet rs) throws Exception {
			Kkcpd1 g=new Kkcpd1();
			  g.setLodd(rs.getString("lodd"));
			  g.setLdate(rs.getDate("ldate"));
			  g.setLopera(rs.getString("lopera"));
			  g.setLtiao(rs.getInt("ltiao"));
			  g.setLshu(rs.getInt("lshu"));
//			  g.setChremarks(rs.getString("Chremarks"));
			return g;
		}
		
	}
	public int updateNumber(String lodd) throws Exception{
		String sql="update inventory set ltiao=-1 where lodd=?";
		return super.executeUpdate(sql, new Object[]{lodd});
	}
		
}
	