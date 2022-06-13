/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.8 Triangle
   # Author: Sergiu
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Condition: Given three natural numbers A,B,C. Determine if a triangle with these sides can exist.
         * If the triangle exists, output the YES string, and Otherwise, output NO.
         * A triangle is valid if the sum of its two sides is greater than the third site. If three sides are A,B and C, then three conditions should be met.
         *       1. A + B > C
         *       2. A + C > B
         *       3. B + C > A
         * */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {
            System.out.println("\n Insert the first side: ");
            int first = sc.nextInt();
            System.out.println("\n Insert the second side: ");
            int second = sc.nextInt();
            System.out.println("\n Insert the third side: ");
            int third = sc.nextInt();

            if (first + second > third && first + third > second && second + third > first) {
                System.out.println("\n\t\t\tYES");
            } else {
                System.out.println("\n\t\t\tNO");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}