package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.4 Harry Potter
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/* Condition: Residents of the country of Malevia often experiment with the plan of their rooms.
        Rooms can be triangular, rectangular, and round. Write a program that calculates the
        floorage of the rooms.
           Input data format: The type of the room shape and the relevant parameters.
           Output data format: The area of the resulting room.
           Note that the value of 3.14 is used instead of the number π in Malevia.
      */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert the shape of the rooms: ");
            String shape = sc.next().toUpperCase(); // Converted input string to UpperCase

            double a, b, c, r, floorage = 0;

            switch (shape) {
                case "TRIANGLE" -> {
                    System.out.println("\n Insert a number for variable A:");
                    a = sc.nextDouble();
                    System.out.println("\n Insert a number for variable B:");
                    b = sc.nextDouble();
                    System.out.println("\n Insert a number for variable C:");
                    c = sc.nextDouble();

                    double heron = (a + b + c) / 2; //Heron's Formula

                    floorage = Math.sqrt(heron * (heron - a) * (heron - b) * (heron - c)); //Area of triangle using heron's formula

                }
                case "RECTANGLE" -> {
                    System.out.println("\n Insert a number for variable A:");
                    a = sc.nextDouble();
                    System.out.println("\n Insert a number for variable B:");
                    b = sc.nextDouble();

                    floorage = a * b; //Araa of a Rectangle Formula
                }
                case "CIRCLE" -> {
                    System.out.println("\n Insert the radius of the circle:");
                    r = sc.nextDouble();

                    floorage = 3.14 * Math.pow(r, 2);  //Area of Circle Formula

                }
                default -> System.out.println("Invalid input!!!");
            }
            System.out.println("\n The floorage of the " + shape + " rooms is \033[0;4m" + floorage + "\033[0m.");

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }

}
