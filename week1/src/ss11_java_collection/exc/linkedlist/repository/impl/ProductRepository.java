package ss11_java_collection.exc.linkedlist.repository.impl;


import ss11_java_collection.exc.linkedlist.module.Product;
import ss11_java_collection.exc.linkedlist.repository.IProductRepository;
import ss11_java_collection.exc.linkedlist.until.Comparetor;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("Dien thoai", 1, 56l));
        products.add(new Product("May tinh", 2, 100l));
        products.add(new Product("Quan ao", 3, 20l));
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> showList() {
        return products;
    }

    @Override
    public void deleteByCode(Integer code) {
        for (Product product : products) {
            if (product.getCode() == code) {
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public Product findByCode(Integer code) {
        for (Product product : products) {
            if (product.getCode() == code) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void findName(String str) {
        boolean condition = false;
        for (Product product : products) {
            if (product.getNameProduct().toLowerCase().contains(str.toLowerCase())) {
                System.out.println(product);
                condition = true;
            }
        }
        if (!condition) {
            System.out.println("Khong tim thay san pham");
        }
    }

    @Override
    public void sortUpper() {
        Comparator comparator = new Comparetor(true);
        Collections.sort(products, comparator);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void sortLower() {
        Comparator comparator = new Comparetor(false);
        Collections.sort(products, comparator);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void editProduct(Integer code,Product product) {
        for (Product product1 : products) {
            if (product1.getCode() == code) {
                product1.setNameProduct(product.getNameProduct());
                product1.setPrice(product.getPrice());
                break;
            }
        }
    }


}
