package com.guide10.service;

import com.guide10.entity.Dog;
import java.util.Comparator;

public class DogService {
    public static Comparator<Dog> ageComparator = new Comparator<Dog>() {
        @Override
        public int compare(Dog o1, Dog o2) {
            return o2.getEdad().compareTo(o1.getEdad());
        }
    };

    public static Comparator<Dog> nameComparator = new Comparator<Dog>() {
        @Override
        public int compare(Dog o1, Dog o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
