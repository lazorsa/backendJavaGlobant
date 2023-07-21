package com.guide08.exercise.exercise06.entity;

public class CoffeeMaker {
    private int maxCapacity;
    private int currentCapacity;

    public CoffeeMaker(){
    }

     /**
     * Built a coffee maker with max capacity and current capacity
     */
    public CoffeeMaker(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }
}
