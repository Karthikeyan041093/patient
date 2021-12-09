package com.example.i2i.Patient.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.i2i.Patient.entity.Patient;
@Repository
public interface PatientRepository extends PagingAndSortingRepository<Patient,Integer>,CrudRepository<Patient, Integer>{


}
