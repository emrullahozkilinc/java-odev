package bookentity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList();

        books.add(new Book("asd", 332, "wqf", LocalDate.of(1998,12,3)));
        books.add(new Book("bvfds", 443, "dvs", LocalDate.of(1994,2,13)));
        books.add(new Book("zxca", 52, "asd", LocalDate.of(1996,1,31)));
        books.add(new Book("asdc", 34, "sdbv", LocalDate.of(1938,6,30)));
        books.add(new Book("asz", 42, "sac", LocalDate.of(1994,5,23)));
        books.add(new Book("ger", 534, "asx", LocalDate.of(1991,8,3)));
        books.add(new Book("wqd", 1234, "fbds", LocalDate.of(1993,4,3)));
        books.add(new Book("vsd", 432, "asd", LocalDate.of(1997,6,3)));
        books.add(new Book("asx", 362, "qwe", LocalDate.of(1994,7,3)));
        books.add(new Book("bfd", 163, "fdsv", LocalDate.of(1992,2,3)));

        List<Book> under100 = books.stream().filter(book -> (book.getPages() < 100)).toList();

        Map<String, String> book_author = new HashMap<>();

        books.forEach(book -> book_author.put(book.getName(),book.getAuthor()));
        book_author.forEach((x,y) -> System.out.println(x+" : "+y));
        System.out.println("------------------------");
        under100.stream().forEach(System.out::println);
    }
}
