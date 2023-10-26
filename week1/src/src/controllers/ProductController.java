package src.controllers;

import src.models.Product;
import src.services.IProductService;
import src.services.impl.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();
    public List<Product> getAll() {
        return productService.getAll();
    }

    public void addProduct(Product product) {
        productService.createProduct(product);
    }

    public Boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }
}
