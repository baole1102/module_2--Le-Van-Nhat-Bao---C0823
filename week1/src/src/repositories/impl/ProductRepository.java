package src.repositories.impl;

import src.models.Product;
import src.repositories.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Chocolate", 12445l));
        products.add(new Product(2, "Chocolate1", 12445l));
        products.add(new Product(3, "Chocolate2", 12445l));

    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(Integer id) {
        for (Product product: products) {
            if(product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        for(Product product: products) {
            if(product.getId().equals(id)) {
                products.remove(product);
                break;
            }
        }
    }
}
