package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.2
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Write a program that reads an integer value n from the standard
	* input and outputs the result of the following arithmetic expression:
	* ((n+1)*n+2)*n+3
	*/
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Insert a number: ");
        int n =sc.nextInt();
        n=((n+1)*n+2)*n+3;
        System.out.println("\n The result of ((n+1)*n+2)*n+3 = "+n);
    }
}
