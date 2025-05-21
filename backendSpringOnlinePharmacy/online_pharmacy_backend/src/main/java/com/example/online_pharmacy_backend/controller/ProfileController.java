package com.example.online_pharmacy_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.online_pharmacy_backend.model.ProfileData;
import com.example.online_pharmacy_backend.service.ProfileService;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {

    public ProfileService profileService;
    
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PutMapping("/profile")
    public ProfileData putMethodName(@RequestBody ProfileData profileData) {
        
        return profileService.updateProfile(profileData);
    }

    @GetMapping("/profile")
    public ProfileData getMethodName(@RequestParam String username) {
        return profileService.getUserData(username);
    }
    
}
