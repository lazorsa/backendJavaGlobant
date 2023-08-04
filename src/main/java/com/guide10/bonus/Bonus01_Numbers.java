package com.guide10.bonus;

import java.util.ArrayList;
import java.util.Scanner;

public class Bonus01_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number == -99) {
                break;
            }
            numbers.add(number);
        } while (true);
        printNumbers(numbers);
        sumNumbers(numbers);
        meanNumbers(numbers);
    }

    public static void printNumbers(ArrayList<Integer> numbers) {
        System.out.println("Numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static void sumNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Sum: " + sum);
    }

    public static void meanNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("Mean: " + sum / numbers.size());
    }
}
