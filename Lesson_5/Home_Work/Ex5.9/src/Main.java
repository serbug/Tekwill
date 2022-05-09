import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise 5.9 The length of the sequence
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        
       /** Condition: For its input, the program gets a sequence of non-negative integers; each integer is
        written in a separate line. The sequence ends with an integer 0; when the program reads
        0, it should end its work and output the length of the sequence (not counting the final 0).
        Don’t read numbers following the number 0.
        */

        Scanner sc = new Scanner(System.in);

        int number=1;
        int i=0;

        while (number!=0){

            i++;
            System.out.print("\n Insert a number: ");
            number = sc.nextInt();

        }

        System.out.println("\n\t\t The length of the sequence is "+(i-1));
    }
}