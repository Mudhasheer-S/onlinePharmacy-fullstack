package com.example.online_pharmacy_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.online_pharmacy_backend.model.ItemsInCart;
import com.example.online_pharmacy_backend.service.AddtoCartService;
import com.example.online_pharmacy_backend.service.ItemOfCart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddToCartController {

    @Autowired
    private AddtoCartService addtoCartService;
    
    @PostMapping("/UserCart")
    public ItemsInCart postMethodName(@RequestBody ItemsInCart product) {
        return addtoCartService.postProduct(product);
    }

    @GetMapping("/UserCart")
    public List<ItemOfCart> getMethodName(@RequestParam("username") String username) {
        return addtoCartService.getAllItems(username);
    }
    
    
    
}
