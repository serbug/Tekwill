package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.6 Squirrels and nuts
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/* Condition: N squirrels found K nuts and decided to divide them equally.
	* Find how many nuts will be left after of the squirrels takes the equal
	* amount of nuts.
	*
	* There are two positive integers N and K, each of them is not greater than 10000.
	*/
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Insert number of squirrels: ");
        int N=sc.nextInt();
        System.out.println("\n Insert number of nuts: ");
        int K=sc.nextInt();

        System.out.println("\n Peanuts left is \033[0;4m"+(K % N)+"\033[0m !"); // \033[0;4m - string underline
    }
}
