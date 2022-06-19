package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;

import cn.zktr.dao.Sgoods_dao.GoodsRowMapper;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.Sgoods_zengjia;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class Sxiaoshou_dao extends BaseDao{
	/**
	 * 销售主表
	 * @author ASUS
	 * @throws Exception 
	 *
	 */
	public int sala(Sgoods_jiujia g) throws Exception{
		String sql="insert into sale values(null,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, new Object[]{g.getSaodd(),g.getVid(),g.getSadate(),g.getSaztai(),g.getSacope(),g.getSapaid(),g.getSaagent()});
	}
	
	/**
	 * 销售详情表
	 * @param cno
	 * @param gid
	 * @param number
	 * @return
	 * @throws Exception
	 */
	public int saletdetails(String cno,int gid,int number) throws Exception{
		String sql="insert into saletdatails values(null,?,?,?)";
		return super.executeUpdate(sql, new Object[]{cno,gid,number});
	}
	
	
	/**
	 * 根据商品编号对库存表中的数量进行修改
	 * @throws Exception 
	 */
	public int updatexiao(int gid,int stshu) throws Exception{
		String sql="update stock set stshu=stshu-? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
	//销退
	public int updattui(int gid,int stshu) throws Exception{
		String sql="update stock set stshu=stshu+? where gid=?";
		return super.executeUpdate(sql, new Object[]{stshu,gid});
	}
	
	//出入库数
	public int de(int gid,int stshu) throws Exception{
		String sql="insert into details values(null,?,?,?)";
		return super.executeUpdate(sql, new Object[]{1,gid,stshu});
	}
	
	//改为审核状态
	public int updateshen(String saodd) throws Exception{
		String sql="update sale set saztai=0 where saodd=?";
		return super.executeUpdate(sql, new Object[]{saodd});
	}
	
	//库存出入库表（come）
			public int insertcome(Sgoods_jiujia g) throws Exception{
				String sql="insert into come values(null,?,?,?,?,?,?)";
				return super.executeUpdate(sql, new Object[]{g.getCoodd(),g.getCotype(),g.getCodate(),g.getSaztai(),g.getCoopera(),g.getCodates()});
			}
	
	//查vip
			public List<Sgoods_zengjia> selectByAll() throws Exception{
				String sql="select * from vip where vstate=0";
				return super.executeQuery(sql, null, new GoodsRowMapper());
			}
			class GoodsRowMapper implements RowMapper<Sgoods_zengjia>{

				@Override
				public Sgoods_zengjia map(ResultSet rs) throws Exception {
					Sgoods_zengjia g=new Sgoods_zengjia();

					g.setVid(rs.getInt("vid"));
					g.setVname(rs.getString("vname"));
					return g;
				}
			}	
	
	
}
