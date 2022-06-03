package com.serbug;

import java.io.IOException;
import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.1 Healthy sleep
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) throws IOException {
	/*Condition: Ann learned that oversleeping is as bad for your health as not getting enough sleep.
      She decided to follow recommendations and keep track of how many hours she spends
      sleeping. You are given three numbers: A, B and H. According to recommendations, one
      should sleep at least A hours per day, but no more than B hours. H is how many hours
      Ann sleeps.
      Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B
      hours, print "Excess". If her sleep fits the recommendations, print "Normal".
     */

        Scanner sc = new Scanner(System.in);


        String option = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {

            System.out.println("\n Insert first number: ");

            //minimum sleep time
            int A = sc.nextInt();

            System.out.println("\n Insert second number: ");

            //maximum sleep time
            int B = sc.nextInt();

            System.out.println("\n Insert third number: ");
            
            //sleep time Ann
            int H = sc.nextInt();

            if (H < A) {
                System.out.println("\n\t\t\t Deficiency");
            } else if (H <= B) {
                System.out.println("\n\t\t\t Normal");
            } else {
                System.out.println("\n\t\t\t Excess");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }

    }

}
