package cn.zktr.biz;

import java.util.List;

import cn.zktr.dao.Sxiaoshou_dao;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.Sxm4zuo;

public class Sxiaoshou_biz {
	Sxiaoshou_dao cdao=new Sxiaoshou_dao();
	//销售
	public boolean insertxiao(List<Sgoods_jiujia> list,Sgoods_jiujia g,Sgoods_jiujia come) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
				cdao.saletdetails(g.getSaodd(), list.get(i).getGid(), list.get(i).getStshu());
				//修改对应这个商品的库存数量
				cdao.updatexiao(list.get(i).getGid(), list.get(i).getStshu());	
		}
		//新增主表
		cdao.sala(g);
		//库存出入库表（come）
		cdao.insertcome(come);
		return true;
	}
	public boolean insertxiaoshou(List<Sgoods_jiujia> list,Sgoods_jiujia g,Sgoods_jiujia come) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
				cdao.saletdetails(g.getSaodd(), list.get(i).getGid(), list.get(i).getStshu());
				//修改对应这个商品的库存数量
//				cdao.updatexiao(list.get(i).getGid(), list.get(i).getStshu());
			
			
		}
		//新增主表
		cdao.sala(g);
		//库存出入库表（come）
		cdao.insertcome(come);
		return true;
	}
	//销售审核通过
	public boolean insertxiaoshenhe(List<S_danju_xiangqin> list) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
				cdao.updateshen(list.get(i).getSaodd());
				cdao.updatexiao(list.get(i).getGid(), list.get(i).getSdshu());	
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	//销售退货
	//销售
		public boolean inserttui(List<Sgoods_jiujia> list,Sgoods_jiujia g,Sgoods_jiujia come) throws Exception{
			//新增详情表
			for (int i = 0; i < list.size(); i++) {
					cdao.saletdetails(g.getSaodd(), list.get(i).getGid(), list.get(i).getStshu());
					//修改对应这个商品的库存数量
					cdao.updattui(list.get(i).getGid(), list.get(i).getStshu());	
					
					//出入库表
					cdao.de(list.get(i).getGid(), list.get(i).getStshu());
			}
			//新增主表
			cdao.sala(g);
			//库存出入库表（come）
			cdao.insertcome(come);
			return true;
		}
	
	
		
	
	
	//pos销售
		
		public boolean pos(List<Sxm4zuo> list,Sgoods_jiujia g,Sgoods_jiujia come) throws Exception{
			
			for (int i = 0; i < list.size(); i++) {
					cdao.saletdetails(g.getSaodd(), list.get(i).getGid(), list.get(i).getStshu());
					cdao.updatexiao(list.get(i).getGid(), list.get(i).getStshu());
					
			}
			//新增主表
			cdao.sala(g);
			//库存出入库表（come）
			cdao.insertcome(come);
			return true;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
