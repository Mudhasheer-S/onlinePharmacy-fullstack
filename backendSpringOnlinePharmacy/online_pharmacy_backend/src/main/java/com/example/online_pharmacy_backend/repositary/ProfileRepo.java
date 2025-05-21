package com.example.online_pharmacy_backend.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_pharmacy_backend.model.ProfileData;


public interface ProfileRepo extends JpaRepository<ProfileData,String> {

}
