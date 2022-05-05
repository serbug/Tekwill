package com.serbug;

import java.util.Scanner;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.2 Number is positive with Ternary
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
        /*Condition: Write a program that reads an integer number and prints YES if it is positive.
          Otherwise, the program shoul print NO. Do not forget that zero is not a positive number.
          (use the ternary operator).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Insert a number: ");
        int n = sc.nextInt();

        System.out.println("\n\t\t\t" + (n > 0 ? "YES" : "NO"));// Ternary check
    }
}
