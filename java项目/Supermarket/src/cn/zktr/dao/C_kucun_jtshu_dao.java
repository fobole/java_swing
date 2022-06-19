package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.C_kucun_dao.kucunRowMapper;
import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.entity.C_kucun_jtshu;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_kucun_jtshu_dao extends BaseDao{
	public List<C_kucun_jtshu> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid join  caixaingpurchase c on g.gid=c.gid join saletdatails sa on g.gid=sa.gid order by g.gid desc";
		return super.executeQuery(sql, null, new kucunjtRowMapper());
	}
	public List<C_kucun_jtshu> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on g.gid=s.gid join  caixaingpurchase c on g.gid=c.gid join saletdatails sa on g.gid=sa.gid where 1=1");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new kucunjtRowMapper());
		   
	}
	class kucunjtRowMapper implements RowMapper<C_kucun_jtshu>{

		@Override
		public C_kucun_jtshu map(ResultSet rs) throws Exception {
			C_kucun_jtshu g=new C_kucun_jtshu();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setStshu(rs.getInt("stshu"));
			g.setXpshu(rs.getInt("xpshu"));
			g.setSdshu(rs.getInt("sdshu"));
			return g;
		}
		
	}
}
