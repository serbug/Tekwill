/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.7 Leap year
   # Author: Sergiu
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Condition: Find whether the given year is a leap year.
         * JUst a reminder: leap years are those years in which the year's number is either divisible by 4,
         * but not divisible by 100, or divisible by 400.
         * Output "Leap" if the given year is a leap year, and "Regular" otherwise.
         * */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        int year;

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert the year: ");

            year = sc.nextInt();

            if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
                System.out.println("\n\t\t\t Leap!");
            } else {
                System.out.println("\n\t\t\t Regular!");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}