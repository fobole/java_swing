package cn.zktr.entity;

import java.util.Date;

public class C_jintuihuo_danju2 {
		private int pid;
		private String podd;
		private Date pdate;
		private int pztai;
		private double pcope;
		private double ppaid;
		private String pagent;
		private int sid;
		private String sbusiness;
		private String sname;
		private String sphone;
		private String saddress;
		private int sztai;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPodd() {
			return podd;
		}
		public void setPodd(String podd) {
			this.podd = podd;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public Date getPdate() {
			return pdate;
		}
		public void setPdate(Date pdate) {
			this.pdate = pdate;
		}
		public int getPztai() {
			return pztai;
		}
		public void setPztai(int pztai) {
			this.pztai = pztai;
		}
		public double getPcope() {
			return pcope;
		}
		public void setPcope(double pcope) {
			this.pcope = pcope;
		}
		public double getPpaid() {
			return ppaid;
		}
		public void setPpaid(double ppaid) {
			this.ppaid = ppaid;
		}
		public String getPagent() {
			return pagent;
		}
		public void setPagent(String pagent) {
			this.pagent = pagent;
		}
		public String getSbusiness() {
			return sbusiness;
		}
		public void setSbusiness(String sbusiness) {
			this.sbusiness = sbusiness;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getSphone() {
			return sphone;
		}
		public void setSphone(String sphone) {
			this.sphone = sphone;
		}
		public String getSaddress() {
			return saddress;
		}
		public void setSaddress(String saddress) {
			this.saddress = saddress;
		}
		public int getSztai() {
			return sztai;
		}
		public void setSztai(int sztai) {
			this.sztai = sztai;
		}
		public C_jintuihuo_danju2(int pid, String podd, int sid, Date pdate, int pztai, double pcope, double ppaid,
				String pagent, String sbusiness, String sname, String sphone, String saddress, int sztai) {
			super();
			this.pid = pid;
			this.podd = podd;
			this.sid = sid;
			this.pdate = pdate;
			this.pztai = pztai;
			this.pcope = pcope;
			this.ppaid = ppaid;
			this.pagent = pagent;
			this.sbusiness = sbusiness;
			this.sname = sname;
			this.sphone = sphone;
			this.saddress = saddress;
			this.sztai = sztai;
		}
		public C_jintuihuo_danju2() {
			super();
		}
		
}
