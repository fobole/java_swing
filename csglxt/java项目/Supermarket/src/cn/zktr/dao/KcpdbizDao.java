package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import cn.zktr.dao.Cgoods_dao.GoodsRowMapper;
import cn.zktr.dao.KkcpdDao1.Kkcpd2RowMapper;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Kbsby1;
import cn.zktr.entity.Kbsby2;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd3;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class KcpdbizDao extends BaseDao{
	public int inventory(String dh,Date rq,String name,String czy,int tiao,int stshu) throws Exception{
		String sql="insert into inventory values(null,?,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[]{dh,rq,name,new Date(),tiao,stshu});
	}
	public int checkf(String dh,int gid,int chkushu,int chremarks) throws Exception{
		String sql="insert into checkf values(null,?,?,?,?,NULL)";
		return super.executeUpdate(sql, new Object[]{dh,gid,chkushu,chremarks});
	}
	//报损报溢
	
	public int overflow(Kbsby1 g) throws Exception{
		String sql="insert into overflow VALUES(null,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[]{g.getOodd(),g.getOdate(),g.getZtai(),g.getOagent(),g.getObeizhu()});
	}
	//查报损报溢编号
	public List<Kbsby1> select(String oodd) throws Exception{
		String sql="select * from overflow where oodd=? ";
		return super.executeQuery(sql,new Object[] {oodd}, new GoodsRowMapper());
	}
	class GoodsRowMapper implements RowMapper<Kbsby1>{

		@Override
		public Kbsby1 map(ResultSet rs) throws Exception {
			Kbsby1 g=new Kbsby1();
			g.setOid(rs.getInt("oid"));
			g.setOodd(rs.getNString("oodd"));
			return g;
		}
		
	}
	//查盘点详情表
	public List<Kkcpd3> selectByAll(String dh) throws Exception{
		String sql="select * from goods g INNER JOIN checkf c INNER JOIN stock s on g.gid=c.gid and g.gid=s.gid where c.lid=? ";
		return super.executeQuery(sql, new Object[] {dh}, new Kkcpd2RowMapper());
	}
	class Kkcpd2RowMapper implements RowMapper<Kkcpd3>{

		@Override
		public Kkcpd3 map(ResultSet rs) throws Exception {
			Kkcpd3 g=new Kkcpd3();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGbid(rs.getInt("gbid"));
			g.setGprice(rs.getDouble("gprice"));
			g.setStshu(rs.getInt("stshu"));
			g.setGspec(rs.getNString("gspec"));
			g.setChpanshu(rs.getInt("chpanshu"));
			return g;
		}
		
	}
	
	//报损报溢详情表
	public List<Kbsby2> selectByAllbao(String dh) throws Exception{
		String sql="select * from goods g INNER JOIN reporting r INNER JOIN stock s on g.gid=r.gid and g.gid=s.gid where r.oid=?";
		
		return super.executeQuery(sql, new Object[] {dh}, new Kkcpd2bRowMapper());
	}
	class Kkcpd2bRowMapper implements RowMapper<Kbsby2>{

		@Override
		public Kbsby2 map(ResultSet rs) throws Exception {
			Kbsby2 g=new Kbsby2();
			g.setGid(rs.getInt("gid"));
			g.setGname(rs.getString("gname"));
			g.setGprice(rs.getDouble("gprice"));
			g.setStshu(rs.getInt("stshu"));
			g.setGspec(rs.getNString("gspec"));
			
			return g;
		}
		
	}
	
	
	
	
	
	
	//报损报溢详表
	public int repoting(String oid,int gid,int stshu) throws Exception{
		String sql="insert into reporting VALUES(NULL,?,?,?)";
		return super.executeUpdate(sql, new Object[]{oid,gid,stshu});
	}
	
	//报损
	public int updateshun(int gid,int stshu) throws Exception{
		String sql="update stock set stshu=stshu-? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	//报溢
	public int updateyi(int gid,int stshu) throws Exception{
			String sql="update stock set stshu=stshu+? where gid=?";
			return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
	//盘点
		public int updatepan(int gid,int stshu) throws Exception{
				String sql="update stock set stshu=? where gid=?";
				return super.executeUpdate(sql, new Object[]{stshu,gid});
		}
	
}
