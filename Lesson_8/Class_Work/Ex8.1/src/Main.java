import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fudamentals
 * Exercises Ex8.1 Sum of numbers in the
 *
 * @Author Sergiu
 */
public class Main {

    /* Condition: Implement a method sumInRange for calculating the sum of numbers in the range
       from (inclusive), to (exclusive).
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Insert a first number: ");
        int from = sc.nextInt();
        System.out.print("\n Insert a second number: ");
        int to = sc.nextInt();

        sumInRange(from, to);
    }

    public static void sumInRange(int from, int to) {

        int sum = 0;
        for (int i = from; i < to; i++) {

            sum += i;
        }

        System.out.println("\n\t\t Sum: " + sum);
    }
}