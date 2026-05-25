package com.hospital.hospital_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospital.hospital_management.service.PatientService;

@Controller
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/patients")
    public String patientPage(Model model){

        model.addAttribute(
                "patients",
                service.getPatients()
        );

        return "patients";
    }
}