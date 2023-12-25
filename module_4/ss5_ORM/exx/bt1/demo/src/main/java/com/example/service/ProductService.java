package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<Product> showList() {
        return iProductRepository.showList() ;
    }

    @Override
    public void addNewProduct(Product product) {
        iProductRepository.addNewProduct(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {
        iProductRepository.update(id,product);
    }

    @Override
    public void remove(int id) {
        iProductRepository.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        return iProductRepository.search(name);
    }

    @Override
    public Product information(int id) {
        return iProductRepository.information(id);
    }
}
