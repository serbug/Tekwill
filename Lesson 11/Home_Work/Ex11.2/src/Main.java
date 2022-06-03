import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex11.2 Safe converting
 *
 * @Author Sergiu
 */

/*Condition: Implement a method for converting a Long value to int (primitive type) according to
the following rules:
   ● if the given value is null the method should return the default value for int's;
   ● if the given value is greater than Integer.MAX_VALUE the method should return
the max value for int's;
   ● if the given value is lesser than Integer.MIN_VALUE the method should return the
min value for int's;
   ● otherwise, the method should return the same value as the passed argument.*/

public class Main {
    public static int convert(Long val) {

        if (val == null) {
            return 0;
        } else if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return val.intValue();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();

        Long longVal = "null".equals(val) ? null : Long.parseLong(val);

        System.out.println(convert(longVal));
    }
}