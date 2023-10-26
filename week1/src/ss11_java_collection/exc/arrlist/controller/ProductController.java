package ss11_java_collection.exc.arrlist.controller;

import ss11_java_collection.exc.arrlist.model.Product;
import ss11_java_collection.exc.arrlist.service.IProductService;
import ss11_java_collection.exc.arrlist.service.ProductService;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void showList() {
        iProductService.showList();
    }


    public void addProduct(Product product) {
        iProductService.addProduct(product);
    }

    public void deleteProduct() {
        iProductService.deleteProduct();
    }


    public void searchProduct() {
        iProductService.searchProduct();
    }


    public void editProduct() {
        iProductService.editProduct();
    }


    public void arrangeToUpper() {
        iProductService.arrangeToUpper();
    }

    public void arrangeToLower() {
        iProductService.arrangeToLower();
    }

    public void Arrange() {
        iProductService.arrangeProduct();
    }

}
