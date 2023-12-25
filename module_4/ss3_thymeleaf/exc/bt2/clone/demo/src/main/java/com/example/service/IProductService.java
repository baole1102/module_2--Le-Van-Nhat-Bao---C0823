package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findByAll();
    void addProduct(Product product);
    Product findById(int id);
    void update(int id , Product product);
    void delete(int id);
    List<Product> findName(String name);
}
