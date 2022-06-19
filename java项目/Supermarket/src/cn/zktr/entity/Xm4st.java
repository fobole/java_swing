package cn.zktr.entity;

public class Xm4st {
      private int eid;
      private String ename;
      private String epwd;
      private String eposition;
      private String ephone;
      private String eadd;
      private int estate;
	public Xm4st(int eid, String ename, String epwd, String eposition, String ephone, String eadd, int estate) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epwd = epwd;
		this.eposition = eposition;
		this.ephone = ephone;
		this.eadd = eadd;
		this.estate = estate;
	}
	public Xm4st() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpwd() {
		return epwd;
	}
	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}
	public String getEposition() {
		return eposition;
	}
	public void setEposition(String eposition) {
		this.eposition = eposition;
	}
	public String getEphone() {
		return ephone;
	}
	public void setEphone(String ephone) {
		this.ephone = ephone;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public int getEstate() {
		return estate;
	}
	public void setEstate(int estate) {
		this.estate = estate;
	}
	public Xm4st(String ename, String epwd, String eposition, String ephone, String eadd) {
		super();
		this.ename = ename;
		this.epwd = epwd;
		this.eposition = eposition;
		this.ephone = ephone;
		this.eadd = eadd;
	}
	public Xm4st(int eid, String ename, String epwd, String eposition, String ephone, String eadd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epwd = epwd;
		this.eposition = eposition;
		this.ephone = ephone;
		this.eadd = eadd;
	}
	public Xm4st(String ename) {
		super();
		this.ename = ename;
	}
	
	
	
      
}