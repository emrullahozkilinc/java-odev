package booksort;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args){
        TreeSet<Book> books = new TreeSet(new Book());
        books.add(new Book("homo sapiens",36,"romance",179.0, "Victor H4ugo", LocalDate.now()));
        books.add(new Book("homo sapiens",332,"romance",17.0, "Victor Hugo", LocalDate.of(2,4,4)));
        books.add(new Book("homo sapiens",332,"romance",17.0, "Victor Hugo", LocalDate.of(3,4,3)));
        books.add(new Book("körlük",55,"romance",17.0, "Victor Hugo", LocalDate.of(4,4,6)));
        books.add(new Book("cesur yeni dünya",22,"romance",17.0, "Victor Hugo", LocalDate.of(5,4,3)));

        System.out.println(books.size());

        TreeSet<Book> books2 = new TreeSet(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getTotalPage() > o2.getTotalPage())?1:-1;
            }
        });

        books2.addAll(books);

        for(Book b:books){
            System.out.println(b.toString());
        }

        for(Book b:books2){
            System.out.println(b.toString());
        }
    }
}
