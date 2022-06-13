import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /** Condition: Given integer N. Print all the squares of natural numbers, not exceeding N, in
         ascending order.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Insert a number: ");
        int n = sc.nextInt();

        System.out.print("\n All the squares of "+n+": ");
        for (int i = 1; i * i < n; i++) {

            System.out.print(i * i+" ");
        }
    }
}