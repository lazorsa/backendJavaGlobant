package com.guide10.example;

import java.util.*;

public class Example05 {
    public static void main(String[] args) {
        /**
         * ArrayList Collection sort example
         */
        System.out.println("ArrayList Collection sort example");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(2);
        Collections.sort(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * Set Collection sort example
         */
        System.out.println("Set Collection sort example");
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(2);
        ArrayList<Integer> list2 = new ArrayList<>(set); // set to list
        Collections.sort(list2);
        Iterator<Integer> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        /**
         * Map Collection sort example
         */
        System.out.println("Map Collection sort example");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "five");
        map.put(3, "three");
        map.put(1, "one");
        map.put(2, "two");
        TreeMap<Integer, String> treeMap = new TreeMap<>(map); // map to treeMap
        Iterator<Integer> iterator3 = treeMap.keySet().iterator();
        while (iterator3.hasNext()) {
            Integer key = iterator3.next();
            System.out.println(key + " : " + treeMap.get(key));
        }

    }
}
