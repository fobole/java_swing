package cn.zktr.entity;

public class Caigou_gongyingshang {
		private int sid;
		private String sbusiness;
		private String sname;
		private String sphone;
		private String saddress;
		private int sztai;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
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
		public Caigou_gongyingshang(int sid, String sbusiness, String sname, String sphone, String saddress,
				int sztai) {
			super();
			this.sid = sid;
			this.sbusiness = sbusiness;
			this.sname = sname;
			this.sphone = sphone;
			this.saddress = saddress;
			this.sztai = sztai;
		}
		public Caigou_gongyingshang() {
			super();
		}
		@Override
		public String toString() {
			return sbusiness;
		}
		
		
}
