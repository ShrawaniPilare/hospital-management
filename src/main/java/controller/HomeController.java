package com.hospital.hospital_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospital.hospital_management.repository.PatientRepository;

@Controller
public class HomeController {

    @Autowired
    private PatientRepository repository;

    @GetMapping("/")
    public String home(Model model){

        model.addAttribute(
            "patients",
            repository.findAll()
        );

        return "index";
    }
}