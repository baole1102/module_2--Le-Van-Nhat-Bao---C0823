package ss16_io_biobanry.exc.bt1.service;

import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.repository.IProductRepository;
import ss16_io_biobanry.exc.bt1.repository.ProductRepository;

import java.util.List;

public class  ProductService implements IProductService {
private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findName(String name) {
        return iProductRepository.findName(name);
    }

    @Override
    public List<Product> showList() {
        return iProductRepository.showList();
    }

    @Override
    public void addProduct(Product product) {
        iProductRepository.addProduct(product);
    }


}
