package com.example.demo.service;

import com.example.demo.model.Product;


import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductById(Long id);
    Product createProduct(Product product);
    boolean deleteProduct(Long id);



}
