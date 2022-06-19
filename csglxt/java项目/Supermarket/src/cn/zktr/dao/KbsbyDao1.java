package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;
import java.util.Set;

import cn.zktr.dao.KkcpdDao2.Kkcpd3RowMapper;
import cn.zktr.dao.KkcpdDao5.Kkcpd5RowMapper;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Kbsby1;
import cn.zktr.entity.Kbsbykc;
import cn.zktr.entity.Kkcpd3;
import cn.zktr.entity.Kkcpd5;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KbsbyDao1 extends BaseDao{
	 public List<Kbsby1> selectByAll() throws Exception{
			String sql="select * from overflow o join stock s on o.oodd=s.gid order by s.gid desc";
			return super.executeQuery(sql, null, new Kbsby1RowMapper());
		}
		public List<Kbsby1> selectByAll(String parma) throws Exception{
			//字符串拼接
			StringBuffer sql=new StringBuffer("select * from overflow o join stock s on o.oodd=s.gid order by s.gid desc where 1=1");
			if(parma!=null){
				sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
			}
			sql.append(" order by g.gid desc");
		
			return super.executeQuery(sql.toString(), null, new Kbsby1RowMapper());
			   
		}
	 class Kbsby1RowMapper implements RowMapper<Kbsby1>{

		@Override
		public Kbsby1 map(ResultSet rs) throws Exception {
			Kbsby1 g=new Kbsby1();
			g.setOagent(rs.getString("oagent"));
			g.setOdate(rs.getDate("odate"));
			g.setOodd(rs.getString("oodd"));
			g.setStopera(rs.getString("stopera"));
			g.setObeizhu(rs.getNString("obeizhu"));
			return g;
		}

}
	 
	//查库存
			public List<Cgoods_jiujia> selectkc(int gid) throws Exception{
				String sql="select * from stock where gid=?";
				return super.executeQuery(sql, new Object[] {gid}, new kcRowMapper());
			}
			class kcRowMapper implements RowMapper<Cgoods_jiujia>{

				@Override
				public Cgoods_jiujia map(ResultSet rs) throws Exception {
					Cgoods_jiujia g=new Cgoods_jiujia();
					g.setStshu(rs.getInt("stshu"));
					return g;
				}
				
			}
}