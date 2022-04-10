package patikastore;

import patikastore.enums.Brands;

import java.util.Comparator;

public class Brand {
    int id;
    Brands name;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brands getName() {
        return name;
    }

    public void setName(Brands name) {
        this.name = name;
    }
}

class BrandCompare implements Comparator<Brand> {
    public int compare(Brand m1, Brand m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
