package cn.zktr.entity;

import java.sql.Date;

public class xm3hyzhengjia {
	private int vid;
	private String vname;
	private String vphone;
    private String vpwd;
    private String vgrade;
    private int vstate;
    private String vopera;
    private Date vdate;
    
    
	public xm3hyzhengjia(String vname, String vphone, String vpwd, String vgrade, String vopera, Date vdate) {
		super();
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
		this.vopera = vopera;
		this.vdate = vdate;
	}
	
	
	

	public xm3hyzhengjia(String vname, String vphone, String vpwd, String vopera, Date vdate) {
		super();
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vopera = vopera;
		this.vdate = vdate;
	}




	public xm3hyzhengjia(String vname, String vphone, String vpwd, String vgrade) {
		super();
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
	}


	public xm3hyzhengjia(int vid, String vname, String vphone, String vpwd, String vgrade) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
	}


	public xm3hyzhengjia(int vid, String vname, String vphone, String vpwd, String vgrade, int vstate, String vopera,
			Date vdate) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
		this.vstate = vstate;
		this.vopera = vopera;
		this.vdate = vdate;
	}
	public xm3hyzhengjia() {
		super();
	}
	


	public xm3hyzhengjia(String vname, String vphone, String vpwd, int vstate, String vopera) {
		super();
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vstate = vstate;
		this.vopera = vopera;
	}


	

	public xm3hyzhengjia(String vname, String vphone, String vpwd, String vgrade, int vstate, String vopera) {
		super();
		this.vname = vname;
		this.vphone = vphone;
		this.vpwd = vpwd;
		this.vgrade = vgrade;
		this.vstate = vstate;
		this.vopera = vopera;
	}




	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
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
	public String getVpwd() {
		return vpwd;
	}
	public void setVpwd(String vpwd) {
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
    

}
