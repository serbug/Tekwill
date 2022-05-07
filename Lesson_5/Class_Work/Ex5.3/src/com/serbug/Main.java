package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.3 The sum of integers from a to b
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Print the sum of all integers from a to b including both. Integer a is always lower the b(a<b). */

        Scanner sc = new Scanner(System.in);

        System.out.println("\n Insert a number for variable A:");
        int a = sc.nextInt();
        System.out.println("\n Insert a number for variable B:");
        int b= sc.nextInt();

        int sum=0; //sum of all integers

        int i=a;
        while (i<=b){
            sum+=i;
            i++; //increment
        }

        System.out.println("\n The sum of all integers from "+a+ " to "+b+" is \033[0;4m"+sum+"\033[0m.");

    }
}
