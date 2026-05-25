package com.hospital.hospital_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.hospital_management.service.PatientService;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping
    public String patients(Model model) {
        return "patients";
    }

    @GetMapping("/add")
    public String addPatient(Model model) {
        return "addPatient";
    }
}