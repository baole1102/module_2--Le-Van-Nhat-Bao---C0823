package ss16_io_biobanry.exc.bt1.controller;


import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.service.IProductService;
import ss16_io_biobanry.exc.bt1.service.ProductService;

import java.util.List;

public class ProductController {
    IProductService iProductService = new ProductService() ;



    public void addProduct(List<Product> products) {
        iProductService.addProduct(products);
    }


    public Product findName(String name) {
        return iProductService.findName(name);
    }

    public List<Product> showList() {
        return iProductService.showList();
    }
}
