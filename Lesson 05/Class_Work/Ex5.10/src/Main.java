import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.10 A simple calculator
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {
        /*Condition: Write a simple calculator that reads the three values from the line: the first number, the operation,
         * and the second number. THe program should apply the opration to the numbers entered ("first
         * number" "operation" "second number") and output the result to the screen. Note that the numbers are
         * long. The calculator should support:
         *      *  addition: "+"
         *      *  subtraction: "-"
         *      *  integer division: "/"
         *      *  multiplication: "*"
         * If a user performs division and the second number is 0, it is necessary to output the line "Division by
         * 0!". If the input operator is not one from the list, the program should output "Unknown operator".
         * NOte: it's recommended to use the switch statement in your solution.
         * */

        Scanner sc = new Scanner(System.in);

        String var = "Y"; // variable for while loop

        //Simple loop for repeat exercises.
        while (var.equals("Y")) {

            System.out.println("\n Insert the first number:");
            long first = sc.nextInt();

            System.out.println("\n Insert the operation:");
            String operation = sc.next();

            System.out.println("\n Insert the second number:");
            long second = sc.nextInt();

            String text = "\n\t\t" + first + " " + operation + " " + second + " = "; //Output text

            //Simple calculator
            switch (operation) {
                case "+", "addition" -> System.out.println(text + (first + second));
                case "-", "subtraction" -> System.out.println(text + (first - second));
                case "/", "division" -> {

                    if(second!=0){
                        System.out.println(text + (first / second));
                    }else{
                        System.out.println("\n\t\t Division by 0!");
                    }
                }
                case "*", "multiplication" -> System.out.println(text + (first * second));
                default -> System.out.println("\n Unknown operator! ");
            }

            //Simple validation for user input if what repeat exercises
            System.out.println("\n Do you want repeat ? Y / N ");
            var = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}