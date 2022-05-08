import java.util.Scanner;
/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.11 Numbers divisible by six
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {
        /*Condition: Given the sequence of natural numbers. Find the sum of numbers divisible by 6. The input is the
         * number of elements in the sequence, and then elements themselves. In this sequence, there is
         * always a number divisible by 6. Note: best to use a for loop.
         * */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert the number of elements: ");
            int num_of_elements = sc.nextInt();
            int sum = 0;

            for (int i = 0; i < num_of_elements; i++) {

                System.out.print("\n Insert a number: ");
                int n = sc.nextInt();

                if (n % 6 == 0) {
                    sum += n;
                }
            }

            System.out.println("\n The sum o numbers divisible by 6 is " + sum);

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}