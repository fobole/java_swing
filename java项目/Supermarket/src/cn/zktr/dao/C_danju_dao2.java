package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.dao.Cgoods_dao.GoodsRowMapper;
import cn.zktr.entity.C_danju_xiangqin;
import cn.zktr.entity.C_danju_xiangqin2;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.C_jintuihuo_danju2;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_danju_dao2 extends BaseDao{
	public List<C_jintuihuo_danju2> selectByAll() throws Exception{
		String sql="select * from purchase p join supplier s on p.sid=s.sid order by p.pid desc";
		return super.executeQuery(sql, null, new danjuRowMapper());
	}
	public List<C_jintuihuo_danju2> selectByAll(String parma) throws Exception{
		//字符串拼接
		StringBuffer sql=new StringBuffer("select * from purchase p join supplier s on p.sid=s.sid where 1=1");
		if(parma!=null){
			sql.append(" and (p.podd like '%"+parma+"%' or s.sbusiness like '%"+parma+"%')");
		}
		sql.append(" order by p.pid desc");
		System.out.println(sql.toString());
		return super.executeQuery(sql.toString(), null, new danjuRowMapper());
		   
	}
	class danjuRowMapper implements RowMapper<C_jintuihuo_danju2>{

		@Override
		public C_jintuihuo_danju2 map(ResultSet rs) throws Exception {
			C_jintuihuo_danju2 g=new C_jintuihuo_danju2();
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
	public List<C_danju_xiangqin2> selectByAll2() throws Exception{
		String sql="select * from caixaingpurchase c join goods g on c.gid=g.gid join purchase p on c.podd=p.podd order by g.gid desc";
		return super.executeQuery(sql, null, new danjuxRowMapper());
	}
	class danjuxRowMapper implements RowMapper<C_danju_xiangqin2>{

		@Override
		public C_danju_xiangqin2 map(ResultSet rs) throws Exception {
			C_danju_xiangqin2 g=new C_danju_xiangqin2();
			g.setXpid(rs.getInt("xpid"));
			g.setXpshu(rs.getInt("xpshu"));
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getDouble("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setGspec(rs.getString("gspec"));
			g.setGztai(rs.getInt("sztai"));
			g.setPcope(rs.getDouble("pcope"));
			return g;
		}
		
	}
}
