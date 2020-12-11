package com.software_development.lesson4.Book;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        BookList bookList = new BookList(new ArrayList<>());

        bookList.addBook("Little prince", "Exuperi", "Reynal End Xichkok", 1946, 196, 5, "Hard");
        bookList.addBook("War and Peace", "L.Tolstoi", "Russkiy vestnik", 1805, 361, 10, "Hard");
        bookList.addBook("Tom Thumb", "Sharl Perro", "Rychard Johnson", 1621, 40, 5, "Soft");
        bookList.addBook("Kid and carlson", "Astrid Lindgen", "Maxaon", 2018, 176, 15, "Hard");
        bookList.addBook("Harry Potter", "Joan Rouling", "Joan Rouling", 1997, 432, 20, "Hard");

        System.out.println("books by Joan Rouling:");
        ArrayList<Book> autorsBook = bookList.getBooksByAuthor("Joan Rouling");
        for (Book book : autorsBook) {
            System.out.println(book);
        }

        System.out.println("\nbooks published by \"Russkiy vestnik \":");
        ArrayList<Book> publishersBook = bookList.getBooksByPublishing("Russkiy vestnik");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("\nbooks released after 1990:");
        ArrayList<Book> releasedAfter = bookList.getBooksAfterAge(1990);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}
