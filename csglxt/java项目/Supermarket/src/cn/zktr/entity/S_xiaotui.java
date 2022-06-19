package cn.zktr.entity;

import java.sql.Date;

public class S_xiaotui {
      private int said;
      private String saodd;
      private int vid;
      Date satate;
      private int saztai;
      private double sacope;
      private double sapaid;
      private String saagent;
      private String vname;
      private String vphone;
      private int vpwd;
      private String vgrade;
      private int vstate;
      private String vopera;
      Date vdate;
	public int getSaid() {
		return said;
	}
	public void setSaid(int said) {
		this.said = said;
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
	public Date getSatate() {
		return satate;
	}
	public void setSatate(Date satate) {
		this.satate = satate;
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
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVphone() {
		return vphone;
	}
	public void setVphone(String vphone) {
		this.vphone = vphone;
	}
	public int getVpwd() {
		return vpwd;
	}
	public void setVpwd(int vpwd) {
		this.vpwd = vpwd;
	}
	public String getVgrade() {
		return vgrade;
	}
	public void setVgrade(String vgrade) {
		this.vgrade = vgrade;
	}
	public int getVstate() {
		return vstate;
	}
	public void setVstate(int vstate) {
		this.vstate = vstate;
	}
	public String getVopera() {
		return vopera;
	}
	public void setVopera(String vopera) {
		this.vopera = vopera;
	}
	public Date getVdate() {
		return vdate;
	}
	public void setVdate(Date vdate) {
		this.vdate = vdate;
	}
	public S_xiaotui(int said, String saodd, int vid, Date satate, int saztai, double sacope, double sapaid,
			String saagent, String vname, String vphone, int vpwd, String vgrade, int vstate, String vopera, Date vdate) {
		super();
		this.said = said;
		this.saodd = saodd;
		this.vid = vid;
		this.satate = satate;
		this.saztai = saztai;
		this.sacope = sacope;
		this.sapaid = sapaid;
		this.saagent = saagent;
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
		this.vstate = vstate;
		this.vopera = vopera;
		this.vdate = vdate;
	}
	public S_xiaotui() {
		super();
	}
      
      
}
