package com.guide08.exercise.exercise03.service;

import com.guide08.exercise.exercise03.entity.Operation;

public class OperationService {
    private Operation operation = new Operation();

    public Operation createOperation(int num1, int num2) {
        operation.setNum1(num1);
        operation.setNum2(num2);
        return operation;
    }

    /**
     * sum two numbers
     * @param operation
     */
    public void sum(Operation operation){
        System.out.println(operation.getNum1() + operation.getNum2());
    }

    /**
     * subtract two numbers
     * @param operation
     */
    public void subtract(Operation operation){
        System.out.println(operation.getNum1() - operation.getNum2());
    }
    /**
     * if something is CERO the result is CERO and inform the user the error
     */
    public void multiply(Operation operation) {
        if (operation.getNum1() == 0 || operation.getNum2() == 0) {
            System.out.println("Error: CERO");
        } else {
            System.out.println(operation.getNum1() * operation.getNum2());
        }
    }

    /**
     * if divisor is CERO the result is CERO and inform the user the error
     */
    public void divide(Operation operation) {
        if (operation.getNum2() == 0) {
            System.out.println("Error: CERO");
        } else {
            System.out.println(operation.getNum1() / operation.getNum2());
        }
    }
}