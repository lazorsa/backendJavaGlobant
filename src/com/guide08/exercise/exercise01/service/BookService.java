package com.guide08.exercise.exercise01.service;

import com.guide08.exercise.exercise01.entity.Book;

import java.util.Scanner;

public class BookService {
    private Book book = new Book();
    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Book createBook() {
        System.out.println("ENTER BOOK INFORMATION:");
        System.out.println("ISBN: ");
        book.setISBN(scanner.next());
        System.out.println("Título: ");
        book.setTitulo(scanner.next());
        System.out.println("Autor: ");
        book.setAutor(scanner.next());
        System.out.println("Número de páginas: ");
        book.setNumeroPaginas(scanner.nextInt());
        return book;
    }

    public Book createBook(String ISBN, String titulo, String autor, int numeroPaginas) {
        book.setISBN(ISBN);
        book.setTitulo(titulo);
        book.setAutor(autor);
        book.setNumeroPaginas(numeroPaginas);
        return book;
    }

    public void printBook(Book book) {
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Título: " + book.getTitulo());
        System.out.println("Autor: " + book.getAutor());
        System.out.println("Número de páginas: " + book.getNumeroPaginas());
    }
}
