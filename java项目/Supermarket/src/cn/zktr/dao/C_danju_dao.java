package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Cgoods_dao.GoodsRowMapper;
import cn.zktr.entity.C_danju_xiangqin;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_danju_dao extends BaseDao{
	
	//采购单据查询 ----- pztai=0 and
	public List<C_jintuihuo_danju> selectByAll() throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid  where 1=1 order by p.pid desc";
		return super.executeQuery(sql, null, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju> selectByAll(int cai) throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid join come co on p.podd=co.coodd where co.cotype=? order by p.pid desc";
		return super.executeQuery(sql, new Object[] {cai}, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju> selectByAll(int cai,String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid join come co on p.podd=co.coodd where co.cotype=? ");
		if(parma!=null){
			sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		
		return super.executeQuery(sql.toString(),  new Object[] {cai}, new danjuRowMapper());
		   
	}
	class danjuRowMapper implements RowMapper<C_jintuihuo_danju>{

		@Override
		public C_jintuihuo_danju map(ResultSet rs) throws Exception {
			C_jintuihuo_danju g=new C_jintuihuo_danju();
			g.setPid(rs.getInt("pid"));
			g.setPodd(rs.getString("podd"));
			g.setPdate(rs.getTimestamp("pdate"));
//			System.out.println(rs.getDate("pdate"));
			g.setPztai(rs.getInt("pztai"));
			g.setPcope(rs.getDouble("pcope"));
			g.setPpaid(rs.getInt("ppaid"));
			g.setPagent(rs.getString("pagent"));
			g.setSid(rs.getInt("sid"));
			g.setSbusiness(rs.getString("sbusiness"));
			g.setSname(rs.getString("sname"));
			g.setSphone(rs.getString("sphone"));
			g.setSaddress(rs.getString("saddress"));
			g.setSztai(rs.getInt("sztai"));
			return g;
		}
		
	}
	//单据详情
	public List<C_danju_xiangqin> selectByAll2(String podd) throws Exception{
		String sql="select * from caixaingpurchase c join goods g on c.gid=g.gid where podd=? order by g.gid desc ";
		return super.executeQuery(sql, new Object[] {podd}, new danjuxRowMapper());
	}
	class danjuxRowMapper implements RowMapper<C_danju_xiangqin>{

		@Override
		public C_danju_xiangqin map(ResultSet rs) throws Exception {
			C_danju_xiangqin g=new C_danju_xiangqin();
			g.setXpid(rs.getInt("xpid"));
			g.setXpodd(rs.getString("podd"));
			g.setXpshu(rs.getInt("xpshu"));
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setGztai(rs.getInt("sztai"));

			return g;
		}
		
	}
	//整单退货
	public List<C_jintuihuo_danju> zhengtui(String a) throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=0 and co.cotype=0 and s.sbusiness=? order by p.pid desc ";
		return super.executeQuery(sql, new Object[] {a}, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju> zhengtui(String a,String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=0 and co.cotype=0 and s.sbusiness=? ");
		if(parma!=null){
			sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		return super.executeQuery(sql.toString(),  new Object[] {a}, new danjuRowMapper());
		   
	}
	
	//未审核单据查询
	public List<C_jintuihuo_danju> weishenhe() throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=1 and co.cotype=0 order by p.pid desc ";
		return super.executeQuery(sql, null, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju> weishenhe(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=1 and co.cotype=0 ");
		if(parma!=null){
			sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		return super.executeQuery(sql.toString(), null, new weishenhejuRowMapper());
		   
	}
	class weishenhejuRowMapper implements RowMapper<C_jintuihuo_danju>{

		@Override
		public C_jintuihuo_danju map(ResultSet rs) throws Exception {
			C_jintuihuo_danju g=new C_jintuihuo_danju();
			g.setPid(rs.getInt("pid"));
			g.setPodd(rs.getString("podd"));
			g.setPdate(rs.getDate("pdate"));
			g.setPztai(rs.getInt("pztai"));
			g.setPcope(rs.getDouble("pcope"));
			g.setPpaid(rs.getInt("ppaid"));
			g.setPagent(rs.getString("pagent"));
			g.setSid(rs.getInt("sid"));
			g.setSbusiness(rs.getString("sbusiness"));
			g.setSname(rs.getString("sname"));
			g.setSphone(rs.getString("sphone"));
			g.setSaddress(rs.getString("saddress"));
			g.setSztai(rs.getInt("sztai"));
			return g;
		}
		
	}
	//单据详情
	public List<C_danju_xiangqin> weishenhe_xiang(String podd) throws Exception{
		String sql="select * from caixaingpurchase c join goods g on c.gid=g.gid where podd=? order by g.gid desc ";
		return super.executeQuery(sql, new Object[] {podd}, new weishenhe_xiangRowMapper());
	}
	class weishenhe_xiangRowMapper implements RowMapper<C_danju_xiangqin>{

		@Override
		public C_danju_xiangqin map(ResultSet rs) throws Exception {
			C_danju_xiangqin g=new C_danju_xiangqin();
			g.setXpid(rs.getInt("xpid"));
			g.setXpshu(rs.getInt("xpshu"));
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setGztai(rs.getInt("sztai"));

			return g;
		}
		
	}
	
	//????
	public List<C_jintuihuo_danju> weishenhe_xiang(int a) throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid where pztai=? order by p.pid desc";
		return super.executeQuery(sql, new Object[] {a}, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju> weishenhe_xiang(int a,String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid  where pztai=? ");
		if(parma!=null){
			sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		return super.executeQuery(sql.toString(),  new Object[] {a}, new danjuRowMapper());
		   
	}
	
	
	
	
	
	//退货查
	//单据查询
		public List<C_jintuihuo_danju> tuihuodan() throws Exception{
			String sql="select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=1 and co.cotype=1 order by p.pid desc";
			return super.executeQuery(sql, null, new danjuRowMapper());
		}
		public List<C_jintuihuo_danju> tuihuodan(String parma) throws Exception{
			//字符串拼接
			StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid join come co on co.coodd=p.podd where pztai=1 and co.cotype=1 ");
			if(parma!=null){
				sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
			}
			sql.append(" order by p.pid desc");
			return super.executeQuery(sql.toString(), null, new danjutuiRowMapper());
			   
		}
		class danjutuiRowMapper implements RowMapper<C_jintuihuo_danju>{

			@Override
			public C_jintuihuo_danju map(ResultSet rs) throws Exception {
				C_jintuihuo_danju g=new C_jintuihuo_danju();
				g.setPid(rs.getInt("pid"));
				g.setPodd(rs.getString("podd"));
				g.setPdate(rs.getDate("pdate"));
				g.setPztai(rs.getInt("pztai"));
				g.setPcope(rs.getDouble("pcope"));
				g.setPpaid(rs.getInt("ppaid"));
				g.setPagent(rs.getString("pagent"));
				g.setSid(rs.getInt("sid"));
				g.setSbusiness(rs.getString("sbusiness"));
				g.setSname(rs.getString("sname"));
				g.setSphone(rs.getString("sphone"));
				g.setSaddress(rs.getString("saddress"));
				g.setSztai(rs.getInt("sztai"));
				return g;
			}
			
		}
		//单据详情
		public List<C_danju_xiangqin> tuihuodanxiang(String podd) throws Exception{
			String sql="select * from caixaingpurchase c join goods g on c.gid=g.gid where podd=? order by g.gid desc ";
			return super.executeQuery(sql, new Object[] {podd}, new danjuxiangRowMapper());
		}
		class danjuxiangRowMapper implements RowMapper<C_danju_xiangqin>{

			@Override
			public C_danju_xiangqin map(ResultSet rs) throws Exception {
				C_danju_xiangqin g=new C_danju_xiangqin();
				g.setXpid(rs.getInt("xpid"));
				g.setXpshu(rs.getInt("xpshu"));
				g.setGid(rs.getInt("gid"));
				g.setGname(rs.getString("gname"));
				g.setGbid(rs.getDouble("gbid"));
				g.setGprice(rs.getDouble("gprice"));
				g.setGspec(rs.getString("gspec"));
				g.setGztai(rs.getInt("sztai"));

				return g;
			}
			
		}
}
