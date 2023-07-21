package com.guide08.exercise.exercise02;

import com.guide08.exercise.exercise02.Entity.Circumference;
import com.guide08.exercise.exercise02.Service.CircumferenceService;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 * tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
 * e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 */
public class Main {
    public static void main(String[] args) {
        CircumferenceService cs = new CircumferenceService();
        Circumference c1 = cs.createCircumference(5);
        Circumference c2 = cs.createCircumference(10);
        Circumference c3 = cs.createCircumference(15);

        System.out.println("Area of c1: " + cs.calculateArea(c1));
        System.out.println("Perimeter of c1: " + cs.calculatePerimeter(c1));

        System.out.println("Area of c2: " + cs.calculateArea(c2));
        System.out.println("Perimeter of c2: " + cs.calculatePerimeter(c2));

        System.out.println("Area of c3: " + cs.calculateArea(c3));
        System.out.println("Perimeter of c3: " + cs.calculatePerimeter(c3));
    }
}
