package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl service;

    @GetMapping("/list")
    public List<Product> getAllProduct(){
        return service.getAllProduct();
    }

    @GetMapping("/list/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return service.getProductById(id);
    }

    @PostMapping("/add")
    public Product saveNewProduct(Product product){
        return service.createProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductById(@PathVariable("id") Long id){
        service.deleteProduct(id);
    }
}
