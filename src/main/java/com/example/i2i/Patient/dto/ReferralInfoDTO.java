package com.example.i2i.Patient.dto;

public class ReferralInfoDTO  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int refid;
	private String refName;
	private String refEmail;
	private String refMobile;
	
	
	public int getRefid() {
		return refid;
	}
	public void setRefid(int refid) {
		this.refid = refid;
	}
	public String getRefName() {
		return refName;
	}
	public void setRefName(String refName) {
		this.refName = refName;
	}
	public String getRefEmail() {
		return refEmail;
	}
	public void setRefEmail(String refEmail) {
		this.refEmail = refEmail;
	}
	public String getRefMobile() {
		return refMobile;
	}
	public void setRefMobile(String refMobile) {
		this.refMobile = refMobile;
	}
	

}
