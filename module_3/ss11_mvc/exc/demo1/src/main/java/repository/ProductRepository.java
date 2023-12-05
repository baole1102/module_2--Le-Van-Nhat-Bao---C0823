package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private final static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Mỳ tôm thanh long", 25000, "Hot", "A Phương Lé"));
        products.add(new Product(2, "Xôi Kem", 25000, "Hot", "Độ Béo"));
        products.add(new Product(3, "Ốc Đá", 25000, "Hot", "Vi Ngáo"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public void delete(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1 : products) {
            if (product1.getId() == id) {
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setProducer(product.getProducer());
                break;
            }
        }
    }


    @Override
    public List<Product> findName(String name) {
        List<Product> list = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                list.add(product);
            }
        }

        if (list.isEmpty()){
            return new ArrayList<>();
        } else {
            return list;
        }
    }

    @Override
    public Product detail(int id) {
        for (Product product1 : products) {
            if (product1.getId() == id) {
                return product1;
            }
        }
        return null;
    }
}
