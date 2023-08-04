package com.guide10.exercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Exercise01_Dogs {

    public static void main(String[] args) {
        ArrayList<String> dogs = new ArrayList<>();
        do {
            System.out.println("Ingrese una raza de perro: ");
            dogs.add(new Scanner(System.in).nextLine());
            System.out.println("Desea ingresar otra raza de perro? (S/N)");
        } while (new Scanner(System.in).nextLine().equalsIgnoreCase("S"));
        System.out.println("Razas de perros ingresadas: ");
        dogs.forEach(System.out::println);

    }
}
