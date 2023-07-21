package com.guide08.exercise.exercise02.Service;

import com.guide08.exercise.exercise02.Entity.Circumference;

public class CircumferenceService {
    private Circumference circumference = new Circumference();

    public Circumference createCircumference(double radius) {
        circumference.setRadius(radius);
        return circumference;
    }

    public double calculateArea(Circumference circumference) {
        return Math.PI * Math.pow(circumference.getRadius(), 2);
    }

    public double calculatePerimeter(Circumference circumference) {
        return 2 * Math.PI * circumference.getRadius();
    }

}
