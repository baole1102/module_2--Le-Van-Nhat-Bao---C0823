package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{

    private static final IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findByAll() {
        return productRepository.findByAll();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public List<Product> findName(String name) {
        return productRepository.findName(name);
    }
}
