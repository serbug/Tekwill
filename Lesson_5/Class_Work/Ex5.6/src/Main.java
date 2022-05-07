import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.6 The integer barrier
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {

        /*Condition: Write a program that reads a sequence of integer numbers in a loop and adds up all numbers.
         * If a new number is equal to 0, the program must stop the loop and output the accumulated
         * sum. When the sum is equal or execeeded 1000 (the barrier), the program should also stop
         * and output the value equal to sum - 1000.
         * */

        Scanner sc = new Scanner(System.in);

        int sum = 0, number = 1;
        String option = "Y"; // variable for repeate exercises first while loop

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {

            System.out.println("\nInsert a sequence of integer numbers: ");
            while (number != 0) {

                number = sc.nextInt();
                sum += number;
                
                if (sum >= 1000) {
                    sum %= 1000;
                    break;
                }
            }
            System.out.printf("\n\t\t\t Sum - " + sum);

            //Simple validation for user input if what repeat exercises
            System.out.println("\n\n\t\t Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}