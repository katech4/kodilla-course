package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
      Book book = BookManager.createBook("W pustyni i w puszczy", "H.Sienkiewicz");
      Book book1 = BookManager.createBook("Lalka", "B.Prus");
      Book book2 = BookManager.createBook("Pan Tadeusz", "A.Mickiewicz");

        System.out.println(book == book1);
        System.out.println(book.equals(book1));
        System.out.println("--------------------");
        System.out.println(book == book2);
        System.out.println(book.equals(book2));
        System.out.println("--------------------");
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));


    }
}
