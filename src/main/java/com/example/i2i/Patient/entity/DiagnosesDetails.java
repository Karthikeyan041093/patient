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
@Table(name = "DIAGONOSES_INFO")
@Audited
public class DiagnosesDetails extends Auditable<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "diagnoses_id", unique = true, nullable = false)
	private int diagonosesId;
	
	@Column(name = "primary_diagnoses")
	private String primaryDiagnoses;
	

	@Column(name = "second_diagnoses")
	private String secondDiagnoses;
	

	@Column(name = "third_diagnoses")
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
