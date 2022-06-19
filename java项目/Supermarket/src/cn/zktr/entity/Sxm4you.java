package cn.zktr.entity;

public class Sxm4you {
        private String gname;
        private double gprice;
        private int stshu;
        private double xiaoji;
		public String getGname() {
			return gname;
		}
		public void setGname(String gname) {
			this.gname = gname;
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
		public double getXiaoji() {
			return xiaoji;
		}
		public void setXiaoji(double xiaoji) {
			this.xiaoji = xiaoji;
		}
		public Sxm4you(String gname, double gprice, int stshu, double xiaoji) {
			super();
			this.gname = gname;
			this.gprice = gprice;
			this.stshu = stshu;
			this.xiaoji = xiaoji;
		}
		public Sxm4you() {
			super();
		}
        
        
}
