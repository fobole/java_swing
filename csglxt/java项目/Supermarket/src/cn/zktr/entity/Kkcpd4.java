package cn.zktr.entity;

import java.util.Date;

public class Kkcpd4{
	private String lodd;
	private Date ldate;
	private int gid;
	private String gname;
	private String ctype;
	private String gspec;
	private int stshu;
	private int chpanshu;
	public Kkcpd4(String lodd, Date ldate, int gid, String gname, String ctype, String gspec, int stshu, int chpanshu) {
		super();
		this.lodd = lodd;
		this.ldate = ldate;
		this.gid = gid;
		this.gname = gname;
		this.ctype = ctype;
		this.gspec = gspec;
		this.stshu = stshu;
		this.chpanshu = chpanshu;
	}
	public Kkcpd4() {
		super();
	}
	public String getLodd() {
		return lodd;
	}
	public void setLodd(String lodd) {
		this.lodd = lodd;
	}
	public Date getLdate() {
		return ldate;
	}
	public void setLdate(Date ldate) {
		this.ldate = ldate;
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
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getGspec() {
		return gspec;
	}
	public void setGspec(String gspec) {
		this.gspec = gspec;
	}
	public int getStshu() {
		return stshu;
	}
	public void setStshu(int stshu) {
		this.stshu = stshu;
	}
	public int getChpanshu() {
		return chpanshu;
	}
	public void setChpanshu(int chpanshu) {
		this.chpanshu = chpanshu;
	}
	
	


}
