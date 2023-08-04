package com.guide10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {
    private String nombre;
    private Integer edad;

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
