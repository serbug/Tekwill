import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.3 Sum array elements greater than a value
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /* Condition: Write a program that reads an array of ints and an integer number n. The program
             must sum all the array elements greater than n.
             Input data format:
                  The first line contains the size of an array.
                  The second line contains elements of the array separated by spaces.
                  The third line contains the number n.
              Output data format: Only a single number represents the sum.
         */
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("\nInsert the array size: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("\nInsert a number: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("\nInsert a number: ");
        int n = sc.nextInt();

        for (int el : array) {
            if (el > n)
                sum += el;
        }
        System.out.println("\n Sum of elements is " + sum);
    }
}