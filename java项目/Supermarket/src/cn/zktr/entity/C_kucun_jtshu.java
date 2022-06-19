package cn.zktr.entity;

public class C_kucun_jtshu {
		private int gid;
		private String gname;
		private int stshu;
		private int xpshu;
		private int sdshu;
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
		public int getStshu() {
			return stshu;
		}
		public void setStshu(int stshu) {
			this.stshu = stshu;
		}
		public int getXpshu() {
			return xpshu;
		}
		public void setXpshu(int xpshu) {
			this.xpshu = xpshu;
		}
		public int getSdshu() {
			return sdshu;
		}
		public void setSdshu(int sdshu) {
			this.sdshu = sdshu;
		}
		public C_kucun_jtshu(int gid, String gname, int stshu, int xpshu, int sdshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.stshu = stshu;
			this.xpshu = xpshu;
			this.sdshu = sdshu;
		}
		public C_kucun_jtshu() {
			super();
		}
		@Override
		public String toString() {
			return "C_kucun_jtshu [gid=" + gid + ", gname=" + gname + ", stshu=" + stshu + ", xpshu=" + xpshu
					+ ", sdshu=" + sdshu + "]";
		}
		
}
