package com.example.online_pharmacy_backend.service;

import com.example.online_pharmacy_backend.model.Products;


public class ItemOfCart {
    public Products product;
    public int qty;

    public ItemOfCart(Products product,int qty){
        this.product = product;
        this.qty = qty;
    }
}
