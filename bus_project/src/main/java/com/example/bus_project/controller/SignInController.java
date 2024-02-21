package com.example.bus_project.controller;

// import com.example.bus_project.model.User;
import com.example.bus_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {

     @Autowired
     private UserService userService;

     @GetMapping("/signin/{email}/{password}")
     public boolean doesUserExist(@PathVariable String email, @PathVariable String password) {
          return userService.validateUser(email, password);
     }
}