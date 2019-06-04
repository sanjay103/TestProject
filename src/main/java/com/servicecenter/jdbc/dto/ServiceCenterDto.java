package com.servicecenter.jdbc.dto;

public class ServiceCenterDto {
	private int scid;
	private String scName;
	private String mobile;
	private String mailId;
	private String address;
	public int getScid() {
		return scid;
	}
	public void setScid(int scid) {
		this.scid = scid;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ServiceCenterDto [scid=" + scid + ", scName=" + scName + ", mobile=" + mobile + ", mailId=" + mailId
				+ ", address=" + address + "]";
	}
	
}
