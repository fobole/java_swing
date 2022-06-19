package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Sgoods_dao2.GoodsRowMapper;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.S_jintuihuo_danju;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class S_danju extends BaseDao{
	public List<S_jintuihuo_danju> selectByAll() throws Exception{
		String sql="select * from goods g join stock s on g.gid=s.gid join sale e on e.vid=g.gid join vip v on g.gid=v.vid order by g.gid desc";
		return super.executeQuery(sql, null, new danjuRowMapper());
	}
	public List<S_jintuihuo_danju> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from goods g join stock s on g.gid=s.gid join sale e on e.vid=g.gid join vip v on g.gid=v.vid where 1=1");
		if(parma!=null){
			sql.append(" and (v.vname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		return super.executeQuery(sql.toString(), null, new danjuRowMapper());
		   
	}
	
	//整单退货
	public List<S_jintuihuo_danju> selecttui() throws Exception{
		String sql="select * from sale s join vip v on s.vid=v.vid join come c on s.saodd=c.coodd WHERE c.cotype=2  and s.saztai=0  order by s.said desc";
		return super.executeQuery(sql, null, new danjuzRowMapper());
	}
	public List<S_jintuihuo_danju> selecttui(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from sale s join vip v on s.vid=v.vid join come c on s.saodd=c.coodd WHERE c.cotype=2  and s.saztai=0 ");
		if(parma!=null){
			sql.append(" and (v.vname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		return super.executeQuery(sql.toString(), null, new danjuzRowMapper());
		   
	}
	class danjuzRowMapper implements RowMapper<S_jintuihuo_danju>{

		@Override
		public S_jintuihuo_danju map(ResultSet rs) throws Exception {
            S_jintuihuo_danju g=new S_jintuihuo_danju();
            g.setSaodd(rs.getString("saodd"));
            g.setGdate(rs.getDate("sadate"));
			g.setVname(rs.getString("vname"));
			g.setSacope(rs.getDouble("sacope"));
			g.setSapaid(rs.getDouble("sapaid"));
			g.setSaagent(rs.getString("saagent"));
			return g;
		}

    }
	//整单退货 详表
		public List<S_danju_xiangqin> selectByAllz(String saodd) throws Exception{
			String sql="select * from saletdatails s  join  goods g on s.gid=g.gid where s.saodd=? order by g.gid desc";
			return super.executeQuery(sql, new Object[] {saodd}, new danjuz1RowMapper());
		}
		class danjuz1RowMapper implements RowMapper<S_danju_xiangqin>{

			@Override
			public S_danju_xiangqin map(ResultSet rs) throws Exception {
				S_danju_xiangqin g=new S_danju_xiangqin();
	            //g.setSaodd(rs.getString("saodd"));
	            g.setGid(rs.getInt("gid"));
	            g.setGname(rs.getString("gname"));
	            g.setGspec(rs.getString("gspec"));
	            g.setSdshu(rs.getInt("sdshu"));
	           
	            g.setGprice(rs.getDouble("gprice"));
				return g;
			}
			
		}
	
	
	
	//单据查询--单据页面
	public List<S_jintuihuo_danju> danju() throws Exception{
		String sql="select * from sale s join vip v on s.vid=v.vid order by s.said desc";
		return super.executeQuery(sql, null, new danju1RowMapper());
	}
	public List<S_jintuihuo_danju> danju(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from sale s join vip v on s.vid=v.vid  where 1=1");
		if(parma!=null){
			sql.append(" and (v.vname like '%"+parma+"%' or g.gid like '%"+parma+"%')");
		}
		sql.append(" order by g.gid desc");
		return super.executeQuery(sql.toString(), null, new danju1RowMapper());
		   
	}
	class danju1RowMapper implements RowMapper<S_jintuihuo_danju>{

		@Override
		public S_jintuihuo_danju map(ResultSet rs) throws Exception {
            S_jintuihuo_danju g=new S_jintuihuo_danju();
            g.setSaodd(rs.getString("saodd"));
            g.setGdate(rs.getDate("sadate"));
			g.setVname(rs.getString("vname"));
			g.setSacope(rs.getDouble("sacope"));
			g.setSapaid(rs.getDouble("sapaid"));
			g.setSaagent(rs.getString("saagent"));
			return g;
		}

    }
	
	
	
	class danjuRowMapper implements RowMapper<S_jintuihuo_danju>{

		@Override
		public S_jintuihuo_danju map(ResultSet rs) throws Exception {
            S_jintuihuo_danju g=new S_jintuihuo_danju();
            g.setSaodd(rs.getString("saodd"));   		
			g.setGdate(rs.getDate("gdate"));
			g.setVname(rs.getString("vname"));
			g.setSacope(rs.getDouble("sacope"));
			g.setSapaid(rs.getDouble("sapaid"));
			g.setSaagent(rs.getString("saagent"));
			return g;
		}

    }
	//单据页面详情
	//单据详情
		public List<S_danju_xiangqin> danjuxiang(String saodd) throws Exception{
			String sql="select * from saletdatails s  join  goods g on s.gid=g.gid where s.saodd=? order by g.gid desc";
			return super.executeQuery(sql, new Object[] {saodd}, new danjux1RowMapper());
		}
		class danjux1RowMapper implements RowMapper<S_danju_xiangqin>{

			@Override
			public S_danju_xiangqin map(ResultSet rs) throws Exception {
				S_danju_xiangqin g=new S_danju_xiangqin();
	            g.setSaodd(rs.getString("saodd"));
	            g.setGid(rs.getInt("gid"));
	            g.setGname(rs.getString("gname"));
	            g.setGspec(rs.getString("gspec"));
	            g.setSdshu(rs.getInt("sdshu"));
	            g.setGprice(rs.getDouble("gprice"));
				return g;
			}
			
		}
	
	
	
	//单据详情
	public List<S_danju_xiangqin> selectByAll2(String saodd) throws Exception{
		String sql="select * from goods g join stock s on s.gid=g.gid join saletdatails sa on sa.gid=g.gid where saodd=? order by g.gid desc";
		return super.executeQuery(sql, new Object[] {saodd}, new danjuxRowMapper());
	}
	class danjuxRowMapper implements RowMapper<S_danju_xiangqin>{

		@Override
		public S_danju_xiangqin map(ResultSet rs) throws Exception {
			S_danju_xiangqin g=new S_danju_xiangqin();
            //g.setSaodd(rs.getString("saodd"));
            g.setGid(rs.getInt("gid"));
            g.setGname(rs.getString("gname"));
            g.setGspec(rs.getString("gspec"));
            g.setStshu(rs.getInt("sdshu"));
            g.setGprice(rs.getDouble("gprice"));
			return g;
		}
		
	}
	
}
