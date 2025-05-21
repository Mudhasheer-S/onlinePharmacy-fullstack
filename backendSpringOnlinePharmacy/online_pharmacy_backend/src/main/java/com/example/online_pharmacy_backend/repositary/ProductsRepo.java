package com.example.online_pharmacy_backend.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.online_pharmacy_backend.model.Products;


public interface ProductsRepo extends JpaRepository<Products,Integer>{
    
} 