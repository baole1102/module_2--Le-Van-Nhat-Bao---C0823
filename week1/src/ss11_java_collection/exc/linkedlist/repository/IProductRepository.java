package ss11_java_collection.exc.linkedlist.repository;



import ss11_java_collection.exc.linkedlist.module.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);


    List<Product> showList();

    void deleteByCode(Integer code);

    Product findByCode(Integer code);

    void findName(String str);

    void sortUpper();

    void sortLower();
    void editProduct ( Integer code,Product product);



}
