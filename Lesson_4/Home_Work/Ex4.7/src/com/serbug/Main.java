package com.serbug;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.7 Check the value
   # Author: Sergiu
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Condition: Write a program that reads an integer value and checks if it is less than 10 and
      greater than 0. Your program should print a boolean value (true or false).
     */
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Insert a number: ");
        int n = sc.nextInt();
        boolean check = false;

        if (n > 0 && n < 10) {
            System.out.println("\n\t\t\t" + String.valueOf(check = true).toUpperCase());
        }else{
            System.out.println("\n\t\t\t" + String.valueOf(check).toUpperCase());
        }

    }
}
