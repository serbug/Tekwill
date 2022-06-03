import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex8.3 Calculating factorials
 *
 * @Author Sergiu
 */
public class Main {
    /* Condition: Write a method that calculates the factorial of a given number. The factorial of n is
              calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is
              equal to 1.*/
    public static long factorial(long n) {

        int fact = 1;
        for (int i = fact; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}