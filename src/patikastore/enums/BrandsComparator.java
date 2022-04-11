package patikastore.enums;

public class BrandsComparator implements java.util.Comparator<Brands> {
    @Override
    public int compare(Brands o1, Brands o2) {
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
