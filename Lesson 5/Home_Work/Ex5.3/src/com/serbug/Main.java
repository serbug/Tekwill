package com.serbug;

import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.3 Chocolate
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {
	/*Condition: Imagine a chocolate bar. Remember how it is usually split into smaller bits by a
      special grid? Now think of chocolate as an N x M rectangle divided into little segments:
      N segments in length and M in width. Find out whether it is possible to break off exactly
      K segments from the chocolate with a single straight line: vertical or horizontal.
          Each segment is 1x1.
          Input data format
          The program gets an input of three integers: N, M, K.
          Output data format
          The program must output one of the two words: YES or NO.
      If you're having trouble understanding the task, try drawing it on a piece of paper.
     */
        Scanner sc = new Scanner(System.in);

        String option = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {

            System.out.println("\nInsert the length: ");
            int n = sc.nextInt();
            System.out.println("\nInsert the width: ");
            int m = sc.nextInt();
            System.out.println("\nInsert a number for K: ");
            int k = sc.nextInt();

            int segment = n * m;

            if ((k % n == 0 || k % m == 0) && k <= segment) {
                System.out.println("\n\t\t\t YES");
            } else {
                System.out.println("\n\t\t\t NO");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}
