package patikastore.enums;

public enum Brands {Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster;
    public String getBrand() {
        return this.name();
    }
}
class BrandsComparator implements java.util.Comparator<Brands> {
    public int compare(Brands o1, Brands o2) {
        return o1.compareTo(o2);
    }
}
