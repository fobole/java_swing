package cn.zktr.entity;
/**
 * 供应商实体
 * @author ASUS
 *
 */
public class Suplier {
	private int sid;
	private String sname;
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
	public Suplier(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public Suplier() {
		super();
	}
	@Override
	public String toString() {
		return sname;
	}
	
	
	

}
