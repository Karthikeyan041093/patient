package com.example.i2i.Patient.service.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;

import com.example.i2i.Patient.dto.PatientDTO;
import com.example.i2i.Patient.entity.Patient;
import com.example.i2i.Patient.repository.PatientRepository;
import com.example.i2i.Patient.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	private PatientRepository patientRepo;

	private ModelMapper modelMapper;

	public PatientServiceImpl(PatientRepository patientRepo, ModelMapper modelMapper) {
		super();
		this.patientRepo = patientRepo;
		this.modelMapper = modelMapper;
	}

	@Override
	public PatientDTO savePatient(PatientDTO patientDTO) {
		System.out.println("Inside savePatient Method");
		Patient patient = convertToDBObj(patientDTO);
		return convertToDtoObj(patientRepo.save(patient));
	}

	private PatientDTO convertToDtoObj(Patient patient) {
		ModelMapper modelMapper = new ModelMapper();
		PatientDTO patientDTO = modelMapper.map(patient, PatientDTO.class);
		return patientDTO;
	}

	private Patient convertToDBObj(PatientDTO patientDTO) {
		Patient patient = modelMapper.map(patientDTO, Patient.class);
		return patient;
	}

	@Override
	@CachePut(value = "PatientDTO", key = "#patientDTO.patientMedicalRecordNumber")
	public PatientDTO updatePat(PatientDTO patientDTO) {
		System.out.println("Inside updatePat Method");
		Patient patient = convertToDBObj(patientDTO);
		return convertToDtoObj(patientRepo.save(patient));
	}

	@Override
	@Cacheable(value = "PatientDTO")
	public List<PatientDTO> getAllPat() {
		System.out.println("Inside getAllPat Method");
		Iterable<Patient> listOfAllUsers = patientRepo.findAll();
		List<Patient> result = StreamSupport.stream(listOfAllUsers.spliterator(), false).collect(Collectors.toList());
		if (result.isEmpty()) {
			return new ArrayList<PatientDTO>();
		} else {
			return result.stream().map(this::convertToDtoObj).collect(Collectors.toList());
		}
	}

	@Override
	@Cacheable(value = "PatientDTO")
	public List<PatientDTO> getAllPatWithPagination(Integer pageNo,Integer pageSize) {
		System.out.println("Inside getAllPatWithPagination Method");
		Pageable pageable = PageRequest.of(pageNo,pageSize);
		Page<Patient> pagedResult = patientRepo.findAll(pageable);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent().stream().map(this::convertToDtoObj).collect(Collectors.toList());
		} else {
			return new ArrayList<Patient>().stream().map(this::convertToDtoObj).collect(Collectors.toList());
		}
	}

	@Override
	@Cacheable(value = "PatientDTO", key = "#patId")
	public PatientDTO findById(int patId) {
		System.out.println("Inside findById Method");
		Patient patient = null;
		Optional<Patient> patById = patientRepo.findById(patId);
		if (patById.isPresent()) {
			patient = patById.get();
			return convertToDtoObj(patient);
		} else {
			return null;
		}

	}

	@Override
	@CacheEvict(value = "PatientDTO", key = "#id", allEntries = true)
	public void deletePatById(int id) {

		System.out.println("Inside deletePatById Method");
		patientRepo.deleteById(id);

	}

	@Override
	public PatientDTO patchUpdatePatient(int id, Map<Object, Object> patObj) {
		System.out.println("Inside patchUpdatePatient Method");
		Optional<Patient> existingPat = patientRepo.findById(id);
		if (existingPat.isPresent()) {
			patObj.forEach((key, value) -> {
				Field field = ReflectionUtils.findRequiredField(Patient.class, (String) key);
				field.setAccessible(true);
				System.out.println(key + "--->" + field.getName() + "---->" + value);
				ReflectionUtils.setField(field, existingPat.get(), value);
			});
			Patient updatedPat = patientRepo.save(existingPat.get());
			return convertToDtoObj(updatedPat);
		} else {
			return null;
		}
	}

}
