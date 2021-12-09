package com.example.i2i.Patient.dto;

import java.util.Date;
import java.util.List;

public class PatientDTO  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int patientMedicalRecordNumber;
	private Date patientStartOfCareDate;
	private String patientStatus;
	private String patientFirstName;
	private String patientLastName;
	private String patientSex;
	private Date patientBirthDate;
	private String patientMaritalStatus;
	private String patientAddress;
	private String patientCity;
	private String patientState;
	private String patientCountry;
	private String patientZipcode;
	private String patientEmail;
	private String patientMobile;
	private ReferralInfoDTO patientReferlInfo;
	private List<DiagnosesDetailsDTO> listOfDiagnoses;
	private String patientInsuranceDetail;
	private String patientPrimayPhyDetails;
	
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
	public String getPatientStatus() {
		return patientStatus;
	}
	public void setPatientStatus(String patientStatus) {
		this.patientStatus = patientStatus;
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
	public ReferralInfoDTO getPatientReferlInfo() {
		return patientReferlInfo;
	}
	public void setPatientReferlInfo(ReferralInfoDTO patientReferlInfo) {
		this.patientReferlInfo = patientReferlInfo;
	}
	public List<DiagnosesDetailsDTO> getListOfDiagnoses() {
		return listOfDiagnoses;
	}
	public void setListOfDiagnoses(List<DiagnosesDetailsDTO> listOfDiagnoses) {
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
	
}
