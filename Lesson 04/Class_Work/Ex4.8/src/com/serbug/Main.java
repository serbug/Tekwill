package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.8 Find X
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program that reads three double values a,b,c, and then solving the simple equation:
         * a*x+b=c. The program should output the value of x. It's guaranteed, a is not 0.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a double number for variable A: ");
        double a = sc.nextDouble();
        System.out.println("Insert a double number for variable B: ");
        double b = sc.nextDouble();
        System.out.println("Insert a double number for variable C: ");
        double c = sc.nextDouble();
        double x = (c - b) / a;
        if (a != 0) {
            System.out.println("\n* Value of x is \033[0;4m" + x);
        } else {
            System.out.println("\n* Error: a=0, please insert a number != 0 ");
        }
    }
}
