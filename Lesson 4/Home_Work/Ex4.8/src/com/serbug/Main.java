package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.8 Check the given numbers are different
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Write a program that reads three numbers and checks that they all are different, i.e.
      not equal to one another. The output should be true or false.
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert first number: ");
        int a = sc.nextInt();
        System.out.println("\n Insert second number: ");
        int b = sc.nextInt();
        System.out.println("\n Insert third number: ");
        int c = sc.nextInt();

        System.out.println("\n\t\t\t" + String.valueOf(a == b && b == c).toUpperCase());

    }
}
