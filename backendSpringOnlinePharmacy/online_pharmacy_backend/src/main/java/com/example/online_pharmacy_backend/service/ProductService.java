package com.example.online_pharmacy_backend.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.online_pharmacy_backend.model.ItemsInCart;
import com.example.online_pharmacy_backend.model.Products;
import com.example.online_pharmacy_backend.repositary.ProductsRepo;

@Service
public class ProductService {
    private ProductsRepo productRepo;

    public ProductService(ProductsRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Products> getall()
    {
        return productRepo.findAll();
    }

    public Products getallId(int product_id)
    {
        return productRepo.findById(product_id).orElse(null);
    }

    // public List<ItemsInCart> getSortedList(String field) {
    //     return productRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    // }

    //  public List<ItemsInCart> getPageList(int offset, int pagesize) {
    //     Page<ItemsInCart> k = productRepo.findAll(PageRequest.of(offset, pagesize));
    //     return k.getContent();
    // }
}

