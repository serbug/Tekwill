package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.9 Is between
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program that reads three integer numbers and prints true if the first number is between the second
         * and third one (inclusive). Otherwise, it must print false. The sorting order of two last arguments can be any. */

        Scanner sc = new Scanner(System.in);

        System.out.println(" Insert first number: ");
        int first = sc.nextInt();
        System.out.println(" Insert second number: ");
        int second = sc.nextInt();
        System.out.println(" Insert third number: ");
        int third = sc.nextInt();

        boolean check = (first >= second && first <= third) || (first <= second && first >= third);

        System.out.println("\n\t\t\t\033[0;4m" + String.valueOf(check).toUpperCase());
    }
}
