package booksort;

import java.util.*;

public class Main {
    public static void main(String[] args){
        TreeSet<Book> books = new TreeSet(new Book());
        books.add(new Book("homo sapiens",332,"romance",17.0, "Victor Hugo", new Date()));
        books.add(new Book("sineklerin tanrısı",332,"romance",17.0, "Victor Hugo", new Date()));
        books.add(new Book("sefiller",332,"romance",17.0, "Victor Hugo", new Date()));
        books.add(new Book("körlük",332,"romance",17.0, "Victor Hugo", new Date()));
        books.add(new Book("cesur yeni dünya",332,"romance",17.0, "Victor Hugo", new Date()));

        TreeSet<Book> books2 = new TreeSet(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return (o1.getTotalPage() > o1.getTotalPage())?1:-1;
            }
        });

        books2.addAll(books);

        for(Book b:books){
            System.out.println(b);
        }

        for(Book b:books2){
            System.out.println(b);
        }

    }
}
