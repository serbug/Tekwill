package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.4
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program that reads the number a,b,c and checks if any
         * pair of them sums to 20. The program must output true or false.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert a number for a = ");
        int a = sc.nextInt();
        System.out.println("\n Insert a number for b = ");
        int b = sc.nextInt();
        System.out.println("\n Insert a number for c = ");
        int c = sc.nextInt();

        boolean check = a + b == 20 || b + c == 20 || a + c == 20;
        String checkUpperCase = String.valueOf(check); //valueOf() method converts different types of values into string
        System.out.println("\n\t\t\t The result: " + checkUpperCase.toUpperCase()); //toUpperCase() method convert a string to uppercase
    }
}
