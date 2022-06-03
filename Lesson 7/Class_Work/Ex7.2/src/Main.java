import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fudamentals
 * Exercises Ex7.2 Extracting a substring
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /* Condition: Write a program that reads a string and two integer numbers. These two numbers are representing
        *  a range that includes them both. Print the substring enclosed in this range.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a string: ");
        String str = sc.nextLine();
        System.out.print("\n Start : ");
        int start=sc.nextInt();
        System.out.print("\n End: ");
        int end=sc.nextInt();

        System.out.println("\n\t\t\t"+str.substring(start,end+1));

    }
}