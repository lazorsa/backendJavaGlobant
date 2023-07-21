package com.guide10.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example06 {
    public static void main(String[] args) {
        /**
         * ArrayList Collection with object sort example
         */
        System.out.println("ArrayList Collection with object sort example");
        ArrayList<Libro> libros = new ArrayList();
        libros.add(new Libro("El señor de los anillos", 1000));
        libros.add(new Libro("El hobbit", 500));
        libros.add(new Libro("El silmarillion", 300));

        /**
         * Set Collection with object sort example
         */
        System.out.println("Set Collection with object sort example");
        HashSet<Perro> perros = new HashSet();
        perros.add(new Perro("Firulais", 5));
        perros.add(new Perro("Beethoven", 3));
        perros.add(new Perro("Shery", 3));
        perros.add(new Perro("Mila", 1));

        /**
         * Map Collection with object sort example
         */
        System.out.println("Map Collection with object sort example");
        HashMap<Integer, Alumno> alumnos = new HashMap();
        alumnos.put(1, new Alumno("Juan", 20));
        alumnos.put(2, new Alumno("Pedro", 18));
        alumnos.put(3, new Alumno("Maria", 19));
        alumnos.put(4, new Alumno("Jose", 21));

    }
}

class Libro {
    private String titulo;
    private int paginas;

    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }
}

class Perro {
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
