import java.util.Arrays;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex6.1 Initializing an array of longs
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /* Condition: Create an array og long named longNumbers with three elements 100000000001,100000000002,100000000003. Then output the array.
        * Use the provided code template.
        * */

        long[] longNumbers= new long[]{10000000001L,100000000002L,100000000003L};
        System.out.println(Arrays.toString(longNumbers));
    }
}