import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex8.7 Sorting numbers
 *
 * @Author Sergiu
 */

public class Main {

    /* Condition: Implement a method for sorting a given array of integers in the ascending order. You
                 can use any algorithm for sorting it.*/
    public static void sort(int[] numbers) {

       Arrays.sort(numbers);

    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        System.out.println(Arrays.toString(values));
        int[] numbers = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        //System.out.println(numbers);
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}