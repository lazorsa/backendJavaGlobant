package com.guide10.exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 * Después de mostrar los perros, al usuario se le pedirá
 * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
 * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
 * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
 * la lista ordenada.
 */
public class Exercise02_Delete_Dog {

    public static void main(String[] args) {
        ArrayList<String> dogs = new ArrayList<>();
        do {
            System.out.println("Ingrese una raza de perro: ");
            dogs.add(new Scanner(System.in).nextLine());
            System.out.println("Desea ingresar otra raza de perro? (S/N)");
        } while (new Scanner(System.in).nextLine().equalsIgnoreCase("S"));
        System.out.println("Razas de perros ingresadas: ");
        dogs.forEach(System.out::println);

        System.out.println("Ingrese una raza de perro para eliminar: ");
        String dog = new Scanner(System.in).nextLine();
        Iterator<String> iterator = dogs.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equalsIgnoreCase(dog)) {
                iterator.remove();
            }
        }
        System.out.println("Razas de perros ingresadas: ");
        dogs.sort(comparing);
        for (String d : dogs) {
            System.out.println(d);
        }

    }

    public static Comparator<String> comparing = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

}
