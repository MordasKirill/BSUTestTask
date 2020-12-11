package com.software_development.lesson4.Book;

import com.software_development.lesson4.Customer.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class BookList {
    private ArrayList<Book> books;

    BookList(ArrayList<Book> books) {

        this.books = books;
    }
    public void addBook (String bookName, String authors, String publishing, int yearOfIssue, int amountOfPages, int prise, String bindingType){
        this.books.add(new Book(bookName, authors, publishing, yearOfIssue, amountOfPages, prise, bindingType));
    }

    ArrayList<Book> getBooksByAuthor(String author){
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getAuthors().equalsIgnoreCase(author)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> getBooksByPublishing(String publishing){
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getPublishing().equalsIgnoreCase(publishing)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    ArrayList<Book> getBooksAfterAge(int age){
        ArrayList<Book> ageList = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getYearOfIssue() >= age) {
                ageList.add(book);
            }
        }
        return ageList;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
