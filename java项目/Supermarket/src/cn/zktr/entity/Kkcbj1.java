package cn.zktr.entity;

public class Kkcbj1 {
	private String gname;
	private String gspec;
	private int stshu;
	private int gid;
	private int stmax;
	private int stmin;
	
	public int getStmax() {
		return stmax;
	}
	public void setStmax(int stmax) {
		this.stmax = stmax;
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
	public int getStshu() {
		return stshu;
	}
	public void setStshu(int stshu) {
		this.stshu = stshu;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getStmin() {
		return stmin;
	}
	public void setStmin(int stmin) {
		this.stmin = stmin;
	}
	public Kkcbj1(String gname, String gspec, int stshu, int gid, int stmin) {
		super();
		this.gname = gname;
		this.gspec = gspec;
		this.stshu = stshu;
		this.gid = gid;
		this.stmin = stmin;
	}
	public Kkcbj1() {
		super();
	}
	
}
