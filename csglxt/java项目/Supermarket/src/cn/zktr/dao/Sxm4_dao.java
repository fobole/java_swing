package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.S_xiaotui_dao.xiaotuiRowMapper;
import cn.zktr.dao.Sxiaoshou_dao.GoodsRowMapper;
import cn.zktr.entity.S_xiaotui;
import cn.zktr.entity.Sgoods_zengjia;
import cn.zktr.entity.Sxm4zuo;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Sxm4_dao extends BaseDao{
	public List<Sxm4zuo> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid where g.sztai=0 and s.stshu>0 order by g.gid desc ";
		return super.executeQuery(sql, null, new Sxm4zuoRowMapper());
	}
	public List<Sxm4zuo> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on s.gid=g.gid where sztai=0 and s.stshu>0 ");
		if(parma!=null){
			sql.append(" and (g.gname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append("order by g.gid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new Sxm4zuoRowMapper());
		   
	}
	class Sxm4zuoRowMapper implements RowMapper<Sxm4zuo>{

		
		@Override
		public Sxm4zuo map(ResultSet rs) throws Exception {
			Sxm4zuo g=new Sxm4zuo();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGspec(rs.getString("gspec"));
			g.setGprice(rs.getDouble("gprice"));
			g.setStshu(rs.getInt("stshu"));
			return g;
		}
		
	}
	
	//查vip
	public List<Sxm4zuo> selectByAll2() throws Exception{
		String sql="select * from vip where vstate=0";
		return super.executeQuery(sql, null, new GoodsRowMapper());
	}
	class GoodsRowMapper implements RowMapper<Sxm4zuo>{

		@Override
		public Sxm4zuo map(ResultSet rs) throws Exception {
			Sxm4zuo g=new Sxm4zuo();
			
			g.setVid(rs.getInt("vid"));
			g.setVname(rs.getString("vname"));
            g.setVgrade(rs.getString("vgrade"));
			return g;
		}
	}	
	
}
