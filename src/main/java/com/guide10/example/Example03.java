package com.guide10.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Show's example
 */
public class Example03 {
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
        numbersC.put(25568479, "Juan");
        numbersC.put(87654321, "Pedro");
        numbersC.put(12345678, "Maria");
        numbersC.remove(87654321);
        numbersC.put(92857165, "Jose");
        numbersC.put(56821578, "Luis");
        /**
         * Key and value
         */
        for (Map.Entry<Integer,String> entry : numbersC.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        /**
         * Only key
         */
        for (Integer key : numbersC.keySet()) {
            System.out.println(key);
        }
        /**
         * Only value
         */
        for (String value : numbersC.values()) {
            System.out.println(value);
        }
    }

}
