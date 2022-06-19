package cn.zktr.entity;

public class C_kucun_xinxi {
		private int gid;
		private String gname;
		private double gbid;
		private double gprice;
		private String gspec;
		private String ctype;
		private String Stshu;
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
		public String getCtype() {
			return ctype;
		}
		public void setCtype(String ctype) {
			this.ctype = ctype;
		}
		public String getStshu() {
			return Stshu;
		}
		public void setStshu(String stshu) {
			Stshu = stshu;
		}
		public C_kucun_xinxi(int gid, String gname, double gbid, double gprice, String gspec, String ctype,
				String stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.ctype = ctype;
			Stshu = stshu;
		}
		public C_kucun_xinxi() {
			super();
		}
		@Override
		public String toString() {
			return "C_kucun_xinxi [gid=" + gid + ", gname=" + gname + ", gbid=" + gbid + ", gprice=" + gprice
					+ ", gspec=" + gspec + ", ctype=" + ctype + ", Stshu=" + Stshu + "]";
		}
		
}
