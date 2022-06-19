package cn.zktr.entity;

import java.util.Date;

public class Sgoods_jiujia {
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
		private double zsj;
		//销售主表
		private String saodd;
		private int vid;
		private Date sadate;
		private int saztai;	
		private double sacope;
		private double sapaid;
		private String saagent;
		
		//库存出入库表（come）
		private int coid;
		private String coodd;
		private int cotype;
		private Date codate; 
		private String coopera;
		private int saztaic;
		private Date codates;
		
		
		private int sdid;
		private int sdshu;
		
		
		
		
		public int getSdid() {
			return sdid;
		}
		public void setSdid(int sdid) {
			this.sdid = sdid;
		}
		public int getSdshu() {
			return sdshu;
		}
		public void setSdshu(int sdshu) {
			this.sdshu = sdshu;
		}
		public int getCoid() {
			return coid;
		}
		public void setCoid(int coid) {
			this.coid = coid;
		}
		public String getCoodd() {
			return coodd;
		}
		public void setCoodd(String coodd) {
			this.coodd = coodd;
		}
		public int getCotype() {
			return cotype;
		}
		public void setCotype(int cotype) {
			this.cotype = cotype;
		}
		public Date getCodate() {
			return codate;
		}
		public void setCodate(Date codate) {
			this.codate = codate;
		}
		public String getCoopera() {
			return coopera;
		}
		public void setCoopera(String coopera) {
			this.coopera = coopera;
		}
		public int getSaztaic() {
			return saztaic;
		}
		public void setSaztaic(int saztaic) {
			this.saztaic = saztaic;
		}
		public Date getCodates() {
			return codates;
		}
		public void setCodates(Date codates) {
			this.codates = codates;
		}
		public Sgoods_jiujia(String coodd, int cotype, Date codate, String coopera, int saztaic, Date codates) {
			super();
			this.coodd = coodd;
			this.cotype = cotype;
			this.codate = codate;
			this.coopera = coopera;
			this.saztaic = saztaic;
			this.codates = codates;
		}
		
		public Sgoods_jiujia(String saodd, int vid, Date sadate, int saztai, double sacope, double sapaid,
				String saagent) {
			super();
			this.saodd = saodd;
			this.vid = vid;
			this.sadate = sadate;
			this.saztai = saztai;
			this.sacope = sacope;
			this.sapaid = sapaid;
			this.saagent = saagent;
		}
		public String getSaodd() {
			return saodd;
		}
		public void setSaodd(String saodd) {
			this.saodd = saodd;
		}
		public int getVid() {
			return vid;
		}
		public void setVid(int vid) {
			this.vid = vid;
		}
		public Date getSadate() {
			return sadate;
		}
		public void setSadate(Date sadate) {
			this.sadate = sadate;
		}
		public int getSaztai() {
			return saztai;
		}
		public void setSaztai(int saztai) {
			this.saztai = saztai;
		}
		public double getSacope() {
			return sacope;
		}
		public void setSacope(double sacope) {
			this.sacope = sacope;
		}
		public double getSapaid() {
			return sapaid;
		}
		public void setSapaid(double sapaid) {
			this.sapaid = sapaid;
		}
		public String getSaagent() {
			return saagent;
		}
		public void setSaagent(String saagent) {
			this.saagent = saagent;
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
		public Sgoods_jiujia(double zsj) {
			super();
			this.zsj = zsj;
		}
		public double getZsj() {
			return zsj;
		}
		public void setZsj(double zsj) {
			this.zsj = zsj;
		}
		public Sgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int cid, int sid,
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
		public Sgoods_jiujia(String gname, double gprice, String gspec, int stshu, double zsj) {
			super();
			this.gname = gname;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
			this.zsj = zsj;
		}
		public Sgoods_jiujia() {
			super();
		}
		public Sgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
		}
		public Sgoods_jiujia(int gid, String gname, double gbid, double gprice, String gspec, int stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
		}
		public Sgoods_jiujia(String gname, double gbid, double gprice, String gspec, int stshu) {
			super();
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
		}
		public Sgoods_jiujia(int gid,String gname, double gbid, double gprice, String gspec, int stshu, int sdshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
			this.sdshu = sdshu;
		}
		public Sgoods_jiujia(String gname, double gprice, String gspec, int stshu, double zsj, int sdshu) {
			super();
			this.gname = gname;
			this.gprice = gprice;
			this.gspec = gspec;
			this.stshu = stshu;
			this.zsj = zsj;
			this.sdshu = sdshu;
		}
		
		
		
}
