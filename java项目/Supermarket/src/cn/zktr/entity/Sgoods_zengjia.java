package cn.zktr.entity;

import java.util.Date;

public class Sgoods_zengjia {
	private int gid;
	private String gname;
	private double gbid;
	private double gprice;
	private String gspec;
	private int cid1;
	private int sid;
	private int gztai;
	private String gopera;
	private Date gdate;
	private int stid;
	private int stshu;
	private double zsj;
	private String vgrade;
	
	public Sgoods_zengjia(String vgrade) {
		super();
		this.vgrade = vgrade;
	}
	public String getVgrade() {
		return vgrade;
	}
	public void setVgrade(String vgrade) {
		this.vgrade = vgrade;
	}
	public int getSdshu() {
		return sdshu;
	}
	public void setSdshu(int sdshu) {
		this.sdshu = sdshu;
	}
	private int sdshu;
	
	public Sgoods_zengjia(double zsj) {
		super();
		this.zsj = zsj;
	}
	public Sgoods_zengjia() {
		super();
	}
	public Sgoods_zengjia(int sdshu) {
		super();
		this.sdshu = sdshu;
	}
	public double getZsj() {
		return zsj;
	}
	public void setZsj(double zsj) {
		this.zsj = zsj;
	}
	//vip
	private int vid;
	private String vname;
	
	
	
	
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
		return cid1;
	}
	public void setCid1(int cid1) {
		this.cid1 = cid1;
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
	public Sgoods_zengjia(int gid, String gname, double gbid, double gprice, String gspec, int cid1, int sid,
			int gztai, String gopera, Date gdate, int stid, int stshu) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid1 = cid1;
		this.sid = sid;
		this.gztai = gztai;
		this.gopera = gopera;
		this.gdate = gdate;
		this.stid = stid;
		this.stshu = stshu;
	}
	
	public Sgoods_zengjia(int gid, String gname, double gbid, double gprice, String gspec) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
	}
	
	public Sgoods_zengjia(int gid, String gname, double gbid, double gprice, String gspec, int cid1, int sid, int gztai,
			String gopera, Date gdate, int stid, int stshu, int vid, String vname) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gbid = gbid;
		this.gprice = gprice;
		this.gspec = gspec;
		this.cid1 = cid1;
		this.sid = sid;
		this.gztai = gztai;
		this.gopera = gopera;
		this.gdate = gdate;
		this.stid = stid;
		this.stshu = stshu;
		this.vid = vid;
		this.vname = vname;
	}
	@Override
	public String toString() {
		return vname ;
	}

}
