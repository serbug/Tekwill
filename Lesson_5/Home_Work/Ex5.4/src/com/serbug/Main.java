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

	/*Condition: Harry Potter needs help identifying what each house means.
       Read a string representing a house and output the following:
         ● if it is "gryffindor", output "bravery";
         ● if it is "hufflepuff", output "loyalty";
         ● if it is "slytherin", output "cunning";
         ● if it is "ravenclaw", output "intellect";
         ● otherwise, output "not a valid house".
     */

        Scanner sc = new Scanner(System.in);

        String option;
        String text; // message output
        String var ="Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.flush();
            System.out.println("\n Insert a string: ");
            option = sc.next(); // User input

            switch (option) {
                case "gryffindor" -> {
                    text = "\n\t\t\tbravery";
                    System.out.println(text.toUpperCase());
                }
                case "hufflepuff" -> {
                    text = "\n\t\t\tloyalty";
                    System.out.println(text.toUpperCase());
                }
                case "slytherin" -> {
                    text = "\n\t\t\tcunning";
                    System.out.println(text.toUpperCase());
                }
                case "\n\t\t\travenclaw" -> {
                    text = "intellect";
                    System.out.println(text.toUpperCase());
                }
                default -> {
                    text = "\n\t\t\tnot a valid house";
                    System.out.println(text.toUpperCase());
                }

            }
            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}
