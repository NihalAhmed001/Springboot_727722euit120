package com.example.bus_project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bus_project.model.Signup;
import com.example.bus_project.service.SignupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SignupController {

     @Autowired
     public SignupService signupService;

     @PostMapping("/signup")
     public Signup postMethodName(@RequestBody Signup signup) {

          return signupService.saveUser(signup);

     }

}
