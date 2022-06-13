import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex9.2 Getting input
 *
 * @Author Sergiu
 */

/*Condition: Use method nextLine from Scanner class to read the whole line of input. The trick is
 *  to use the Scanner class without the import statement.
 *
 *  So you need to have a method getString() that return a String, inside that method add the logic.
 * */
public class Main {
    public static void main(String[] args) {
        String str = getString();
        System.out.println(str);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}