package ss16_io_biobanry.exc.bt1.repository;

import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.util.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findName(String name) {
        products = WriteFile.readFile();
        List<Product> products1 = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                products1.add(product);
            }
        }
        return products1;
    }
    @Override
    public List<Product> showList() {
        return WriteFile.readFile();

    }

    @Override
    public void addProduct(Product product) {
        products = WriteFile.readFile();
        products.add(product);
        WriteFile.writeFile(products);
    }


}
