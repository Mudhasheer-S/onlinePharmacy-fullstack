package com.example.online_pharmacy_backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_pharmacy_backend.model.ProfileData;
import com.example.online_pharmacy_backend.model.UserPasswordData;
import com.example.online_pharmacy_backend.repositary.ProfileRepo;

@Service
public class ProfileService {

    @Autowired
    public ProfileRepo profileRepo;
    
    public ProfileData updateProfile(ProfileData profileData){
        return profileRepo.save(profileData);
    }

    public ProfileData getUserData(String username){
        return profileRepo.findById(username).get();
    }
}
