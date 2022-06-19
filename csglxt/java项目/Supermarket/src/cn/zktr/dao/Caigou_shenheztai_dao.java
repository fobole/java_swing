package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import cn.zktr.dao.C_danju_dao.danjuRowMapper;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.Cgoods_caigou;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Caigou_shenheztai_dao extends BaseDao{
	//采购进货退货表（purchase）
	public int insertpurchase(Cgoods_caigou g) throws Exception{
		String sql="insert into purchase values(null,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[]{g.getPodd(),g.getSid(),g.getPdate(),g.getPztai(),g.getPcope(),g.getPpaid(),g.getPagent(),});
	}
	
	//商品表（goods）
		public int insertGoods(String gopera,Date pdate,Cgoods_jiujia g) throws Exception{
			String sql="insert into goods values(null,?,?,?,?,?,?,?,?,?)";
			return super.executeUpdate(sql, new Object[]{g.getGname(),g.getGbid(),g.getGprice(),g.getGspec(),g.getCid(),g.getSid(),g.getGztai(),gopera,pdate});
		}
	//查商品编号
			public List<Cgoods_jiujia> selectgid(Cgoods_jiujia g) throws Exception{
					String sql="select * from goods where gname=? and gspec=? and sid=? and cid=?";
					return super.executeQuery(sql, new Object[] {g.getGname(),g.getGspec(),g.getSid(),g.getCid()}, new gidRowMapper());
				}
				class gidRowMapper implements RowMapper<Cgoods_jiujia>{

					@Override
					public Cgoods_jiujia map(ResultSet rs) throws Exception {
						Cgoods_jiujia g=new Cgoods_jiujia();
						g.setGid(rs.getInt("gid"));
						return g;
					}
				}
		
		//采购进货退货详情表（caixaingpurchase）
		public int insertcaixaing(Cgoods_caigou g) throws Exception{
					String sql="insert into caixaingpurchase values(null,?,?,?)";
					return super.executeUpdate(sql, new Object[]{g.getPodd1(),g.getGid1(),g.getXpshu()});
		}
		
		//库存出入库表（come）
		public int insertcome(Cgoods_caigou g) throws Exception{
			String sql="insert into come values(null,?,?,?,?,?,?)";
			return super.executeUpdate(sql, new Object[]{g.getCoodd(),g.getCotype(),g.getCodate(),g.getSaztai(),g.getCoopera(),g.getCodates()});
		}
		//查库存出入库表编号
		public List<Cgoods_caigou> selectByAll(String odd) throws Exception{
			String sql="select * from come where coodd=?";
			return super.executeQuery(sql, new Object[] {odd}, new coidRowMapper());
		}
		class coidRowMapper implements RowMapper<Cgoods_caigou>{

			@Override
			public Cgoods_caigou map(ResultSet rs) throws Exception {
				Cgoods_caigou g=new Cgoods_caigou();
				g.setCoid(rs.getInt("coid"));
				return g;
			}
			
		}
		
		//库存出入库详情表（details）
		public int insertdetails(C_jintuihuo_danju g) throws Exception{
					String sql="insert into details values(null,?,?,?)";
					return super.executeUpdate(sql, new Object[]{g.getCoidd(),g.getGidd(),g.getDeshu()});
		}
		
		//库存表（stock）
		public int insertstock(C_jintuihuo_danju g) throws Exception{
					String sql="insert into stock values(null,?,?,?,?,?,?)";
					return super.executeUpdate(sql, new Object[]{g.getGid(),g.getStshu(),g.getStmax(),g.getStmin(),g.getStopera(),g.getStdate()});
		}
		
		
		//查库存
		public List<Cgoods_caigou> selectkc(int gid) throws Exception{
			String sql="select * from stock where gid=?";
			return super.executeQuery(sql, new Object[] {gid}, new kcRowMapper());
		}
		class kcRowMapper implements RowMapper<Cgoods_caigou>{

			@Override
			public Cgoods_caigou map(ResultSet rs) throws Exception {
				Cgoods_caigou g=new Cgoods_caigou();
				g.setSthu(rs.getInt("stshu"));
				return g;
			}
			
		}
		
		//改库存
	public int updateshu(int stshu,int gid) throws Exception{
		String sql="update stock set stshu=? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
//	public int deleteGoods(int gid) throws Exception{
//		String sql="delete from goods where gid=?";
//		return super.executeUpdate(sql, new Object[]{gid});
//	}
	
	
	
	/**
	 * 新增采购主表
	 * @author ASUS
	 * @throws Exception 
	 *
	 */
	public int insertCaigouzb(Cgoods_caigou g) throws Exception{
		String sql="insert into purchase values(null,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[]{g.getPodd(),g.getSid(),g.getPdate(),g.getPztai(),g.getPcope(),g.getPpaid(),g.getPagent()});
	}
	
	/**
	 * 新增采购详情表
	 * @param cno
	 * @param gid
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int insertCaigouxqb(String podd,int gid,int stshu) throws Exception{
		String sql="insert into caixaingpurchase values(null,?,?,?)";
		return super.executeUpdate(sql, new Object[]{podd,gid,stshu});
	}
	
	/**
	 * 根据商品编号对库存表中的数量进行修改，采购进货累加数量
	 * @throws Exception 
	 */
	public int updateNumber(int gid,int stshu) throws Exception{
		String sql="update stock set stshu=stshu+? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
	
	//改审核状态
	public int updatezt(String podd) throws Exception{
		String sql="update purchase set pztai=0 where podd=? ";
		return super.executeUpdate(sql, new Object[]{podd});
	}
	
	//改整单退货状态
		public int updatezt1(String podd) throws Exception{
			String sql="update purchase set pztai=-1 where podd=? ";
			return super.executeUpdate(sql, new Object[]{podd});
		}
	/**
	 * 根据商品编号对库存表中的数量进行修改，采购进货累加数量
	 * @throws Exception 
	 */
	public int updatetui(int gid,int stshu) throws Exception{
		String sql="update stock set stshu=stshu-? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
//	public int updatetui(int gid,int stshu) throws Exception{
//		String sql="update stock set stshu=stshu-? where gid=?";
//		return super.executeUpdate(sql, new Object[]{stshu,gid});
//	}
	
}
