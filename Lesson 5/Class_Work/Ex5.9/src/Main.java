import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.9 Symmetrical number
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {
        /*Condition: Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is
         * symmetric, output 1; otherwise output any other integer. The number may have less than four digits;
         * in this case you shoul assume that its decimal notation is complemented by insignificant zeros on the left.
         * */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {
            System.out.println("\n Insert a number: ");
            int number = sc.nextInt();
            int num_revers = 0;
            int i = number;

            //reverses the number
            while (i != 0) {

                int temp = i % 10;
                num_revers = num_revers * 10 + temp;
                i /= 10;
            }

            //Check if the number is symmetric
            if (number == num_revers) {
                System.out.println("\n Result is: " + 1);
            } else {
                System.out.println("\n Result is: " + 37);
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}