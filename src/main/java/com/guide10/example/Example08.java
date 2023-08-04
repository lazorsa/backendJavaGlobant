package com.guide10.example;

import com.guide10.entity.Student;
import com.guide10.entity.Book;
import com.guide10.entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Example08 {
    public static void main(String[] args) {
        /**
         * Comparator example in List
         */
        System.out.println("Comparator example in Liste");
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Firulais", 5));
        dogs.add(new Dog("Max", 3));
        dogs.add(new Dog("Bethoven", 7));
        dogs.add(new Dog("Laica", 1));
        dogs.sort(Dog.ageComparator);
        dogs.forEach(System.out::println);
        System.out.println();

        /**
         * Comparator example in Set
         */
        System.out.println("Comparator example in Set");
        HashSet<Dog> dogsSet = new HashSet<>();
        dogsSet.add(new Dog("Firulais", 5));
        dogsSet.add(new Dog("Max", 3));
        dogsSet.add(new Dog("Bethoven", 7));
        dogsSet.add(new Dog("Laica", 1));
        ArrayList<Dog> dogsList = new ArrayList<>(dogsSet);
        dogsList.sort(Dog.ageComparator);
        dogsList.forEach(System.out::println);
        System.out.println();

        /**
         * Comparator example in TreeSet
         */
        System.out.println("Comparator example in TreeSet");
        TreeSet<Dog> dogsTreeSet = new TreeSet<>(Dog.ageComparator);
        dogsTreeSet.add(new Dog("Firulais", 5));
        dogsTreeSet.add(new Dog("Max", 3));
        dogsTreeSet.add(new Dog("Bethoven", 7));
        dogsTreeSet.add(new Dog("Laica", 1));
        dogsTreeSet.forEach(System.out::println);
        System.out.println();

        /**
         * Comparator example in Map
         */
        System.out.println("Comparator example in Map");
        HashMap<Integer, Student> students = new HashMap<>();
        ArrayList<Student> studentsList = new ArrayList<>(students.values());
        studentsList.sort(Student.ageComparator);

    }
}
