package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.3 Shape 
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
       
    /* Condition: Write a program, which reads the number of the shape (1 - square, 2 - circle, 3 - triangle, 4 - rhombus) 
        and prints the text "You have chosen a square" (or circle, or triangle, or rhombus, depending on the number).
        
        If it is a number that doesn't correspond to any of the listed shapes, the program should output: "There is no such shape!".
        
    */

        Scanner sc = new Scanner(System.in);

        String option = "Y";// variable for while loop

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {

            System.out.println("\n Insert the number of the shape: ");
            int number = sc.nextInt();

            String text = "\n You have chosen a ";

            switch (number) {
                case 1 -> System.out.println(text + "square!".toUpperCase());
                case 2 -> System.out.println(text + "circle!".toUpperCase());
                case 3 -> System.out.println(text + "triangle!".toUpperCase());
                case 4 -> System.out.println(text + "rhombus!".toUpperCase());
                default -> System.out.println("There is no such shape!");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase
        }


    }
}
