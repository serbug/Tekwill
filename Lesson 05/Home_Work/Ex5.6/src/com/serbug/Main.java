package com.serbug;

import java.util.Scanner;

/**
    Tekwill Academy
    Java Fundamentals
    Exercise 5.6 Direction
    @Author Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/** Condition: Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 –
     right, 0 – do not move) and outputs the text «move up» (or «move down», or «move left»,
     or «move right», or «do not move» depending on the entered number). If it is a number
     that does not belong to any of the listed directions, the program should output: «error!»
     */

        Scanner sc = new Scanner(System.in);
        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert the number of direction: ");
            int number=sc.nextInt();

            switch (number){
                case 1 -> System.out.println("\n\t\t\tMOVE UP");
                case 2 -> System.out.println("\n\t\t\tMOVE DOWN");
                case 3 -> System.out.println("\n\t\t\tMOVE LEFT");
                case 4 -> System.out.println("\n\t\t\tMOVE RIGHT");
                case 0 -> System.out.println("\n\t\t\tDO NOT MOVE");
                default -> System.out.println("\n\t\t\t<<error!>>");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }

    }
}
