package cn.zktr.biz;

import java.util.Date;
import java.util.List;


import cn.zktr.dao.KcpdbizDao;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Kbsby1;
import cn.zktr.entity.Kkcpd3;

public class Kcpd1biz {
	KcpdbizDao cdao=new KcpdbizDao();
	
	public boolean inventory(List<Kkcpd3> list,String dh,Date rq,String name,String czy,int tiao,int stshu) throws Exception{
			//新增主表
		for (int i = 0; i < list.size(); i++) {
			cdao.checkf(dh, list.get(i).getGid(), list.get(i).getStshu(), list.get(i).getStshu());
			cdao.updatepan(list.get(i).getGid(), list.get(i).getStshu());
			
		}
		cdao.inventory(dh, rq, name, czy,tiao,stshu);
		return true;
	}
	
	//报损报溢
	
	public boolean overflow(List<Cgoods_jiujia> listcai,Kbsby1 g) throws Exception{
		cdao.overflow(g);
	for (int i = 0; i < listcai.size(); i++) {
//		System.out.println(g.getOid());
		cdao.repoting(g.getOodd(),listcai.get(i).getGid(),listcai.get(i).getStshu());
//		System.out.println(listcai.get(i).getStshu());
		if(g.getZtai()==0) {
			cdao.updateshun(listcai.get(i).getGid(), listcai.get(i).getStshu());

		}else if(g.getZtai()==1) {
//			cdao.updateyi(listcai.get(i).getGid(), listcai.get(i).getStshu());
		
		}
		
		
		
	}
	
	return true;
}
	

}
