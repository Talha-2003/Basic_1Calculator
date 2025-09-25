package com;

import java.util.Scanner;

class SimpleCalculator {
    private double a;
    private double b;

    //Constructor that takes input
    public SimpleCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.a = sc.nextDouble();
        System.out.println("Enter second number: ");
        this.b = sc.nextDouble();

    }

    //param constructor
    public SimpleCalculator(double a, double b) {
        this.a=a;
        this.b=b;
    }

    //Basic operations - no exception handling yet



    double add( ) {
        return  this.a + this.b;
    }

    double subtract() {
        return this.a - this.b;
    }

    double multiply() {
        return this.a * this.b;
    }

    double divide() {
        return a / b;
    }
}

class LearningCalculator{
    static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

      //  Step1: Ask how to enter no
        System.out.println("Do you want to enter number manually? (yes/no): ");
        String choice = sc.next();

        SimpleCalculator calc;
        if ((choice.equalsIgnoreCase("yes")) || (choice.startsWith("y")))
        { calc = new SimpleCalculator(); }
        else {
            calc = new SimpleCalculator(23, 32);
        }



        System.out.println("Enter operation (+, -, *, /): ");
        String op = sc.next();
        switch (op) {
            case "+":
                System.out.println("Result: " + calc.add());
                break;
            case"-":
                System.out.println("Result: " + calc.subtract());
                break;
            case"*":
                System.out.println("Result: " + calc.multiply());
                break;
            case"/":
                System.out.println("Result: " + calc.divide());
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}