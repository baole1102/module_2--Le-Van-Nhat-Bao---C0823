package ss11_java_collection.exc.arrlist.repository;

import src.models.Product;

public interface IProductRepository {
    void  showList();
    void addProduct(Product product);
    void deleteProduct();
    void searchProduct();
    void editProduct();
    void arrangeToUpper();
    void arrangeToLower();
    void arrangeProduct();
}
