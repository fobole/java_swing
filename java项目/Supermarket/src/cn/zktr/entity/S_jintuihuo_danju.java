package cn.zktr.entity;

import java.util.Date;

public class S_jintuihuo_danju {
    private int gid;
    private Date gdate;
    private String vname;
    private double sacope;
    private double sapaid;
    private String saagent;
    private String saodd;
    
    
	public S_jintuihuo_danju(String saodd) {
		super();
		this.saodd = saodd;
	}

	public String getSaodd() {
		return saodd;
	}

	public void setSaodd(String saodd) {
		this.saodd = saodd;
	}

	public int getGid() {
		return gid;
	}
	
	public void setGid(int gid) {
		this.gid = gid;
	}
	public Date getGdate() {
		return gdate;
	}
	public void setGdate(Date gdate) {
		this.gdate = gdate;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
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
	public S_jintuihuo_danju(int gid, Date gdate, String vname, double sacope, double sapaid, String saagent) {
		super();
		this.gid = gid;
		this.gdate = gdate;
		this.vname = vname;
		this.sacope = sacope;
		this.sapaid = sapaid;
		this.saagent = saagent;
	}
	public S_jintuihuo_danju() {
		super();
	}
    
    
}
