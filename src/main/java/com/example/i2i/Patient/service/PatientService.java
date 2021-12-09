package com.example.i2i.Patient.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.i2i.Patient.dto.PatientDTO;
import com.example.i2i.Patient.entity.Patient;
@Component
public interface PatientService {

	PatientDTO savePatient(PatientDTO patient);

	PatientDTO updatePat(PatientDTO patientDTO);

	List<PatientDTO> getAllPat();

	List<PatientDTO> getAllPatWithPagination(Integer pageNo,Integer pageSize);

	PatientDTO findById(int id);

	void deletePatById(int id);

	PatientDTO patchUpdatePatient(int id, Map<Object, Object> patObj);

}
