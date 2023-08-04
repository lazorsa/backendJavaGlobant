package com.guide10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getTotal() {
        return String.format("%.2f", price * quantity);
    }
}
