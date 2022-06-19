package cn.zktr.entity;

import java.util.Date;

public class C_zhengdantuihuo {
		private int pid;
		private String podd;
		private Date pdate;
		private int pztai;
		private double pcope;
		private double ppaid;
		private String ctype;
		private int cotype;
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
		public String getCtype() {
			return ctype;
		}
		public void setCtype(String ctype) {
			this.ctype = ctype;
		}
		public int getCotype() {
			return cotype;
		}
		public void setCotype(int cotype) {
			this.cotype = cotype;
		}
		public C_zhengdantuihuo(int pid, String podd, Date pdate, int pztai, double pcope, double ppaid, String ctype,
				int cotype) {
			super();
			this.pid = pid;
			this.podd = podd;
			this.pdate = pdate;
			this.pztai = pztai;
			this.pcope = pcope;
			this.ppaid = ppaid;
			this.ctype = ctype;
			this.cotype = cotype;
		}
		public C_zhengdantuihuo() {
			super();
		}
		@Override
		public String toString() {
			return "C_zhengdantuihuo [pid=" + pid + ", podd=" + podd + ", pdate=" + pdate + ", pztai=" + pztai
					+ ", pcope=" + pcope + ", ppaid=" + ppaid + ", ctype=" + ctype + ", cotype=" + cotype + "]";
		}
		
}
