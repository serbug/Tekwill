import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex14.3 String reverser
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput a string: ");
        String line = sc.nextLine();

        StringReverser stringReverser = new StringReverser() {
            String rev = "";

            @Override
            public String reverse(String str) {
                char ch[] = line.toCharArray();
                for (int i = ch.length - 1; i >= 0; i--) {
                    rev += ch[i];
                }

                return rev;
            }
        };
        System.out.print("\nReverse string: "+stringReverser.reverse(line));
    }
}