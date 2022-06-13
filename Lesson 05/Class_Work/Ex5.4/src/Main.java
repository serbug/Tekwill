import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.4 The sum of integers from a to b
   # Author: Sergiu
*/
public class Main {

    public static void main(String[] args) {

        /*Condition: Print the sum of all integers from a to b including both. Integer a is always lower the b(a<b). */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert a number for variable A:");
            int a = sc.nextInt();
            System.out.println("\n Insert a number for variable B:");
            int b = sc.nextInt();

            int sum = 0; //sum of all integers

//            //Solution 1 with while loop
//            int i = a;
//
//            while (i <= b) {
//                sum += i;
//                i++; //increment
//            }

            //Solution 2 with for
            for (int j = a; j <= b; j++) {
                sum+=j;
            }

            System.out.println("\n The sum of all integers from " + a + " to " + b + " is \033[0;4m" + sum + "\033[0m.");

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}