package com.hospital.hospital_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    // Add patient
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    // Get all patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getPatients();
    }

    // Get patient by ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    // Update patient
    @PutMapping("/{id}")
    public Patient updatePatient(
            @PathVariable Long id,
            @RequestBody Patient patient) {

        Patient existingPatient =
                service.getPatientById(id);

        if (existingPatient != null) {

            existingPatient.setName(patient.getName());
            existingPatient.setAge(patient.getAge());
            existingPatient.setDisease(patient.getDisease());
            existingPatient.setContact(patient.getContact());
            existingPatient.setWardName(patient.getWardName());

            return service.updatePatient(existingPatient);
        }

        return null;
    }

    // Delete patient
    @DeleteMapping("/{id}")
    public String deletePatient(
            @PathVariable Long id) {

        service.deletePatient(id);

        return "Patient deleted successfully";
    }
}