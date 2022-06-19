package cn.zktr.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.entity.Caigou_gongyingshang;
import cn.zktr.entity.Caigou_ygb;
import cn.zktr.entity.Cyonghui_denglu;
import cn.zktr.utils.BaseDao;
import cn.zktr.utils.RowMapper;

public class C_TypeDao extends BaseDao{
	/**
	 * 查询所有的类别
	 * @return
	 * @throws Exception 
	 */
	public List<C_kucun_biandong> selectAll() throws Exception{
		String sql="select * from category";
		return super.executeQuery(sql, null, new TypeRowmapper());
	}
	
	class TypeRowmapper implements RowMapper<C_kucun_biandong>{

		@Override
		public C_kucun_biandong map(ResultSet rs) throws Exception {
			C_kucun_biandong g=new C_kucun_biandong();
			g.setCid(rs.getInt("cid"));
			g.setCtype(rs.getString("ctype"));
			g.setCstate(rs.getInt("cstate"));
			return g;
		}
		
	}
	//供应商
	public List<Caigou_gongyingshang> selectAll1() throws Exception{
		String sql="select * from supplier where sztai=0";
		return super.executeQuery(sql, null, new gysRowmapper());
	}
	
	//供应商tui
		public List<Caigou_gongyingshang> selectAller() throws Exception{
			String sql="select * from supplier ";
			return super.executeQuery(sql, null, new gysRowmapper());
		}
	class gysRowmapper implements RowMapper<Caigou_gongyingshang>{

		@Override
		public Caigou_gongyingshang map(ResultSet rs) throws Exception {
			Caigou_gongyingshang g=new Caigou_gongyingshang();
			g.setSid(rs.getInt("sid"));
			g.setSbusiness(rs.getString("sbusiness"));
			g.setSztai(rs.getInt("sztai"));
			return g;
		}
		
	}
	//经办人
		public List<Cyonghui_denglu> selectAll2() throws Exception{
			String sql="select * from employee";
			return super.executeQuery(sql, null, new jbrRowmapper());
		}
		
		class jbrRowmapper implements RowMapper<Cyonghui_denglu>{

			@Override
			public Cyonghui_denglu map(ResultSet rs) throws Exception {
				Cyonghui_denglu g=new Cyonghui_denglu();
				g.setEname(rs.getString("ename"));
				return g;
			}
			
		}
}
