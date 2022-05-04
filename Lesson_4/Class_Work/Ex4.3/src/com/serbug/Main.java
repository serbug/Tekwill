package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.3
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program which reads a double value x and evaluates the result of
         * x^3+x^2+x+1
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert a number (type -> double ex. 22.5): ");
        double x = sc.nextDouble();
        x = Math.pow(x, 3) + Math.pow(x, 2) + x + 1; // or (x*x*x)+(x*x)+x+1
        System.out.println("\n\t\t The result of x^3+x^2+x+1 = " + x);
    }
}
