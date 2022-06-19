package cn.zktr.entity;

public class C_kucun_biandong {
		private int gid;
		private String gname;
		private double gbid;
		private double gprice;
		private String gspec;
		private int gztai;
		private int cid;
		private String ctype;
		private int cstate;
		private int stid;
		private int stshu;
		private int stmax;
		private int stmin;
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
		public int getGztai() {
			return gztai;
		}
		public void setGztai(int gztai) {
			this.gztai = gztai;
		}
		public int getStid() {
			return stid;
		}
		public void setStid(int stid) {
			this.stid = stid;
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
		
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCtype() {
			return ctype;
		}
		public void setCtype(String ctype) {
			this.ctype = ctype;
		}
		public int getCstate() {
			return cstate;
		}
		public void setCstate(int cstate) {
			this.cstate = cstate;
		}
		
		public C_kucun_biandong(int gid, String gname, double gbid, double gprice, String gspec, int gztai, int cid,
				String ctype, int cstate, int stid, int stshu, int stmax, int stmin) {
			super();
			this.gid = gid;
			this.gname = gname;
			this.gbid = gbid;
			this.gprice = gprice;
			this.gspec = gspec;
			this.gztai = gztai;
			this.cid = cid;
			this.ctype = ctype;
			this.cstate = cstate;
			this.stid = stid;
			this.stshu = stshu;
			this.stmax = stmax;
			this.stmin = stmin;
		}
		public C_kucun_biandong() {
			super();
		}
		@Override
		public String toString() {
			return  ctype;
		}
		
		
}
