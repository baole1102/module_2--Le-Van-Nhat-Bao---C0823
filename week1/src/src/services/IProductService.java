package src.services;

import src.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    void createProduct(Product product);

    Boolean removeProduct(Integer id);
}
