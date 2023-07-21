package com.guide10.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Remove's example
 */
public class Example02 {
    public static void main(String[] args) {
        /**
         * ArrayList example to remove
         */
        System.out.println("ArrayList example to remove");
        ArrayList<Integer> numbersA = new ArrayList();
        numbersA.add(20);
        numbersA.add(30);
        numbersA.add(40);
        numbersA.add(50);
        numbersA.add(60);
        numbersA.remove(0);
        Integer number = 60;
        numbersA.remove(number);
        for (int i = 0; i < numbersA.size(); i++) {
            System.out.println(numbersA.get(i));
        }

        /**
         * Set example
         */
        System.out.println("Set example to remove");
        HashSet<Integer> numbersB = new HashSet<Integer>();
        numbersB.add(20);
        numbersB.add(20);
        numbersB.add(40);
        numbersB.add(40);
        numbersB.remove(40);
        numbersB.add(60);
        numbersB.add(60);
        for (Integer integer : numbersB) {
            System.out.println(integer);
        }

        /**
         * Map example
         */
        System.out.println("Map example to remove");
        HashMap<Integer, String> numbersC = new HashMap<Integer, String>();
        numbersC.put(12345678, "Juan");
        numbersC.put(87654321, "Pedro");
        numbersC.put(12345678, "Maria");
        numbersC.remove(87654321);
        numbersC.put(87654321, "Jose");
        numbersC.put(12345678, "Luis");
        for (Integer key : numbersC.keySet()) {
            System.out.println(key + " " + numbersC.get(key));
        }
    }

}
