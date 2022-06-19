package cn.zktr.entity;

import java.util.Date;

public class Kkcpd5 {
	private int pid;
	private Date pdate;
	private int xpshu;
	private int chkushu;
	private int chpanshu;
	public Kkcpd5(int pid, Date pdate, int xpshu, int chkushu, int chpanshu) {
		super();
		this.pid = pid;
		this.pdate = pdate;
		this.xpshu = xpshu;
		this.chkushu = chkushu;
		this.chpanshu = chpanshu;
	}
	public Kkcpd5() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Date getPdate() {
		return pdate;
	}
	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	public int getXpshu() {
		return xpshu;
	}
	public void setXpshu(int xpshu) {
		this.xpshu = xpshu;
	}
	public int getChkushu() {
		return chkushu;
	}
	public void setChkushu(int chkushu) {
		this.chkushu = chkushu;
	}
	public int getChpanshu() {
		return chpanshu;
	}
	public void setChpanshu(int chpanshu) {
		this.chpanshu = chpanshu;
	}
	
	

}
