package ss11_java_collection.exc.linkedlist.until;

import ss11_java_collection.exc.linkedlist.module.Product;

import java.util.Comparator;

public class Comparetor implements Comparator<Product> {
    private final boolean condition;

    public Comparetor(boolean condition) {
        this.condition = condition;
    }
    @Override
    public int compare(Product o1, Product o2) {
        if (condition){
            return (int) (o1.getPrice() - o2.getPrice());
        }else {
            return (int) (  o2.getPrice() - o1.getPrice());
        }
    }
}
