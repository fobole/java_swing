package cn.zktr.entity;

import java.util.Date;

public class Kkcpd3 {
	private int chid;
	private int lid;
	private int gid;
	private int chkushu;
	private int chpanshu;
	private String chremaarks;
	private int stid;
	private int stshu;
	private int stmax;
	private int stmin;
	private String stopera;
	private Date stdate;
	private String gname;
	private Double gprice;
	private String gspec;
	private int cid;
	private int sid;
	private String gopera;
	private Date gdate;
	private String ctype;
	private int cstate;
	private int gbid;
	private int lshu;
	public Kkcpd3(int chid, int lid, int gid, int chkushu, int chpanshu, String chremaarks, int stid, int stshu,
			int stmax, int stmin, String stopera, Date stdate, String gname, Double gprice, String gspec, int cid,
			int sid, String gopera, Date gdate, String ctype, int cstate,int gbid,int lshu) {
		super();
		this.chid = chid;
		this.lid = lid;
		this.gid = gid;
		this.chkushu = chkushu;
		this.chpanshu = chpanshu;
		this.chremaarks = chremaarks;
		this.stid = stid;
		this.stshu = stshu;
		this.stmax = stmax;
		this.stmin = stmin;
		this.stopera = stopera;
		this.stdate = stdate;
		this.gname = gname;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid = cid;
		this.sid = sid;
		this.gopera = gopera;
		this.gdate = gdate;
		this.ctype = ctype;
		this.cstate = cstate;
		this.gbid = gbid;
		this.lshu = lshu;
	}
	public Kkcpd3() {
		super();
	}
	public int getChid() {
		return chid;
	}
	public void setChid(int chid) {
		this.chid = chid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getChkushu() {
		return chkushu;
	}
	public void setChkushu(int chkushu) {
		this.chkushu = chkushu;
	}
	public int getChpanshu() {
		return chpanshu;
	}
	public void setChpanshu(int chpanshu) {
		this.chpanshu = chpanshu;
	}
	public String getChremaarks() {
		return chremaarks;
	}
	public void setChremaarks(String chremaarks) {
		this.chremaarks = chremaarks;
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
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
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
	public int getGbid() {
		return gbid;
	}
	public void setGbid(int gbid) {
		this.gbid = gbid;
	}
	public int getLshu() {
		return lshu;
	}
	public void setLshu(int lshu) {
		this.lshu = lshu;
	}
	public Kkcpd3(int gid, int stshu, String gname, Double gprice, String gspec, int gbid) {
		super();
		this.gid = gid;
		this.stshu = stshu;
		this.gname = gname;
		this.gprice = gprice;
		this.gspec = gspec;
		this.gbid = gbid;
	}
	
	
}
