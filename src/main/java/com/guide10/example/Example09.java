package com.guide10.example;

import com.guide10.entity.Book;
import com.guide10.service.BookService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example09 {
    public static void main(String[] args) {
        // Collection in ArrayList
        System.out.println("Collection in ArrayList");
        ArrayList<Book> books = new ArrayList<>();
        BookService bookService = new BookService();
        bookService.addBook(books, "El señor de los anillos", 1000);
        bookService.addBook(books, "El hobbit", 500);
        bookService.addBook(books, "El arte de la guerra", 200);
        bookService.addBook(books, "El Quijote", 1000);
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        //Collection in Set
        System.out.println("Collection in Set");
        HashSet<Book> booksSet = new HashSet<>();
        BookService bookServiceSet = new BookService();
        bookServiceSet.addHashSet(booksSet, "El señor de los anillos", 1000);
        bookServiceSet.addHashSet(booksSet, "El hobbit", 500);
        bookServiceSet.addHashSet(booksSet, "El arte de la guerra", 200);
        bookServiceSet.addHashSet(booksSet, "El Quijote", 1000);
        for (Book book : booksSet) {
            System.out.println(book);
        }
        System.out.println();

        //Collection in Map
        System.out.println("Collection in Map");
        HashMap<Integer, Book> booksMap = new HashMap<>();
        BookService bookServiceMap = new BookService();
        bookServiceMap.addHashMap(booksMap, "El señor de los anillos", 1000);
        bookServiceMap.addHashMap(booksMap, "El hobbit", 500);
        bookServiceMap.addHashMap(booksMap, "El arte de la guerra", 200);
        bookServiceMap.addHashMap(booksMap, "El Quijote", 1000);
        for (Integer key : booksMap.keySet()) {
            System.out.println(booksMap.get(key));
        }


    }
}
