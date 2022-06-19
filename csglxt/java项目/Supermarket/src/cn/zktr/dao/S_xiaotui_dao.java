package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.S_danju.danjuxRowMapper;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.S_xiaotui;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class S_xiaotui_dao extends BaseDao{
	public List<S_xiaotui> selectByAll() throws Exception{
		String sql="select * from sale s join come co on s.saodd=co.coodd join vip v on s.vid=v.vid  where  s.saztai=1 and  co.cotype=2  order by s.vid desc ";
		return super.executeQuery(sql, null, new xiaotuiRowMapper());
	}
	/**
	 * 带条件的查询
	 * @param parma
	 * @return
	 * @throws Exception 
	 */
	public List<S_xiaotui> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from sale s join come co on s.saodd=co.coodd join vip v on s.vid=v.vid   where  s.saztai=1 and  co.cotype=2 ");
		if(parma!=null){
			sql.append(" and (v.vname like '%"+parma+"%' or s.saodd like '%"+parma+"%')");
		}
		sql.append(" order by s.said desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new xiaotuiRowMapper());
		   
	}
	
	
	//销售退货查询
	public List<S_xiaotui> selectByAlltui() throws Exception{
		String sql="select * from sale s join come co on s.saodd=co.coodd join vip v on s.vid=v.vid  where  s.saztai=0 and  co.cotype=3  order by s.vid desc ";
		return super.executeQuery(sql, null, new xiaotuiRowMapper());
	}
	/**
	 * 带条件的查询
	 * @param parma
	 * @return
	 * @throws Exception 
	 */
	public List<S_xiaotui> selectByAlltui(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from sale s join come co on s.saodd=co.coodd join vip v on s.vid=v.vid   where  s.saztai=0 and  co.cotype=3 ");
		if(parma!=null){
			sql.append(" and (v.vname like '%"+parma+"%' or s.saodd like '%"+parma+"%')");
		}
		sql.append(" order by s.said desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new xiaotuiRowMapper());
		   
	}
	
	
	class xiaotuiRowMapper implements RowMapper<S_xiaotui>{

		@Override
		public S_xiaotui map(ResultSet rs) throws Exception {
			S_xiaotui g=new S_xiaotui();
			g.setSaid(rs.getInt("said"));
			g.setSaodd(rs.getString("saodd"));
			g.setVid(rs.getInt("vid"));
			g.setSatate(rs.getDate("sadate"));
			g.setSaztai(rs.getInt("saztai"));
			g.setSacope(rs.getDouble("sacope"));
			g.setSapaid(rs.getDouble("sapaid"));
			g.setSaagent(rs.getString("saagent"));
			g.setVname(rs.getString("vname"));
			g.setVphone(rs.getString("vphone"));
			g.setVpwd(rs.getInt("Vpwd"));
			g.setVgrade(rs.getString("vgrade"));
			g.setVstate(rs.getInt("vstate"));
			g.setVopera(rs.getString("vopera"));
			g.setVdate(rs.getDate("vdate"));
			return g;
		}
		
	}
	//单据详情
		public List<S_danju_xiangqin> selectByAll3(String saodd) throws Exception{
			String sql="select * from goods g join saletdatails s on g.gid=s.gid where saodd=? order by g.gid desc ";
			return super.executeQuery(sql, new Object[] {saodd}, new danjuxRowMapper());
		}
		class danjuxRowMapper implements RowMapper<S_danju_xiangqin>{

			@Override
			public S_danju_xiangqin map(ResultSet rs) throws Exception {
				S_danju_xiangqin g=new S_danju_xiangqin();
				g.setGid(rs.getInt("gid"));
	            g.setSaodd(rs.getString("saodd"));
	            g.setGname(rs.getString("gname"));
	            g.setGspec(rs.getString("gspec"));
	            g.setSdshu(rs.getInt("sdshu"));
	            g.setGprice(rs.getDouble("gprice"));
				return g;
			}
			
		}
		
}
