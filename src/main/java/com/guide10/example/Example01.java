package com.guide10.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example01 {
    public static void main(String[] args) {
    /**
     * ArrayList example
     */
    ArrayList<Integer> numbersA = new ArrayList();
    numbersA.add(20);
    numbersA.add(30);
    numbersA.add(40);
    numbersA.add(50);
    numbersA.add(60);

    /**
     * Set example
     */
    HashSet<Integer> numbersB = new HashSet<Integer>();
    numbersB.add(20);
    numbersB.add(30);
    numbersB.add(40);
    numbersB.add(50);
    numbersB.add(60);

    /**
     * Map example
     */
    HashMap<Integer, String> numbersC = new HashMap<Integer, String>();
    numbersC.put(12345678, "Juan");
    numbersC.put(87654321, "Pedro");
    numbersC.put(12345678, "Maria");
    numbersC.put(87654321, "Jose");
    numbersC.put(12345678, "Luis");

    }

}
