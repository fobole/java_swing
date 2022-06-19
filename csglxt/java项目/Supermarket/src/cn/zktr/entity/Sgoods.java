package cn.zktr.entity;

public class Sgoods {
	private int gid;
    private String gname;
    private String gspec;
    private double gprice;
    private int stshu;
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
	public String getGspec() {
		return gspec;
	}
	public void setGspec(String gspec) {
		this.gspec = gspec;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public int getStshu() {
		return stshu;
	}
	public void setStshu(int stshu) {
		this.stshu = stshu;
	}
	public Sgoods(int gid, String gname, String gspec, double gprice, int stshu) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gspec = gspec;
		this.gprice = gprice;
		this.stshu = stshu;
	}
	public Sgoods() {
		super();
	}
}
