package com.example.i2i.Patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.example.i2i.Patient.dto.Auditable;


@Entity
@Table(name = "REFERRAL_INFO")
@Audited
public class ReferralInfo extends Auditable<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO	)
	@Column(name = "ref_id", unique = true, nullable = false)
	private int refid;

	@Column(name = "ref_name")
	private String refName;

	@Column(name = "ref_email")
	private String refEmail;

	@Column(name = "ref_mobile")
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


	public ReferralInfo() {
	}
	
	

}