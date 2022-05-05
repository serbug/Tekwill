package com.serbug;

import java.util.Scanner;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.2 The army of units
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: In a computer game, each gamer has an army of units. Write a program that will
      classify the army corresponding to the following rules:
      less than 1: no army
      from 1 to 19: pack
      from 20 to 249: throng
      from 250 to 999: zounds
      1000 and more: legion
      The program should read the number of units and output the corresponding category.
     */

        Scanner sc = new Scanner(System.in);

        String option = "Y"; // variable for while loop
        String text = null;  // variable for output corresponding category

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {

            System.out.println("\n Insert the number of units: ");
            int number = sc.nextInt();

            if (number < 1) {

                text = "\n\t\t\t no army";
                System.out.println(text.toUpperCase());

            } else if (number <= 19) {

                text = "\n\t\t\t pack";
                System.out.println(text.toUpperCase());

            } else if (number <= 249) {

                text = "\n\t\t\t throng";
                System.out.println(text.toUpperCase());

            } else if (number <= 999) {

                text = "\n\t\t\t zounds";
                System.out.println(text.toUpperCase());

            } else {

                text = "\n\t\t\t legion";
                System.out.println(text.toUpperCase());
            }


            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }


    }
}
