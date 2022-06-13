/**
 * Tekwill Academy
 * Java Fudamentals
 * Exercises Ex7.1 Comparing Strings
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {

        /* Condition: Create two strings, a and b, using the literal, and another two (c and d) using the keyword new.
         * Compare the strings a with b, a with c, and c with d using ++ and using equals method, and output the results.
         * */

        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = new String("Java");

        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(c == d);//false

        System.out.println(a.equals(b));//true
        System.out.println(a.equals(c));//true
        System.out.println(d.equals(d));//true
    }
}