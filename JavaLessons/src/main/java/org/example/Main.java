package org.example;

public class Main {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(6,5));
        System.out.println(calculator.minus(6,5));
        System.out.println(calculator.multiply(6,5));
        System.out.println(calculator.divide(6,0));
    }

}