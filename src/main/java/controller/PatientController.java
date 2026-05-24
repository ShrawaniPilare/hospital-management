package com.hospital.hospital_management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.service.PatientService;
@RestController
@RequestMapping("/patients")

public class PatientController {

    @Autowired
    PatientService service;

    @PostMapping
    public Patient addPatient(
            @RequestBody Patient patient){

        return service.savePatient(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients(){

        return service.getPatients();
    }
}