package com.example.online_pharmacy_backend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.online_pharmacy_backend.model.ItemsInCart;
import com.example.online_pharmacy_backend.model.Products;
import com.example.online_pharmacy_backend.service.ProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    @GetMapping("/products")
    public List<Products> getMethodName() {
        return productService.getall();
    }
    @GetMapping("/products/{product_id}")
    public Products getMethodNameId(@PathVariable int product_id) {
        return productService.getallId(product_id);
    }

    // @GetMapping("/sortBy/{field}")
    // public List<ItemsInCart> sortByRate(@PathVariable("field") String field) {
    //     return productService.getSortedList(field);
    // }

    // @GetMapping("/pagination/{offset}/{pagesize}")
    // public List<ItemsInCart> getMethodName1(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) {
    //     return productService.getPageList(offset,pagesize);
    // }
    
}


