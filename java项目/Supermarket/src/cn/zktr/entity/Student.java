package cn.zktr.entity;

import java.util.Date;

/**
 * 学生实体类
 * @author ASUS
 *
 */
public class Student {
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	private String sphone;
	private Date sbirthday;
	private int cid;
	private int sstate;
	private String cname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public Date getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(Date sbirthday) {
		this.sbirthday = sbirthday;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getSstate() {
		return sstate;
	}
	public void setSstate(int sstate) {
		this.sstate = sstate;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Student(int sid, String sname, String ssex, int sage, String sphone, Date sbirthday, int cid, int sstate,
			String cname) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.sphone = sphone;
		this.sbirthday = sbirthday;
		this.cid = cid;
		this.sstate = sstate;
		this.cname = cname;
	}
	public Student() {
		super();
	}
	
	
	public Student(String sname, String ssex, int sage, String sphone) {
		super();
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.sphone = sphone;
	}
	@Override
	public String toString() {
		return sid + "\t" + sname + "\t" + ssex + "\t" + sage + "\t" + sphone
				+ "\t" + sbirthday + "\t" + cname;
	}
	
	
	
	
	

}
