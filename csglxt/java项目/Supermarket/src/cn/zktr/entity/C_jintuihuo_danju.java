package cn.zktr.entity;

import java.util.Date;

public class C_jintuihuo_danju {
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
		//库存出入库详情表（details）
		private int deid;
		private int coidd;
		private int gidd;
		private int deshu;
		
		//库存表（stock）
		private int stid;
		private int gid;
		private int stshu;
		private int stmax;
		private int stmin;
		private String stopera;
		private Date stdate;
		
		
//		库存
		   
		public C_jintuihuo_danju(int gid, int stshu, int stmax, int stmin, String stopera, Date stdate) {
			super();
			
			this.gid = gid;
			this.stshu = stshu;
			this.stmax = stmax;
			this.stmin = stmin;
			this.stopera = stopera;
			this.stdate = stdate;
		}
		public int getStid() {
			return stid;
		}
		public void setStid(int stid) {
			this.stid = stid;
		}
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
		public int getStmax() {
			return stmax;
		}
		public void setStmax(int stmax) {
			this.stmax = stmax;
		}
		public int getStmin() {
			return stmin;
		}
		public void setStmin(int stmin) {
			this.stmin = stmin;
		}
		public String getStopera() {
			return stopera;
		}
		public void setStopera(String stopera) {
			this.stopera = stopera;
		}
		public Date getStdate() {
			return stdate;
		}
		public void setStdate(Date stdate) {
			this.stdate = stdate;
		}
		public int getDeid() {
			return deid;
		}
		public void setDeid(int deid) {
			this.deid = deid;
		}
		public int getCoidd() {
			return coidd;
		}
		public void setCoidd(int coidd) {
			this.coidd = coidd;
		}
		public int getGidd() {
			return gidd;
		}
		public void setGidd(int gidd) {
			this.gidd = gidd;
		}
		public int getDeshu() {
			return deshu;
		}
		public void setDeshu(int deshu) {
			this.deshu = deshu;
		}
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
		public C_jintuihuo_danju(int pid, String podd, int sid, Date pdate, int pztai, double pcope, double ppaid,
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
		public C_jintuihuo_danju() {
			super();
		}
		//库存出入库详情表（details）
		public C_jintuihuo_danju(int coidd, int gidd, int deshu) {
			super();
			this.coidd = coidd;
			this.gidd = gidd;
			this.deshu = deshu;
		}
		
		
		
}
