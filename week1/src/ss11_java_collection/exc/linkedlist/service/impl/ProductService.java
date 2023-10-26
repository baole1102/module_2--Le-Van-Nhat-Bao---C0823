package ss11_java_collection.exc.linkedlist.service.impl;

import ss11_java_collection.exc.linkedlist.module.Product;
import ss11_java_collection.exc.linkedlist.repository.IProductRepository;
import ss11_java_collection.exc.linkedlist.repository.impl.ProductRepository;
import ss11_java_collection.exc.linkedlist.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void addProduct(Product product) {
        iProductRepository.addProduct(product);
    }

    @Override
    public List<Product> showList() {
        return iProductRepository.showList();
    }

    @Override
    public Boolean removeProduct(Integer code) {
        Product product = iProductRepository.findByCode(code);
        if (product == null) {
            return false;
        } else {
           iProductRepository.deleteByCode(code);
            return true;
        }
    }

    @Override
    public Product findByCode(Integer code) {
        return iProductRepository.findByCode(code);
    }

    @Override
    public void findName(String str) {
        iProductRepository.findName(str);
    }

    @Override
    public void sortUpper() {
        iProductRepository.sortUpper();
    }

    @Override
    public void sortLower() {
        iProductRepository.sortLower();
    }

    @Override
    public void editProduct(Integer code,Product product) {
        iProductRepository.editProduct(code,product);
    }


}
