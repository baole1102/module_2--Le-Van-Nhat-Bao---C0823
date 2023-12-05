package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements  IProductService{
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void createProduct(Product product) {
        iProductRepository.createProduct(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public Product findById(int id) {
       return iProductRepository.findById(id);
    }


    @Override
    public void update(int id,Product product) {
        iProductRepository.update(id,product);
    }

    @Override
    public List<Product> findName(String name) {
        return iProductRepository.findName(name);
    }

    @Override
    public Product detail(int id) {
        return iProductRepository.detail(id);
    }
}
