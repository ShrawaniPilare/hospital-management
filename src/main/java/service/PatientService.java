package com.hospital.hospital_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    // Save patient
    public Patient savePatient(Patient patient) {
        return repository.save(patient);
    }

    // Get all patients
    public List<Patient> getPatients() {
        return repository.findAll();
    }

    // Get patient by ID
    public Patient getPatientById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Delete patient
    public void deletePatient(Long id) {
        repository.deleteById(id);
    }

    // Update patient
    public Patient updatePatient(Patient patient) {
        return repository.save(patient);
    }
}