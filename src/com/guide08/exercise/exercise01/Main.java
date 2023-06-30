package com.guide08.exercise.exercise01;

import com.guide08.exercise.exercise01.entity.Book;
import com.guide08.exercise.exercise01.service.BookService;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * número de páginas.
 */
public class Main {
    public static void main(String[] args) {
        BookService bs = new BookService();
        Book b1 = bs.createBook("123456789", "The Lord of the Rings", "J. R. R. Tolkien", 1000);
        Book b2 = bs.createBook("987654321", "The Hobbit", "J. R. R. Tolkien", 500);
        Book b3 = bs.createBook("123456789", "The Silmarillion", "J. R. R. Tolkien", 800);

        bs.printBook(b1);
        bs.printBook(b2);
        bs.printBook(b3);

    }
}
