package com.example.online_pharmacy_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.online_pharmacy_backend.model.ItemsInCart;
import com.example.online_pharmacy_backend.model.Products;
import com.example.online_pharmacy_backend.repositary.ItemsInCartRepo;
import com.example.online_pharmacy_backend.repositary.ProductsRepo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Service
public class AddtoCartService {

    @Autowired
    public ItemsInCartRepo itemsInCartRepo;

    @Autowired
    public ProductService productService;

    public ItemsInCart postProduct(ItemsInCart product) {
        return itemsInCartRepo.save(product);
    }

    public List<ItemOfCart> getAllItems(String username) {
        List<ItemsInCart> items = itemsInCartRepo.findByUsername(username);
        List<ItemOfCart> products = new ArrayList<>();

        for (ItemsInCart i : items) {
            Products item = productService.getallId(i.getProduct_id());
            int qty = i.getQty();
            ItemOfCart itemOfCart = new ItemOfCart(item, qty);
            products.add(itemOfCart);
        }

        return products;
    }
}
