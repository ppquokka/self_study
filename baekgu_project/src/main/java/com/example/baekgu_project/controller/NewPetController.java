package com.example.baekgu_project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.baekgu_project.service.PetInformationService;

@Controller
@RequestMapping({"/pets"})
public class NewPetController {
    
    @Autowired
    PetInformationService petInformationService;

    @PostMapping({"/add"})
    public ResponseEntity addPetInformation(@RequestParam Map paramMap) {
        Object result = petInformationService.insertPetInformation(paramMap);
        return ResponseEntity.ok().body(result);
    }
}
