import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex8.2 Vowel or not
 *
 * @Author Sergiu
 */
public class Main {

    /* Condition: Implement a method that checks whether a given English letter is a vowel or not.
                  The input may be in any case. Vowel: A, E, I, O, U.*/
    public static boolean isVowel(char ch) {
        char[] tmp = new char[]{'A','O','U','I','E'};
        for (char a:tmp) {
            if(String.valueOf(a).toLowerCase().equals(String.valueOf(ch).toLowerCase())){
                return true;
            }
        }
        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}