package com.guide10.exercise;

import com.guide10.service.ProductService;

import java.util.Scanner;

public class Exercise06_Products {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Create product");
            System.out.println("2. Change price");
            System.out.println("3. Delete product");
            System.out.println("4. Show products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> productService.createProduct();
                case 2 -> productService.changePrice();
                case 3 -> productService.deleteProduct();
                case 4 -> productService.showProducts();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        } while (true);

    }
}
