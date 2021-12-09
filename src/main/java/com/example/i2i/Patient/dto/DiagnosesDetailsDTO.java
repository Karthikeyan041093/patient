 package com.example.i2i.Patient.dto;

public class DiagnosesDetailsDTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int diagonosesId;
	private String primaryDiagnoses;
	private String secondDiagnoses;
	private String thirdDiagnoses;
	
	
	public int getDiagonosesId() {
		return diagonosesId;
	}
	public void setDiagonosesId(int diagonosesId) {
		this.diagonosesId = diagonosesId;
	}
	public String getPrimaryDiagnoses() {
		return primaryDiagnoses;
	}
	public void setPrimaryDiagnoses(String primaryDiagnoses) {
		this.primaryDiagnoses = primaryDiagnoses;
	}
	public String getSecondDiagnoses() {
		return secondDiagnoses;
	}
	public void setSecondDiagnoses(String secondDiagnoses) {
		this.secondDiagnoses = secondDiagnoses;
	}
	public String getThirdDiagnoses() {
		return thirdDiagnoses;
	}
	public void setThirdDiagnoses(String thirdDiagnoses) {
		this.thirdDiagnoses = thirdDiagnoses;
	}
	
	

}
