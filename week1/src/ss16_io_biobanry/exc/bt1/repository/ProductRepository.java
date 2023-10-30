package ss16_io_biobanry.exc.bt1.repository;

import ss16_io_biobanry.exc.bt1.module.Product;
import ss16_io_biobanry.exc.bt1.util.WriteFile;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Quan ao",500,"TQ","New"));
        products.add(new Product(2,"Bikini",600,"VN","New"));
        products.add(new Product(3,"Giay",700,"HQ","New"));
        products.add(new Product(4,"Mu",800,"NB","New"));
    }

    @Override
    public void addProduct(List<Product> products) {
      //  products.add(product);
        WriteFile.writeFile(products);

    }

    @Override
    public Product findName(String name) {
        for (Product product: products){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> showList() {
        return products;
    }


}
