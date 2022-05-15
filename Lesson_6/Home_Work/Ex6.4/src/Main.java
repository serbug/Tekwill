import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.4 The longest ascending sequence
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /* Condition: Write a program that reads an array of ints and outputs the length of the longest
           sequence in strictly ascending order. Elements of the sequence must go one after
           another. A single number is assumed to be an ordered sequence with the length = 1.
             Input data format:
             The first line contains the size of an array.
             The second line contains elements of the array separated by spaces.
         */
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("\nInsert the array size: ");

        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("\nInsert a number: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int x = 0;
        for (int el : array) {

            if (el > x){
                x=el;
                count++;
            }

        }
        System.out.println("\n The length of the longest sequence " +
                "in ascending order is: "+count);
    }
}