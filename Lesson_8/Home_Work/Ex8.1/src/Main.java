import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex8.1 Integer part of a number
 *
 * @Author Sergiu
 */
public class Main {

    /* Condition: Given the method named extractInt that takes a double value and returns an
       integer value. Write a body of the method. It should return only the integer part of the
       given value.*/
    public static int extractInt(double d) {
        return (int) d;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}