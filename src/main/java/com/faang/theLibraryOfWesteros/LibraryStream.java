package com.faang.theLibraryOfWesteros;

import java.util.Map;
import java.util.Set;

public class LibraryStream {

    private Map<Book, String> books;

    public LibraryStream(Map<Book, String> books) {
        this.books = books;
    }

    public void addBook(String title, String author, int year, String location) {
        Book book = new Book(title, author, year);
        books.put(book, location);
    }

    public void removeBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        books.remove(book);
    }

    public void findBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        if (books.containsKey(book)) {
            System.out.println(books.get(book));
        } else {
            System.out.println("Book has not found");
        }
    }

    public void printAllBooks() {
        for (Map.Entry<Book, String> entry : books.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
