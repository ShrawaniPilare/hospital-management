package com.hospital.hospital_management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    PatientRepository repository;

    public Patient savePatient(Patient patient){

        return repository.save(patient);
    }

    public List<Patient> getPatients(){

        return repository.findAll();
    }
}