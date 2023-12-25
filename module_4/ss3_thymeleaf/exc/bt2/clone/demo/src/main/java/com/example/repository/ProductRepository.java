package com.example.repository;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(0, "Samsung", 500, "New", "Samsung"));
        products.add(new Product(1, "Iphone", 500, "New", "Iphone"));
        products.add(new Product(2, "Oppo", 500, "New", "Oppo"));
        products.add(new Product(3, "Nokia", 500, "New", "Nokia"));
    }

    @Override
    public List<Product> findByAll() {
        return products;
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1 : products){
            if (product1.getId() == id){
                product1.setId(id);
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setProcedure(product.getProcedure());
            }
        }
    }

    @Override
    public void delete(int id) {
       for (Product product : products){
           if (product.getId() == id){
               products.remove(product.getId());
               break;
           }
       }
    }

    @Override
    public List<Product> findName(String name) {
        List<Product> products1 = new ArrayList<>();
        for (Product product : products){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                products1.add(product);
            }
        }
        return products1;
    }
}
