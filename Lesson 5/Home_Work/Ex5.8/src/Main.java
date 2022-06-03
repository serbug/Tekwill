import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise 5.8 The product of numbers from a to b
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        
        /** Condition: Write a program that prints the product of all integer numbers from a to b (a < b).
         Include a and exclude b from the product. If you input 1 and 3 it should calculate 1 *
         2 * 3.
         */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.print("\n Insert the first number: ");
            int a = sc.nextInt();
            System.out.print("\n Insert the second number: ");
            int b = sc.nextInt();
            long product = 1;

            for (int i = a; i < b; i++) {

                product *= i;
            }

            System.out.println("\n The product of all integer numbers from " + a + " to "
                    + b + " is \033[0;4m" + product + "\033[0m !");

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }

    }
}