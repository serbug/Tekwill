import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.5 The largest element of a sequence
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {

        /*Condition: Read a sequence of integer numbers ( which ends with the number 0). Find the largest element of the sequence.
         * The number 0 itself is not included in the sequence but serves only as a sign of the sequence's end.
         * */

        Scanner sc = new Scanner(System.in);

        String option = "Y"; // variable for repeate exercises first while loop

        //Simple loop for repeat exercises.
        while (option.equals("Y")) {


            int max = 0;
            int numbers = 1;

            System.out.println("\n Insert a sequence of integer numbers: ");

            //I used while loop for find the largest element of the sequence
            while (numbers != 0) {

                numbers = sc.nextInt();

                if (numbers > max) {

                    max = numbers;
                }

            }

            System.out.printf("\n The largest element of the sequence is \033[0;4m" + max + "\033[0m !");

            //Simple validation for user input if what repeat exercises
            System.out.println("\n\n\t\t Do you want repeat ? Y / N ");
            option = sc.next().toUpperCase(); // ALL input converted to UpperCase

        }
    }
}