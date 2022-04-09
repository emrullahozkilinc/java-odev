package patikastore;

import java.util.Comparator;

public abstract class Brand {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class BrandCompare implements Comparator<Brand> {
    public int compare(Brand m1, Brand m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
