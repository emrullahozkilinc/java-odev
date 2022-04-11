package patikastore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class StoreNode {
    TreeSet<Product> products;

    public StoreNode() {
        products = new TreeSet<Product>(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    void addProduct(Product p) {
        for (int i = 1;; i++) {
            if(!getIds().contains(i)){
                p.setId(i);
                products.add(p);
                return;
            }
        }
    }

    ArrayList<Integer> getIds(){
        ArrayList<Integer> ids = new ArrayList<>();
        for (Product p : products) {
            ids.add(p.getId());
        }
        return ids;
    }

    void removeProduct(int id) {
        products.remove(products.stream().filter(p -> p.getId() == id).findFirst().get());
    }

    Product getProduct(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public TreeSet<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return products.stream().map(Product::toString).reduce("", (s, s2) -> s + "\n" + s2);
    }
}
