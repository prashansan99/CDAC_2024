package com.cdac.beans;

public class TestBean {
    private double number1;
    private double number2;
    private String operation;

    // Getters and Setters
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    // Business logic to perform the operation
    public double getResult() {
        switch (operation) {
            case "add":
                return number1 + number2;
            case "subtract":
                return number1 - number2;
            case "multiply":
                return number1 * number2;
            case "divide":
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operation specified.");
        }
    }
}

