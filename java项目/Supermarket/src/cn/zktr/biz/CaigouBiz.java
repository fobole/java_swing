package cn.zktr.biz;

import java.util.Date;
import java.util.List;


import cn.zktr.dao.Caigou_shenheztai_dao;
import cn.zktr.entity.C_danju_xiangqin;
import cn.zktr.entity.Cgoods_caigou;
import cn.zktr.entity.Cgoods_jiujia;

public class CaigouBiz {
	Caigou_shenheztai_dao cdao=new Caigou_shenheztai_dao();
	//进货
	public boolean insertCaigou(List<Cgoods_jiujia> list,Cgoods_caigou g,Cgoods_caigou come) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
				cdao.insertCaigouxqb(g.getPodd(), list.get(i).getGid(), list.get(i).getStshu());
				//修改对应这个商品的库存数量
				cdao.updateNumber(list.get(i).getGid(), list.get(i).getStshu());
			
			
		}
		//新增主表
		cdao.insertCaigouzb(g);
		//库存出入库表（come）
		cdao.insertcome(come);
		return true;
	}
	public boolean insertCaigou2(List<Cgoods_jiujia> list,Cgoods_caigou g,Cgoods_caigou come) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
			cdao.insertCaigouxqb(g.getPodd(), list.get(i).getGid(), list.get(i).getStshu());
			
		}
		//新增主表
		cdao.insertCaigouzb(g);
		//库存出入库表（come）
		cdao.insertcome(come);
		return true;
	}
	//改状态加库存
	public boolean insertzt(List<C_danju_xiangqin> list2) throws Exception{
		//新增详情表
		for (int i = 0; i < list2.size(); i++) {
			cdao.updateNumber(list2.get(i).getGid(), list2.get(i).getXpshu());
			
		}
		return true;
	}
	
	
	
	//退货
	public boolean inserttuihuo(List<Cgoods_jiujia> list,Cgoods_caigou g,Cgoods_caigou come) throws Exception{
		//新增详情表
		for (int i = 0; i < list.size(); i++) {
		
				cdao.insertCaigouxqb(g.getPodd(), list.get(i).getGid(), list.get(i).getStshu());
				//修改对应这个商品的库存数量
				cdao.updatetui(list.get(i).getGid(), list.get(i).getStshu());
			
			
		}
		//新增主表
		cdao.insertCaigouzb(g);
		//库存出入库表（come）
		cdao.insertcome(come);
		return true;
	}

		public boolean inserttuiwei(List<Cgoods_jiujia> list,Cgoods_caigou g,Cgoods_caigou come) throws Exception{
			//新增详情表
			for (int i = 0; i < list.size(); i++) {
					cdao.insertCaigouxqb(g.getPodd(), list.get(i).getGid(), list.get(i).getStshu());
					
				
				
			}
			//新增主表
			cdao.insertCaigouzb(g);
			//库存出入库表（come）
			cdao.insertcome(come);
			return true;
		}
		
		//改状态加库存
		public boolean insertzttui(List<C_danju_xiangqin> list2) throws Exception{
			//新增详情表
			for (int i = 0; i < list2.size(); i++) {
				cdao.updatetui(list2.get(i).getGid(), list2.get(i).getXpshu());
				
			}
			return true;
		}

}
