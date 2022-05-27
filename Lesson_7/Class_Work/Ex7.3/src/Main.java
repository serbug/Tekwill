import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fudamentals
 * Exercises Ex7.3 The longest word
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {

        /* Condition: In the given string find the first longest word and output it.
        *   Input data: Given a string in a single line. Words in the string are separated by a single space.
        *   Output data: Output the longest word. If there are several such words, you should output the one,
        *    wich occurs earlier.
        * */

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] spl=str.split(" ");

        for (String el:spl) {
           int i= spl.length;
            if (el.length()>spl[i].length()) {
                str=el;
            }

        }
        System.out.println(str);

    }
}