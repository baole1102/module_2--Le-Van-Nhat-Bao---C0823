package ss16_io_biobanry.exc.bt1.controller;


import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.service.IProductService;
import ss16_io_biobanry.exc.bt1.service.ProductService;

import java.util.List;

public class ProductController {
    private IProductService iProductService = new ProductService() ;

    public List<Product> findName(String name) {
        return iProductService.findName(name);
    }

    public List<Product> showList() {
        return iProductService.showList();
    }

    public void addProduct(Product product) {
        iProductService.addProduct(product);
    }
}
