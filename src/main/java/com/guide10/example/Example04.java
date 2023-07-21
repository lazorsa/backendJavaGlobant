package com.guide10.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Example04 {
    public static void main(String[] args) {
        /**
         * Iterator example
         */
        System.out.println("Iterator example");
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Juan");
        lista.add("Pedro");

        Iterator<String> iterator = lista.iterator();
        System.out.println("Items in the list");
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" ");
        }
        System.out.println();

        /**
         * Iterator remove example on ArrayList
         */
        System.out.println("Iterator remove example on ArrayList");
        ArrayList<String> palabras = new ArrayList<String>();
        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Hola")) {
                it.remove();
            }
        }

        /**
         * Iterator remove example on Set
         */
        System.out.println("Iterator remove example on Set");
        HashSet<Integer> numbersSet = new HashSet<Integer>();
        Iterator<Integer> it2 = numbersSet.iterator();
        while (it2.hasNext()) {
            if (it2.next()==3) {
                it2.remove();
            }
        }


    }
}
