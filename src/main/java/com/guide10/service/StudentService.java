package com.guide10.service;

import com.guide10.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentService {
    ArrayList<Student> students = new ArrayList<>();
    static final int NOTES = 3;
    public static Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getAge().compareTo(s2.getAge());
        }
    };

    /**
     * Repeating cycle to create students with their personal information and notes
     */
    public void createStudents() {
        Scanner scanner = new Scanner(System.in);
        do {
            Student student = new Student();
            System.out.println("Ingrese el nombre del estudiante: ");
            student.setName(scanner.nextLine());
            System.out.println("Ingrese la edad del estudiante: ");
            student.setAge(scanner.nextInt());
            scanner.nextLine();
            for (int i = 0; i < NOTES; i++) {
                System.out.println("Ingrese la nota " + (i + 1) + " del estudiante: ");
                student.getNote().add(scanner.nextInt());
                scanner.nextLine();
            }
            students.add(student);
            System.out.println("¿Desea ingresar otro estudiante? (S/N)");
        } while (scanner.nextLine().equalsIgnoreCase("S"));
    }

    /**
     * Method to calculate the final note of a student
     */
    public void finalNote() {
        System.out.println("Ingrese el nombre del estudiante: ");
        String name = new Scanner(System.in).nextLine();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("La nota final de " + student.getName() + " es: " + averageNotes(student) + ".");
            }
        }

    }

    /**
     * Average of notes of one student
     */
    public Double averageNotes(Student student) {
        Double average = 0.0;
        for (Integer note : student.getNote()) {
            average += note;
        }
        return average / student.getNote().size();
    }


}
