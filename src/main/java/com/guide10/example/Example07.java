package com.guide10.example;

import com.guide10.entity.Student;
import com.guide10.entity.Book;
import com.guide10.entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example07 {
    public static void main(String[] args) {
        /**
         * Show ArrayList with object example
         */
        System.out.println("Show ArrayList with object example");
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("El señor de los anillos", 1000));
        books.add(new Book("El hobbit", 500));
        books.add(new Book("El silmarillion", 300));
        for (Book example : books) {
            System.out.println(example);
        }
        System.out.println();

        /**
         * Show Set with object example
         */
        System.out.println("Show Set with object example");
        HashSet<Dog> dogs = new HashSet();
        dogs.add(new Dog("Firulais", 5));
        dogs.add(new Dog("Beethoven", 3));
        dogs.add(new Dog("Shery", 3));
        dogs.add(new Dog("Mila", 1));
        for (Dog example : dogs) {
            System.out.println(example);
        }
        System.out.println();

        /**
         * Show Map with object example
         */
        System.out.println("Show Map with object example");
        HashMap<Integer, Student> alumnos = new HashMap();
        alumnos.put(1, new Student("Juan", 20));
        alumnos.put(2, new Student("Pedro", 18));
        alumnos.put(3, new Student("Maria", 19));
        alumnos.put(4, new Student("Jose", 21));
        for (Integer key : alumnos.keySet()) {
            System.out.println(alumnos.get(key));
        }

    }
}
