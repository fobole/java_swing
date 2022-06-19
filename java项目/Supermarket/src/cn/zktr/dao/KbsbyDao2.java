package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.KbsbyDao1.Kbsby1RowMapper;
import cn.zktr.entity.Kbsby1;
import cn.zktr.entity.Kbsby2;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KbsbyDao2 extends BaseDao{
	 public List<Kbsby2> selectByAll() throws Exception{
			String sql="select * from overflow o  order by o.oid desc";
			return super.executeQuery(sql, null, new Kbsby2RowMapper());
		}
		public List<Kbsby2> selectByAll(String parma) throws Exception{
			//字符串拼接
			StringBuffer sql=new StringBuffer("select * from overflow o where ");
			if(parma!=null){
				sql.append(" o.oodd like '%"+parma+"%' ");
			}
			sql.append(" order by o.oid desc");
			System.out.println(sql.toString());
			return super.executeQuery(sql.toString(), null, new Kbsby2RowMapper());
			   
		}
		class Kbsby2RowMapper implements RowMapper<Kbsby2>{

			@Override
			public Kbsby2 map(ResultSet rs) throws Exception {
				Kbsby2 g=new Kbsby2();
				g.setOagent(rs.getString("oagent"));
				g.setOdate(rs.getDate("odate"));
				g.setOodd(rs.getString("oodd"));
				g.setObeizhu(rs.getNString("obeizhu"));
				return g;
			}
		}
}
