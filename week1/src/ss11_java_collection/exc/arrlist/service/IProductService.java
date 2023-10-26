package ss11_java_collection.exc.arrlist.service;

import src.models.Product;

public interface IProductService {
    void  showList();
    void addProduct(Product product);
    void deleteProduct();
    void searchProduct();
    void editProduct();
    void arrangeToUpper();
    void arrangeToLower();
    void arrangeProduct();
}
