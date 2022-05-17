import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex7.3 Comparing strings ignoring whitespaces
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {
        
	/* Condition: Write a program that reads two lines and compares them without whitespaces. The
       program should prints true if both lines are equal, otherwise – false.
     */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Line 1: ");
        String line1 = sc.nextLine();
        System.out.print("\n Line 2: ");
        String line2 = sc.nextLine();

        System.out.println("\n\t\t\t" + String.valueOf(line1.replace(" ", "").equals(line2.replace(" ", ""))).toUpperCase());
    }
}
