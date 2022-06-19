package cn.zktr.entity;

public class S_danju_xiangqin {
	 private int gid;
     private String saodd;
     private String gname;
     private String gspec;
     private int sdshu;
     private double gprice;
     private int stshu;
	
     
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getStshu() {
		return stshu;
	}
	public void setStshu(int stshu) {
		this.stshu = stshu;
	}
	public String getSaodd() {
		return saodd;
	}
	public void setSaodd(String saodd) {
		this.saodd = saodd;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGspec() {
		return gspec;
	}
	public void setGspec(String gspec) {
		this.gspec = gspec;
	}
	public int getSdshu() {
		return sdshu;
	}
	public void setSdshu(int sdshu) {
		this.sdshu = sdshu;
	}
	public double getGprice() {
		return gprice;
	}
	public S_danju_xiangqin(int gid, String gname, String gspec, double gprice,int sdshu) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gspec = gspec;
		this.gprice = gprice;
		this.sdshu = sdshu;	
	}
	public S_danju_xiangqin(int gid, String gname, String gspec, int sdshu, double gprice, int stshu) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gspec = gspec;
		this.sdshu = sdshu;
		this.gprice = gprice;
		this.stshu = stshu;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public S_danju_xiangqin(String saodd, String gname, String gspec, int sdshu, double gprice, int stshu) {
		super();
		this.saodd = saodd;
		this.gname = gname;
		this.gspec = gspec;
		this.sdshu = sdshu;
		this.gprice = gprice;
		this.stshu = stshu;
	}
	public S_danju_xiangqin() {
		super();
	}
     
}
