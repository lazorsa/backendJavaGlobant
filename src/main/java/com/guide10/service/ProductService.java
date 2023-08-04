package com.guide10.service;

import com.guide10.entity.Product;

import java.util.HashMap;
import java.util.Scanner;

public class ProductService {
    private final Scanner scanner = new Scanner(System.in);
    HashMap<String, Product> products = new HashMap<>();

    public void createProduct(){
        do {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            Product product = new Product(name, price, quantity);
            products.put(name, product);
            System.out.print("Do you want to add another product? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));
    }

    public void changePrice(){
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Product product = products.get(name);
        product.setPrice(price);
        products.put(name, product);
        System.out.println("Price changed!");
    }

    public void deleteProduct(){
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        products.remove(name);
        System.out.println("Product deleted!");
    }

    public void showProducts(){
        System.out.println("Products:");
        for (String key : products.keySet()) {
            Product product = products.get(key);
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Total: " + product.getTotal());
            System.out.println();
        }
    }
}
