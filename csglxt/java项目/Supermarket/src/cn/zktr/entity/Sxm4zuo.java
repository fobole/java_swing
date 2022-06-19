package cn.zktr.entity;

public class Sxm4zuo {
         private int gid;
         private String gname;
         private String gspec;
         private double gprice;
         private int stshu;
         private String vgrade;
         public Sxm4zuo(int vid, String vname) {
			super();
			this.vid = vid;
			this.vname = vname;
		}
		private int vid;
         private String vname;
         
		public int getVid() {
			return vid;
		}
		public Sxm4zuo(int gid, String gname, String gspec, double gprice, int stshu, String vgrade, int vid,
				String vname) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gspec = gspec;
			this.gprice = gprice;
			this.stshu = stshu;
			this.vgrade = vgrade;
			this.vid = vid;
			this.vname = vname;
		}
		public void setVid(int vid) {
			this.vid = vid;
		}
		public String getVname() {
			return vname;
		}
		public void setVname(String vname) {
			this.vname = vname;
		}
		public Sxm4zuo(String vgrade) {
			super();
			this.vgrade = vgrade;
		}
		public String getVgrade() {
			return vgrade;
		}
		public void setVgrade(String vgrade) {
			this.vgrade = vgrade;
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
		public double getGprice() {
			return gprice;
		}
		public void setGprice(double gprice) {
			this.gprice = gprice;
		}
		public Sxm4zuo(int gid, String gname, String gspec, double gprice) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gspec = gspec;
			this.gprice = gprice;
		}
		
		public Sxm4zuo(int gid, String gname, String gspec, double gprice, int stshu) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gspec = gspec;
			this.gprice = gprice;
			this.stshu = stshu;
		}
		public Sxm4zuo() {
			super();
		}
		@Override
		public String toString() {
			return vname;
		}
         
         
}
