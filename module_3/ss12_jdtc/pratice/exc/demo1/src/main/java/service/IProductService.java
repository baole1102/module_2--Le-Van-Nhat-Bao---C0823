package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void createProduct (Product product);
    void delete (int id);
    Product findById(int id);
    void update (int id,Product product);
    List<Product> findName(String name);
    Product detail(int id);
}
