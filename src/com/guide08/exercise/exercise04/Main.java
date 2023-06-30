package com.guide08.exercise.exercise04;

import com.guide08.exercise.exercise04.entity.Rectangle;
import com.guide08.exercise.exercise04.service.RectangleService;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 * calcular la superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
 * setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Main {

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        RectangleService rectangleService=new RectangleService();

        rectangle.setHeight(5);
        rectangle.setWidth(10);

        System.out.println("Area: "+rectangleService.getArea(rectangle));
        System.out.println("Perimeter: "+rectangleService.getPerimeter(rectangle));
        rectangleService.drawRectangle(rectangle);

    }
}
