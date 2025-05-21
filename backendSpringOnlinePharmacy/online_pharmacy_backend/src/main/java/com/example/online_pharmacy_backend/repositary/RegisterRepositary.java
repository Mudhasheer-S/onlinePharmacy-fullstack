package com.example.online_pharmacy_backend.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.online_pharmacy_backend.model.UserPasswordData;

public interface RegisterRepositary extends JpaRepository<UserPasswordData , String>{

}
