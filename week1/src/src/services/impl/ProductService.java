package services.impl;

import src.models.Product;
import src.repositories.IProductRepository;
import src.repositories.impl.ProductRepository;
import src.services.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Boolean removeProduct(Integer id) {
        Product product = productRepository.findById(id);
        if(product == null) {
            return false;
        } else {
            productRepository.deleteById(id);
            return true;
        }

    }
}
