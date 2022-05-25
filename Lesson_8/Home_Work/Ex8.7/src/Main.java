import java.util.Arrays;
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

        int temp;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                temp=numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}