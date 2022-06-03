package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.9 Exactly one parameter is positive
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
       /*Condition: Write a program that reads three integer numbers and prints true if exactly one
         number is positive (i.e. > 0). Otherwise, it should print false.
       */

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert first number: ");
        int first = sc.nextInt();
        System.out.println("\n Insert second number: ");
        int second = sc.nextInt();
        System.out.println("\n Insert third number: ");
        int third = sc.nextInt();

        System.out.println("\n\t\t\t" + String.valueOf(first < 0 || second < 0 || third < 0).toUpperCase());

    }
}
