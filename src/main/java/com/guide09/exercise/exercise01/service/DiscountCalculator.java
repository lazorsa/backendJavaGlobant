package com.guide09.exercise.exercise01.service;

public class DiscountCalculator {
    /**
     * Discount 10%
     * @param price
     * @param quantity
     * @return
     */
    public double discount(double price, int quantity) {
        double total = price * quantity;
        if (total >= 1000) {
            return total * 0.9;
        } else {
            return total;
        }
    }

    /**
     * Max discount
     * @param price
     * @param quantity
     * @param discount
     */
    public double discount(double price, int quantity, double discount) {
        double total = price * quantity;
        if (total >= 1000) {
            return total * (1 - discount);
        } else {
            return total;
        }
    }

    /**
     * Without discount
     * @param price
     * @param quantity
     * @param discount
     * @param isDiscount
      */
    public double discount(double price, int quantity, double discount, boolean isDiscount) {
        double total = price * quantity;
        if (isDiscount) {
            return total * (1 - discount);
        } else {
            return total;
        }
    }

}
