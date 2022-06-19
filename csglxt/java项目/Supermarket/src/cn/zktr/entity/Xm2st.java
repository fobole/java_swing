package cn.zktr.entity;

import java.util.Date;

public class Xm2st {
	public Xm2st(int gid, String gname, double gbid, double gprice, String gspec, int cid, int sid, int sztai,
			String gopera, Date gdate) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sid = sid;
		this.sztai = sztai;
		this.gopera = gopera;
		this.gdate = gdate;
	}
	private int  gid;
	private String gname;
	private double gbid;
	private double gprice;
	private String gspec;
	private int cid;
	private int sid;
	private int sztai;
	private String gopera;
	private Date gdate;
	public Xm2st( String gname, double gbid, double gprice, String gspec, int cid, int sid, int sztai,
			String gopera, Date gdate) {
		super();
		
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sid = sid;
		this.sztai = sztai;
		this.gopera = gopera;
		this.gdate = gdate;
	}
	
	@Override
	public String toString() {
		return "Xm2st [cid=" + cid + ", gbid=" + gbid + ", gdate=" + gdate + ", gid=" + gid + ", gname=" + gname
				+ ", gopera=" + gopera + ", gprice=" + gprice + ", gspec=" + gspec + ", sid=" + sid + ", sztai=" + sztai
				+ "]";
	}
	public Xm2st(String gname, double gbid, double gprice, String gspec, int cid, int sid, int sztai, String gopera) {
		super();
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sid = sid;
		this.sztai = sztai;
		this.gopera = gopera;
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
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSztai() {
		return sztai;
	}
	public void setSztai(int sztai) {
		this.sztai = sztai;
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

	public Xm2st(int gid, String gname, double gbid, double gprice, String gspec, int cid, int sid, int sztai,
			String gopera) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sid = sid;
		this.sztai = sztai;
		this.gopera = gopera;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
