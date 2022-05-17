import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex7.5 Number of occurrences
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {
	/* Condition: Write a program that finds the frequency of occurrences of a substring in a given
       string. Substrings cannot overlap: for example, the string ababa contains only one
       substring aba.
       Input data format: The first input line contains a string, the second one contains a
       substring.
     */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n String: ");
        String str = sc.nextLine();
        System.out.print("\n Substring: ");
        String subs = sc.nextLine();

        int count = 0;
        String[] s = str.split(" ", 5);

        for (String temp : s) {
            //System.out.print(temp);
            if (temp.contains(subs)) {
                count++;
            }
        }
        System.out.println("\n\t\t\t Count: " + count);
    }
}
