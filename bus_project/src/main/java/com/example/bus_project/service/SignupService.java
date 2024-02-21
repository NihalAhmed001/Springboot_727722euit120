package com.example.bus_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bus_project.model.Signup;
import com.example.bus_project.repositary.SignupRepository;

@Service
public class SignupService {

    @Autowired
    public SignupRepository signupRepository;

    public Signup saveUser(Signup signup) {
        return signupRepository.save(signup);
    }

}