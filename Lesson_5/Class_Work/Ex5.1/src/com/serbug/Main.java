package com.serbug;

import java.util.Scanner;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.1 Check a number is positive
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {

        /*Condition: Write a program that reads an integer number and prints YES if it is positive.
          Otherwise, the program should print NO.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Insert a number: ");
        int n=sc.nextInt();

        if (n >= 0) {
            System.out.println("\n\t\t\t YES");
        }else{
            System.out.println("\n\t\t\t NO");
        }
    }
}
