import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * xercise Ex7.1 Replacing 'a' with 'b'
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {
	/* Condition: Write a program that reads a string and replaces all occurrences of the letter 'a'
       with the letter 'b'. The program should print out the resulting string.
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("\n String: ");
        String str = sc.nextLine();

        System.out.print("\n\tResult of string after letter replace: " + str.replace('a', 'b'));
    }
}
