package com.example.i2i.Patient.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import com.example.i2i.Patient.dto.Auditable;

@Entity
@Table(name = "PATIENT_DETAILS")
@Audited
public class Patient extends Auditable<String> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "medical_record_number", unique = true, nullable = false)
	private int patientMedicalRecordNumber;
	@Column(name = "start_of_care_date")
	private Date patientStartOfCareDate;
	@Column(name = "status")
	private String patientStatus;
	@Column(name = "p_first_name")
	private String patientFirstName;
	@Column(name = "p_last_name")
	private String patientLastName;
	@Column(name = "p_sex")
	private String patientSex;
	@Column(name = "p_dob")
	private Date patientBirthDate;
	@Column(name = "p_marital_status")
	private String patientMaritalStatus;
	@Column(name = "p_address")
	private String patientAddress;
	@Column(name = "p_city")
	private String patientCity;
	@Column(name = "p_state")
	private String patientState;
	@Column(name = "p_country")
	private String patientCountry;
	@Column(name = "p_zipcode")
	private String patientZipcode;
	@Column(name = "p_email")
	private String patientEmail;
	@Column(name = "p_mobile")
	private String patientMobile;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "medical_record_number", referencedColumnName = "medical_record_number", nullable = false)
	private List<DiagnosesDetails> listOfDiagnoses;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_ref_id")
	private ReferralInfo patientReferlInfo;

	@Column(name = "p_insurance_details")
	private String patientInsuranceDetail;

	@Column(name = "p_primary_phy_details")
	private String patientPrimayPhyDetails;

	public String getPatientStatus() {
		return patientStatus;
	}

	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
	}

	public int getPatientMedicalRecordNumber() {
		return patientMedicalRecordNumber;
	}

	public void setPatientMedicalRecordNumber(int patientMedicalRecordNumber) {
		this.patientMedicalRecordNumber = patientMedicalRecordNumber;
	}

	public Date getPatientStartOfCareDate() {
		return patientStartOfCareDate;
	}

	public void setPatientStartOfCareDate(Date patientStartOfCareDate) {
		this.patientStartOfCareDate = patientStartOfCareDate;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Date getPatientBirthDate() {
		return patientBirthDate;
	}

	public void setPatientBirthDate(Date patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}

	public String getPatientMaritalStatus() {
		return patientMaritalStatus;
	}

	public void setPatientMaritalStatus(String patientMaritalStatus) {
		this.patientMaritalStatus = patientMaritalStatus;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientCity() {
		return patientCity;
	}

	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}

	public String getPatientState() {
		return patientState;
	}

	public void setPatientState(String patientState) {
		this.patientState = patientState;
	}

	public String getPatientCountry() {
		return patientCountry;
	}

	public void setPatientCountry(String patientCountry) {
		this.patientCountry = patientCountry;
	}

	public String getPatientZipcode() {
		return patientZipcode;
	}

	public void setPatientZipcode(String patientZipcode) {
		this.patientZipcode = patientZipcode;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public String getPatientMobile() {
		return patientMobile;
	}

	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	public ReferralInfo getPatientReferlInfo() {
		return patientReferlInfo;
	}

	public void setPatientReferlInfo(ReferralInfo patientReferlInfo) {
		this.patientReferlInfo = patientReferlInfo;
	}

	public List<DiagnosesDetails> getListOfDiagnoses() {
		return listOfDiagnoses;
	}

	public void setListOfDiagnoses(List<DiagnosesDetails> listOfDiagnoses) {
		this.listOfDiagnoses = listOfDiagnoses;
	}

	public String getPatientInsuranceDetail() {
		return patientInsuranceDetail;
	}

	public void setPatientInsuranceDetail(String patientInsuranceDetail) {
		this.patientInsuranceDetail = patientInsuranceDetail;
	}

	public String getPatientPrimayPhyDetails() {
		return patientPrimayPhyDetails;
	}

	public void setPatientPrimayPhyDetails(String patientPrimayPhyDetails) {
		this.patientPrimayPhyDetails = patientPrimayPhyDetails;
	}

	public Patient() {
	}

}
