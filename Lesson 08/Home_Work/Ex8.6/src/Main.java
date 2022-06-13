/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex8.6 Overloading methods
 *
 * @Author Sergiu
 */

/* Condition: Given a method that takes a long value and returns the max value of the long type
minus the given number.
public static long getMaxMinusCurrent(long val) {
return Long.MAX_VALUE - val;
}
Overload this method with two new methods. The first one should take an int and
return the max value of the int type minus the given value. The second one should take a
short value and return the max value of the short type minus the given value. For both
methods, the type of result value must be the same as the type of the parameter.
*/
import java.util.Scanner;

public class Main {
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }
    public static short getMaxMinusCurrent(short val) {
        return (short) (Short.MAX_VALUE - val);
    }
// Do not change code below
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "long" -> {
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
            }
            case "int" -> {
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
            }
            case "short" -> {
                final short shortVal =
                        Short.parseShort(scanner.nextLine());
                final short shortResult = getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
            }
            default -> System.out.println("Unknown type found");
        }
    }
}
