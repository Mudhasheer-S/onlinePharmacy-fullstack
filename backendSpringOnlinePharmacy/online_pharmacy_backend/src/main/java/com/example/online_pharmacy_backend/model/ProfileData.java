package com.example.online_pharmacy_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileData {

    @Id
    private String username;

    private String dob, email, gender,name;
    private long age, phone_number;

    // {
    // "name":"name",
    // "dob":"455294184",
    // "email":"abc@134",
    // "gender":"male",
    // "age":23,
    // "phone_number":135558,
    // "userPasswordData":{
    // "username":"123"
    // }
    // }

}
