package com.example.online_pharmacy_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.online_pharmacy_backend.model.UserPasswordData;
import com.example.online_pharmacy_backend.service.RegisterService;

import io.swagger.v3.core.util.Json;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class RegisterController {

    private RegisterService registerService;

    Logger logger = LoggerFactory.getLogger(RegisterController.class);

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/userData")
    public UserPasswordData postMethodName(@RequestBody UserPasswordData register) {
        
        return registerService.saveRegisterDetail(register);
    }
    
    // http://localhost:3001/userData?username=${username}
    @GetMapping("/userData")
    public UserPasswordData getMethodName(@RequestParam String username) {
        return registerService.getByUsername(username);
    }

}


