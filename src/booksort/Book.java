package booksort;

import java.util.Comparator;
import java.util.Date;

public class Book implements Comparator<Book> {
    String name;
    int totalPage;
    String type;
    double price;
    String author;
    Date date;

    public Book(){}

    public Book(String name, int totalPage, String type, double price, String author, Date date) {
        this.name = name;
        this.totalPage = totalPage;
        this.type = type;
        this.price = price;
        this.author = author;
        this.date = date;
    }

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", totalPage=" + totalPage +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", date=" + date +
                '}';
    }
}
