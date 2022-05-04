package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.6 Difference between two doubles
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/* Condition: Write a program that reads two double values and prints the difference between the
        second and the first one.
     */
        Scanner sc = new Scanner(System.in);

        System.out.println("\n First number: ");
        double a = sc.nextDouble();
        System.out.println("\n Second number: ");
        double b = sc.nextDouble();

        System.out.println("\n\t\t* The difference between the second and the first one is \033[0;4m" + (b - a));

    }
}
