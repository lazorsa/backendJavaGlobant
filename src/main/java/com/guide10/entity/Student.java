package com.guide10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private ArrayList<Integer> note;

    public static Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getAge().compareTo(s2.getAge());
        }
    };

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
