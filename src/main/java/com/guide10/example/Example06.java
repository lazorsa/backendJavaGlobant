package com.guide10.example;

import com.guide10.entity.Book;
import com.guide10.entity.Dog;
import com.guide10.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example06 {
    public static void main(String[] args) {
        /**
         * ArrayList Collection with object sort example
         */
        System.out.println("ArrayList Collection with object sort example");
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("El señor de los anillos", 1000));
        books.add(new Book("El hobbit", 500));
        books.add(new Book("El silmarillion", 300));

        /**
         * Set Collection with object sort example
         */
        System.out.println("Set Collection with object sort example");
        HashSet<Dog> dogs = new HashSet();
        dogs.add(new Dog("Firulais", 5));
        dogs.add(new Dog("Beethoven", 3));
        dogs.add(new Dog("Shery", 3));
        dogs.add(new Dog("Mila", 1));

        /**
         * Map Collection with object sort example
         */
        System.out.println("Map Collection with object sort example");
        HashMap<Integer, Student> alumnos = new HashMap();
        alumnos.put(1, new Student("Juan", 20));
        alumnos.put(2, new Student("Pedro", 18));
        alumnos.put(3, new Student("Maria", 19));
        alumnos.put(4, new Student("Jose", 21));

    }
}

