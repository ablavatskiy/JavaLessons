package org.example;

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int divide(int x, int y) {
        if (y == 0) {
             throw new RuntimeException("You can't divide by zero");
        }
        return x / y;

    }
}
