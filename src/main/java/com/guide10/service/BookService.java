package com.guide10.service;

import com.guide10.entity.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BookService {

    public void addBook(ArrayList<Book> books, String titulo, int paginas) {
        books.add(new Book(titulo, paginas));
    }

    public void addHashSet(HashSet<Book> books, String titulo, int paginas) {
        books.add(new Book(titulo, paginas));
    }

    public void addHashMap(HashMap<Integer, Book> books, String titulo, int paginas) {
        books.put(books.size() + 1, new Book(titulo, paginas));
    }

    public ArrayList<Book> addBook(ArrayList<Book> books, Book book) {
        books.add(book);
        return books;
    }

    public HashSet<Book> addHashSet(HashSet<Book> books, Book book) {
        books.add(book);
        return books;
    }

    public HashMap<Integer, Book> addHashMap(HashMap<Integer, Book> books, Book book) {
        books.put(books.size() + 1, book);
        return books;
    }
}
