package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.C_kucun_jtshu_dao.kucunjtRowMapper;
import cn.zktr.entity.C_kucun_jtshu;
import cn.zktr.entity.C_zhengdantuihuo;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_zhengdantuihuo_dao extends BaseDao{
	public List<C_zhengdantuihuo> selectByAll() throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid join come c on p.podd=c.coodd order by p.pid desc";
		return super.executeQuery(sql, null, new zdthRowMapper());
	}
	public List<C_zhengdantuihuo> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid join come c on p.podd=c.coodd where 1=1");
		if(parma!=null){
			sql.append(" and (p.pid like '%"+parma+"%' or s.sname like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		return super.executeQuery(sql.toString(), null, new zdthRowMapper());
		   
	}
	class zdthRowMapper implements RowMapper<C_zhengdantuihuo>{

		@Override
		public C_zhengdantuihuo map(ResultSet rs) throws Exception {
			C_zhengdantuihuo g=new C_zhengdantuihuo();
			g.setPid(rs.getInt("pid"));
			g.setPodd(rs.getString("podd"));
			g.setPcope(rs.getDouble("pcope"));
			g.setPpaid(rs.getDouble("ppaid"));
			g.setCotype(rs.getInt("cotype"));
			return g;
		}
		
	}
}
