package com.example.online_pharmacy_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.online_pharmacy_backend.model.UserPasswordData;
import com.example.online_pharmacy_backend.repositary.RegisterRepositary;

@Service
public class RegisterService {

    private RegisterRepositary registerRepositary;

    public RegisterService(RegisterRepositary registerRepositary) {
        this.registerRepositary = registerRepositary;
    }

    public UserPasswordData saveRegisterDetail(UserPasswordData register) {
        return registerRepositary.save(register);
    }

    public UserPasswordData getByUsername(String username) {
        return registerRepositary.findById(username).orElse(null);
    }

    public List<UserPasswordData> getAllDatas() {
        return registerRepositary.findAll();
    }

    public boolean updateRegister(String username, UserPasswordData register) {
        if (this.getByUsername(username) == null) {
            return false;
        }
        try {
            registerRepositary.save(register);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public boolean deleteRegister(String username) {
        if (this.getByUsername(username) == null) {
            return false;
        }
        try {
            registerRepositary.deleteById(username);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
