package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();

    void addNewProduct(Product product);

    Product findById(int id);

    void update(int id,Product product);

    void remove(int id);
    List<Product> search(String name);
    Product information(int id);
}
