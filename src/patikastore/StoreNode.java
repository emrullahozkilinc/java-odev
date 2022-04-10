package patikastore;

import java.util.TreeSet;

public class StoreNode {
    TreeSet<Product> products;

    public StoreNode() {
        products = new TreeSet<Product>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    public TreeSet<Product> getProducts() {
        return products;
    }
}
