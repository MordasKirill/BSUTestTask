package com.software_development.lesson4.Book;

public class Book {
    private String bookName;
    private String authors;
    private String publishing;
    private int yearOfIssue;
    private int amountOfPages;
    private int prise;
    private String bindingType;

    Book(String bookName, String authors, String publishing, int yearOfIssue, int amountOfPages, int prise, String bindingType){
        this.bookName = bookName;
        this.authors = authors;
        this.publishing = publishing;
        this.yearOfIssue = yearOfIssue;
        this.amountOfPages = amountOfPages;
        this.prise = prise;
        this.bindingType = bindingType;

    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authors='" + authors + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", amountOfPages=" + amountOfPages +
                ", prise=" + prise +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}
