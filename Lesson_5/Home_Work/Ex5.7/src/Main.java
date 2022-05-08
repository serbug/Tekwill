import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise 5.7 Fizz Buzz
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {

        /** Condition: Write a program that takes the input of two integers: the beginning and the end of
         the interval (both numbers belong to the interval).
         The program should output the numbers from this interval, but if the number is
         divisible by 3, you should output Fizz instead of it; if the number is divisible by 5, output
         Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
         Output each number or the word on a separate line.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Insert the start number: ");
        int start = sc.nextInt();
        System.out.print("\n Insert the end number: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}