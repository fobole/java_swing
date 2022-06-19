package cn.zktr.entity;

import java.util.Date;

public class Cgoods_caigou {
	//商品表
	private String gname;
	private double gbid;
	private double gprice;
	private String gspec;
	private int cid;
	private int sidg;
	private int gztai;
	private String gopera;
	private Date gdate;
	//采购进货退货表（purchase）
	private int pid;
	private String podd;
	private int sid;
	private Date pdate;
	private int pztai;
	private double pcope;
	private double ppaid;
	private String pagent;
	//采购进货退货详情表（caixaingpurchase）
	private int xpid;
	private String podd1;
	private int gid1;
	private int xpshu;
	//库存出入库表（come）
	private int coid;
	private String coodd;
	private int cotype;
	private Date codate; 
	private String coopera;
	private int saztai;
	private Date codates;
	
	//库存出入库详情表（details）
		private int deid;
		private String coidd;
		private int gidd;
		private int deshu;
		//库存表（stock）
		private int stid;
		private int gidk;
		private int sthu;
		private int stmax;
		private int stmin;
		private String stopera;
		private Date stdate;
		
		
		
	public int getDeid() {
			return deid;
		}


		public void setDeid(int deid) {
			this.deid = deid;
		}


		public String getCoidd() {
			return coidd;
		}


		public void setCoidd(String coidd) {
			this.coidd = coidd;
		}


		public int getGidd() {
			return gidd;
		}


		public void setGidd(int gidd) {
			this.gidd = gidd;
		}


		public int getDeshu() {
			return deshu;
		}


		public void setDeshu(int deshu) {
			this.deshu = deshu;
		}


		public int getStid() {
			return stid;
		}


		public void setStid(int stid) {
			this.stid = stid;
		}


		public int getGidk() {
			return gidk;
		}


		public void setGidk(int gidk) {
			this.gidk = gidk;
		}


		public int getSthu() {
			return sthu;
		}


		public void setSthu(int sthu) {
			this.sthu = sthu;
		}


		public int getStmax() {
			return stmax;
		}


		public void setStmax(int stmax) {
			this.stmax = stmax;
		}


		public int getStmin() {
			return stmin;
		}


		public void setStmin(int stmin) {
			this.stmin = stmin;
		}


		public String getStopera() {
			return stopera;
		}


		public void setStopera(String stopera) {
			this.stopera = stopera;
		}


		public Date getStdate() {
			return stdate;
		}


		public void setStdate(Date stdate) {
			this.stdate = stdate;
		}


	public int getSaztai() {
		return saztai;
	}


	public void setSaztai(int saztai) {
		this.saztai = saztai;
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


	public Date getCodates() {
		return codates;
	}


	public void setCodates(Date codates) {
		this.codates = codates;
	}


	public Cgoods_caigou() {
		super();
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPodd() {
		return podd;
	}


	public void setPodd(String podd) {
		this.podd = podd;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public Date getPdate() {
		return pdate;
	}


	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}


	public int getPztai() {
		return pztai;
	}


	public void setPztai(int pztai) {
		this.pztai = pztai;
	}


	public double getPcope() {
		return pcope;
	}


	public void setPcope(double pcope) {
		this.pcope = pcope;
	}


	public double getPpaid() {
		return ppaid;
	}


	public void setPpaid(double ppaid) {
		this.ppaid = ppaid;
	}


	public String getPagent() {
		return pagent;
	}
	
	//采购进货退货表（purchase）
	
	

	public Cgoods_caigou(String podd, int sid, Date pdate, double pcope, double ppaid, String pagent) {
		super();
		this.podd = podd;
		this.sid = sid;
		this.pdate = pdate;
		this.pcope = pcope;
		this.ppaid = ppaid;
		this.pagent = pagent;
	}
	public Cgoods_caigou(String podd, int sid, Date pdate, int pztai, double pcope, double ppaid, String pagent) {
		super();
		this.podd = podd;
		this.sid = sid;
		this.pdate = pdate;
		this.pztai = pztai;
		this.pcope = pcope;
		this.ppaid = ppaid;
		this.pagent = pagent;
	}


	//商品表
	public Cgoods_caigou(String gname, double gbid, double gprice, String gspec, int cid, int sidg, int gztai,
			String gopera, Date gdate) {
		super();
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sidg = sidg;
		this.gztai = gztai;
		this.gopera = gopera;
		this.gdate = gdate;
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


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public int getSidg() {
		return sidg;
	}


	public void setSidg(int sidg) {
		this.sidg = sidg;
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


	public void setPagent(String pagent) {
		this.pagent = pagent;
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

	//采购进货退货详情表（caixaingpurchase）
	public Cgoods_caigou(int xpid, String podd1, int gid1, int xpshu) {
		super();
		this.xpid = xpid;
		this.podd1 = podd1;
		this.gid1 = gid1;
		this.xpshu = xpshu;
	}


	public Cgoods_caigou(String podd1, int gid1, int xpshu) {
		super();
		this.podd1 = podd1;
		this.gid1 = gid1;
		this.xpshu = xpshu;
	}
	//库存出入库表（come）
	public Cgoods_caigou(String coodd, int cotype, Date codate, String coopera, int saztai, Date codates) {
		super();
		this.coodd = coodd;
		this.cotype = cotype;
		this.codate = codate;
		this.coopera = coopera;
		this.saztai = saztai;
		this.codates = codates;
	}

	//库存表（stock）
	public Cgoods_caigou(int gidk, int sthu, int stmax, int stmin, String stopera, Date stdate) {
		super();
		this.gidk = gidk;
		this.sthu = sthu;
		this.stmax = stmax;
		this.stmin = stmin;
		this.stopera = stopera;
		this.stdate = stdate;
	}
	
	
	
	
	
	
	
	
}
