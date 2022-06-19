package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;


import cn.zktr.entity.C_kucun_jtshu;
import cn.zktr.entity.C_kucun_xinxi;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_kuncun_xinxi_dao extends BaseDao{
	public List<C_kucun_xinxi> selectByAll() throws Exception{
		String sql="select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid order by g.gid desc";
		return super.executeQuery(sql, null, new kucunRowMapper());
	}
	public List<C_kucun_xinxi> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join category c on g.cid=c.cid join stock s on g.gid=s.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new kucunRowMapper());
		   
	}
	class kucunRowMapper implements RowMapper<C_kucun_xinxi>{

		@Override
		public C_kucun_xinxi map(ResultSet rs) throws Exception {
			C_kucun_xinxi g=new C_kucun_xinxi();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			return g;
		}
		
	}
}
