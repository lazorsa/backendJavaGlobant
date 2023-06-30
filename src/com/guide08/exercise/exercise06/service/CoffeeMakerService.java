package com.guide08.exercise.exercise06.service;

import com.guide08.exercise.exercise06.entity.CoffeeMaker;

public class CoffeeMakerService {
    CoffeeMaker coffeeMaker=new CoffeeMaker();

    public CoffeeMakerService() {
    }

    /**
     * Create coffee marker with max capacity and current capacity
     */
    public CoffeeMaker createCoffeeMarker(int maxCapacity, int currentCapacity) {
        coffeeMaker.setMaxCapacity(maxCapacity);
        coffeeMaker.setCurrentCapacity(currentCapacity);
        return coffeeMaker;
    }

    /**
     * Fill coffee maker with max capacity
     */
    public void fillCoffeeMaker() {
        coffeeMaker.setCurrentCapacity(coffeeMaker.getMaxCapacity());
    }

    /**
     * Serve cup with coffee and show current capacity to cup
     */
    public void serveCoffee(int cupCapacity) {
        if (coffeeMaker.getCurrentCapacity() < cupCapacity) {
            System.out.println("You haven't enough coffee in your cup.");
            System.out.println("You have " + coffeeMaker.getCurrentCapacity() + " coffee in your cup.");
            emptyCoffeeMaker();
        } else {
            System.out.println("You have your cup full of coffee.");
            coffeeMaker.setCurrentCapacity(coffeeMaker.getCurrentCapacity() - cupCapacity);
        }
    }

    /**
     * Empty coffee maker
     */
    public void emptyCoffeeMaker() {
        coffeeMaker.setCurrentCapacity(0);
    }

    /**
     * Add coffee to coffee maker
     */
    public void addCoffee(int coffee) {
        if (coffeeMaker.getCurrentCapacity() + coffee > coffeeMaker.getMaxCapacity()) {
            System.out.println("Coffee maker is full.");
            coffeeMaker.setMaxCapacity(coffeeMaker.getMaxCapacity());
        } else {
            coffeeMaker.setCurrentCapacity(coffeeMaker.getCurrentCapacity() + coffee);
        }
    }
}
