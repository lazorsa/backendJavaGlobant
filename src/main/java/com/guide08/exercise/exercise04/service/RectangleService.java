package com.guide08.exercise.exercise04.service;

import com.guide08.exercise.exercise04.entity.Rectangle;

public class RectangleService {
    Rectangle rectangle=new Rectangle();

    /**
     * Area to object rectangle
     */
    public double getArea(Rectangle rectangle){
        return rectangle.getWidth()*rectangle.getHeight();
    }

    /**
     * Perimeter to object rectangle
     */
    public double getPerimeter(Rectangle rectangle) {
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    /**
     * Draw rectangle
     */
    public void drawRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangle.getHeight(); i++) {
            for (int j = 0; j < rectangle.getWidth(); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
