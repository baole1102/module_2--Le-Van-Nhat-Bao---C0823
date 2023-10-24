package ss11_java_collection.exc.arrlist.controller;

import ss11_java_collection.exc.arrlist.service.IProductService;
import ss11_java_collection.exc.arrlist.service.ProductService;

public class ProductController {
    private IProductService iProductService = new ProductService();

    public void showList() {
        iProductService.showList();
    }


    public void add() {
        iProductService.add();
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


    public void ArrangeToUpper() {
        iProductService.ArrangeToUpper();
    }

    public void ArrangToLower() {
        iProductService.ArrangToLower();
    }

    public void Arrange() {
        iProductService.Arrange();
    }

}
