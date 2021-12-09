package com.example.i2i.Patient.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.i2i.Patient.dto.PatientDTO;
import com.example.i2i.Patient.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientController {

	PatientService patientService;

	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}

	@PostMapping("/patient")
	public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patient) {
		try {
			PatientDTO _patient = patientService.savePatient(patient);
			return new ResponseEntity<>(_patient, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/patient")
	public ResponseEntity<PatientDTO> updateUser(@RequestBody PatientDTO patientDTO) {
		try {
			PatientDTO _patient = patientService.updatePat(patientDTO);
			return new ResponseEntity<>(_patient, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PatchMapping("/patient/{id}")
	public ResponseEntity<PatientDTO> patchUpdateUser(@PathVariable("id") int id,
			@RequestBody Map<Object, Object> patObj) {
		try {
			PatientDTO _patDTO = patientService.patchUpdatePatient(id, patObj);
			return new ResponseEntity<>(_patDTO, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/patients", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<PatientDTO>> getAllUsers() {
		List<PatientDTO> listOfPat = new ArrayList<PatientDTO>();
		try {
			listOfPat = patientService.getAllPat();
			if (listOfPat.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(listOfPat, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/patients/page", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<PatientDTO>> getAllUsersWithPagination(@RequestParam(defaultValue = "0") Integer pageNo,
			@RequestParam(defaultValue = "1") Integer pageSize) {
		List<PatientDTO> listOfPat = new ArrayList<PatientDTO>();
		try {
			listOfPat = patientService.getAllPatWithPagination(pageNo, pageSize);
			if (listOfPat.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(listOfPat, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("patient/{id}")
	public ResponseEntity<PatientDTO> getUserById(@PathVariable("id") int id) {
		PatientDTO patData = patientService.findById(id);

		if (patData!=null) {
			return new ResponseEntity<>(patData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	@DeleteMapping("patient/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable("id") int id) {

		patientService.deletePatById(id);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
