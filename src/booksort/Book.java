package booksort;

import java.util.Comparator;

public class Book implements Comparator<Book> {
    String name;
    int totalPage;
    String type;
    double price;

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o1.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
