package cn.zktr.entity;

import java.util.Date;

public class Kbsby1 {
	private String oodd;
	private Date odate;
	private String oagent;
	private String stopera;
	private int ztai;
	private String obeizhu;
	//详表
	private int rid;
	private int oid;
	private int gid;
	private int rshu;
	public String getOodd() {
		return oodd;
	}
	public void setOodd(String oodd) {
		this.oodd = oodd;
	}
	public Date getOdate() {
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	public String getOagent() {
		return oagent;
	}
	public void setOagent(String oagent) {
		this.oagent = oagent;
	}
	public String getStopera() {
		return stopera;
	}
	public void setStopera(String stopera) {
		this.stopera = stopera;
	}
	public String getObeizhu() {
		return obeizhu;
	}
	public void setObeizhu(String obeizhu) {
		this.obeizhu = obeizhu;
	}
	public Kbsby1(String oodd, Date odate, String oagent, String stopera, String obeizhu) {
		super();
		this.oodd = oodd;
		this.odate = odate;
		this.oagent = oagent;
		this.stopera = stopera;
		this.obeizhu = obeizhu;
	}
	public Kbsby1() {
		super();
	}
	public Kbsby1(int rid, int oid, int gid, int rshu) {
		super();
		this.rid = rid;
		this.oid = oid;
		this.gid = gid;
		this.rshu = rshu;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getRshu() {
		return rshu;
	}
	public void setRshu(int rshu) {
		this.rshu = rshu;
	}
	public int getZtai() {
		return ztai;
	}
	public void setZtai(int ztai) {
		this.ztai = ztai;
	}
	public Kbsby1(String oodd, Date odate, String oagent, int ztai, String obeizhu) {
		super();
		this.oodd = oodd;
		this.odate = odate;
		this.oagent = oagent;
		this.ztai = ztai;
		this.obeizhu = obeizhu;
	}
	
	
	
	

}
