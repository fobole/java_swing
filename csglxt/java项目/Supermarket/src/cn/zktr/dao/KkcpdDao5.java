package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KkcpdDao3.Kkcpd3RowMapper;
import cn.zktr.entity.Kkcpd4;
import cn.zktr.entity.Kkcpd5;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KkcpdDao5 extends BaseDao{
	public List<Kkcpd5> selectByAll(String dh) throws Exception{
		String sql="select * from checkf g inner join caixaingpurchase c INNER JOIN purchase p on g.gid=c.gid and g.gid=p.sid and g.gid=? ";
		return super.executeQuery(sql, new Object[] {dh}, new Kkcpd5RowMapper());
	}
	class Kkcpd5RowMapper implements RowMapper<Kkcpd5>{

		@Override
		public Kkcpd5 map(ResultSet rs) throws Exception {
			Kkcpd5 g=new Kkcpd5();
			g.setChkushu(rs.getInt("chkushu"));
			g.setPdate(rs.getDate("pdate"));
			g.setChpanshu(rs.getInt("chpanshu"));
			g.setXpshu(rs.getInt("xpshu"));
			g.setPid(rs.getInt("pid"));
			return g;
		}
	
	}
}
