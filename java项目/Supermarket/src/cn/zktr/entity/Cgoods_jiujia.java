package cn.zktr.entity;

import java.util.Date;

public class Cgoods_jiujia {
		private int gid;
		private String gname;
		private double gbid;
		private double gprice;
		private String gspec;
		private int cid;
		private String ctype;
		private int cstate;
		private int sid;
		private int gztai;
		private String gopera;
		private Date gdate;
		private int stid;
		private int stshu;
		private String sbusiness;
		private int sztai;
		private int kucun;
		
		//采购进货退货详情表（caixaingpurchase）
		private int xpid;
		private String podd1;
		private int gid1;
		private int xpshu;
		
		
		
		public int getKucun() {
			return kucun;
		}
		public void setKucun(int kucun) {
			this.kucun = kucun;
		}
		public int getXpid() {
			return xpid;
		}
		public void setXpid(int xpid) {
			this.xpid = xpid;
		}
		public String getPodd1() {
			return podd1;
		}
		public void setPodd1(String podd1) {
			this.podd1 = podd1;
		}
		public int getGid1() {
			return gid1;
		}
		public void setGid1(int gid1) {
			this.gid1 = gid1;
		}
		public int getXpshu() {
			return xpshu;
		}
		public void setXpshu(int xpshu) {
			this.xpshu = xpshu;
		}
		public String getSbusiness() {
			return sbusiness;
		}
		public void setSbusiness(String sbusiness) {
			this.sbusiness = sbusiness;
		}
		public int getSztai() {
			return sztai;
		}
		public void setSztai(int sztai) {
			this.sztai = sztai;
		}
		public int getGid() {
			return gid;
		}
		public void setGid(int gid) {
			this.gid = gid;
		}
		public String getGname() {
			return gname;
		}
		public void setGname(String gname) {
			this.gname = gname;
		}
		public double getGbid() {
			return gbid;
		}
		public void setGbid(double gbid) {
			this.gbid = gbid;
		}
		public double getGprice() {
			return gprice;
		}
		public void setGprice(double gprice) {
			this.gprice = gprice;
		}
		public String getGspec() {
			return gspec;
		}
		public void setGspec(String gspec) {
			this.gspec = gspec;
		}
		public int getCid1() {
			return cid;
		}
		public void setCid1(int cid1) {
			this.cid = cid1;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public int getGztai() {
			return gztai;
		}
		public void setGztai(int gztai) {
			this.gztai = gztai;
		}
		public String getGopera() {
			return gopera;
		}
		public void setGopera(String gopera) {
			this.gopera = gopera;
		}
		public Date getGdate() {
			return gdate;
		}
		public void setGdate(Date gdate) {
			this.gdate = gdate;
		}
		public int getStid() {
			return stid;
		}
		public void setStid(int stid) {
			this.stid = stid;
		}
		public int getStshu() {
			return stshu;
		}
		public void setStshu(int stshu) {
			this.stshu = stshu;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCtype() {
			return ctype;
		}
		public void setCtype(String ctype) {
			this.ctype = ctype;
		}
		public int getCstate() {
			return cstate;
		}
		public void setCstate(int cstate) {
			this.cstate = cstate;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int cid, int sid,
				int gztai, String gopera, Date gdate, int stid, int stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.cid = cid;
			this.sid = sid;
			this.gztai = gztai;
			this.gopera = gopera;
			this.gdate = gdate;
			this.stid = stid;
			this.stshu = stshu;
		}
		public Cgoods_jiujia() {
			super();
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
		}
		
		
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int stshu, int kucun) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
			this.kucun = kucun;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int stshu, String podd1) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
			this.podd1 = podd1;
		}
		public Cgoods_jiujia(String gname, double gbid, double gprice, String gspec, int stshu) {
			super();
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int cid, String ctype,
				int cstate, int sid, int gztai, String gopera, Date gdate, int stid, int stshu, String sbusiness,
				int sztai) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.cid = cid;
			this.ctype = ctype;
			this.cstate = cstate;
			this.sid = sid;
			this.gztai = gztai;
			this.gopera = gopera;
			this.gdate = gdate;
			this.stid = stid;
			this.stshu = stshu;
			this.sbusiness = sbusiness;
			this.sztai = sztai;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int cid, int sid,
				int stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.cid = cid;
			this.sid = sid;
			this.stshu = stshu;
		}
		public Cgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, String ctype, int xpshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.ctype = ctype;
			this.xpshu = xpshu;
		}
		
		
}
