package patikastore;

import java.util.ArrayList;
import java.util.Comparator;
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
            try {
                new ArrayList<Product>(products).get(i-1);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Index: " + i);
                p.setId(i);
                products.add(p);
                return;
            }
        }
    }

    void removeProduct(int id) {
        products.remove(products.stream().filter(p -> p.getId() == id).findFirst().get());
    }

    public TreeSet<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return products.stream().map(Product::toString).reduce("", (s, s2) -> s + "\n" + s2);
    }
}
