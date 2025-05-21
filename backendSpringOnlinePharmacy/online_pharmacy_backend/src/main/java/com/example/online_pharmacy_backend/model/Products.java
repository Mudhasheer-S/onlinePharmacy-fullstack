package com.example.online_pharmacy_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Products {
    
    @Id
    private int id;
    private String heading,img;
    private int Rate;
    
    @Column(columnDefinition = "TEXT")
    private String productdetail;
    @Column(columnDefinition = "TEXT")
    private String features;
    @Column(columnDefinition = "TEXT")
    private String description;
}
