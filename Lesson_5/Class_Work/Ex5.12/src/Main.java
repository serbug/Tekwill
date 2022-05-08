import java.util.Scanner;

/*
   # Tekwill Academy
   # Java Fundamentals
   # Exercise 5.12 The sum of elements
   # Author: Sergiu
*/
public class Main {
    public static void main(String[] args) {
        /*Condition: Find the sum of all elements of a sequence, ending with the number 0.
         * The number 0 itself is not included into the sequence and serves as a sign of cessation.
         * */

        Scanner sc = new Scanner(System.in);

        int n = 1, sum = 0;

        while (n != 0) {

            System.out.print("\n Insert a number: ");
            n = sc.nextInt();
            sum += n;
        }

        System.out.println("\n The sum of all elements is " + sum);
    }
}