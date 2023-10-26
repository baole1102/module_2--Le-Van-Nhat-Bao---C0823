package ss11_java_collection.exc.linkedlist.controller;

import ss11_java_collection.exc.linkedlist.module.Product;
import ss11_java_collection.exc.linkedlist.service.IProductService;
import ss11_java_collection.exc.linkedlist.service.impl.ProductService;

import java.util.List;

public class ProductController {
private IProductService iProductService = new ProductService();
    public void addProduct(Product product) {
        iProductService.addProduct(product);
    }

    public List<Product> showList() {
        return iProductService.showList();
    }

    public Boolean removeProduct(Integer code) {
        return iProductService.removeProduct(code);
    }

    public Product findById(Integer code){
        return iProductService.findByCode(code);
    }

    public void findName(String str) {
         iProductService.findName(str);
    }

    public void sortUpper() {
        iProductService.sortUpper();
    }

    public void sortLower() {
        iProductService.sortLower();
    }
    public void editProduct(Integer code ,Product product) {
        iProductService.editProduct(code,product);
    }
}
