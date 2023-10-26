package ss11_java_collection.exc.linkedlist.service;



import ss11_java_collection.exc.linkedlist.module.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> showList();

    Boolean removeProduct(Integer code);

    Product findByCode(Integer code);

    void findName(String str);

    void sortUpper();

    void sortLower();

    Product editProduct(Product product);
}
