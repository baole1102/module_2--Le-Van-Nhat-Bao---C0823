package ss16_io_biobanry.exc.bt1.repository;

import ss16_io_biobanry.exc.bt1.module.Product;

import java.util.List;

public interface IProductRepository {



    void addProduct(List<Product> products);


    Product findName(String name);

    List<Product> showList();
}
