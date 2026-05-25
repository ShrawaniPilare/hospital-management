package com.hospital.hospital_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.hospital_management.entity.Patient;
import com.hospital.hospital_management.service.PatientService;

@Controller
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/")
    public String home(Model model) {

        List<Patient> patients = service.getPatients();

        model.addAttribute("patients", patients);

        model.addAttribute("icuStatus", "Available");
        model.addAttribute("generalStatus", "Available");
        model.addAttribute("emergencyStatus", "Available");

        return "index";
    }

    @PostMapping("/savePatient")
    public String savePatient(Patient patient) {

        service.savePatient(patient);

        return "redirect:/";
    }
}