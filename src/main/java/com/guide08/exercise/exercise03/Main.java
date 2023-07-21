package com.guide08.exercise.exercise03;

import com.guide08.exercise.exercise03.entity.Operation;
import com.guide08.exercise.exercise03.service.OperationService;

/**
 * Crear una clase llamada Operación que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor con todos los atributos pasados por parámetro.
 * b) Metodo constructor sin los atributos pasados por parámetro.
 * c) Métodos get y set.
 * d) Método para crearOperación(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 * f) Método restar(): calcular la resta de los números y devolver el resultado al main
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
 * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
 * Si no, se hace la multiplicación y se devuelve el resultado al main
 * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
 * una división por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class Main {
    public static void main(String[] args) {
        Operation o1 = new Operation(1, 2);
        Operation o2 = new Operation(3, 4);
        Operation o3 = new Operation(5, 0);
        OperationService os = new OperationService();

        os.sum(o1);
        os.sum(o2);
        os.sum(o3);

        os.subtract(o1);
        os.subtract(o2);
        os.subtract(o3);

        os.multiply(o1);
        os.multiply(o2);
        os.multiply(o3);

        os.divide(o1);
        os.divide(o2);
        os.divide(o3);
    }
}
