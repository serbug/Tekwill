import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex9.4
 *
 * @Author Sergiu
 */

/*Condition: The class Arrays includes a lot of useful methods for processing arrays. One of
them is the binarySearch method. It allows you to quickly find the index of an element
in the given ordered array. You just need to pass the given parameters in the same order
to this method.
In the main class get an array of 10 integers with a Scanner and one more integer to
find the position of. Use binarySearch method to find its position in the array. Don’t
use imports in this exercise.
*/
public class Main {
    public static void main(String[] args) {
        Arrays arr = new Arrays();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input numbers in the array: ");

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("\n Input a number: ");
        int n = sc.nextInt();
        
        //Binary Search method
        arr.binarySearch(array, n);

    }
}