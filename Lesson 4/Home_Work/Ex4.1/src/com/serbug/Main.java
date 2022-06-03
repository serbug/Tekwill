package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 4.1 Reading integer numbers
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Write a program that reads four integer numbers from one line and prints them each
      in a new line. In the input line numbers are separated by one or more spaces.
     */
        Scanner sc = new Scanner(System.in);

        System.out.println("\n* Insert four integer in on line separated by one or more spaces: ");
        String s = sc.nextLine();

        System.out.println(String.valueOf("\n" + s.replaceAll("\\s+", "\n")));

    }
}