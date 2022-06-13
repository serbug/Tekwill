import java.util.Scanner;

/**
   Tekwill Academy
   Java Fundamentals
   Exercise 5.13 Maximum element divisible by four
   @author Sergiu
*/
public class Main {
    public static void main(String[] args) {
        /** Condition: Given a sequence of natural numbers, not exceeding 30000. Find the maximum element
         divisible by 4. The program receives the number of elements in the sequence and then the elements
         themselves as input. In the sequence, there is always an element divisible by 4. The number of
         elements does not exceed 1000. The program should print a single number: the maximum element of
         the sequence divisible by 4.
         */
        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.print("\n Insert the number of elements: ");
            int num_of_elements = sc.nextInt();
            int max = 0;

            for (int i = 1; i <= num_of_elements; i++) {
                System.out.print(" Insert "+i+". number -> ");
                int number = sc.nextInt();

                if (number % 4 == 0 && number >= max) {
                    max = number;
                }

            }

            System.out.println("\n The maximum element divisible by 4 is " + max);

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}