package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static Book createBook(String title, String author) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("W pustyni i w puszczy", "H. Sienkiewicz"));
        books.add(new Book("Chata", "Young"));

        for (Book book : books) {
            if (book.equals(books))
            System.out.println(book);
            else System.out.println(books);
        }
        return new Book(title, author);
    }
}