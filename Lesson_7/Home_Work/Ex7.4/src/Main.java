import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex7.4 Convert a date
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {

	/* Condition: Write a program that takes a date string formatted as YYYY-MM-DD as input, then
        converts and outputs it as MM/DD/YYYY. For instance, the input 2007-07-21 will result in
        the following output 07/21/2007.
     */
        Scanner sc = new Scanner(System.in);

        LocalDate localDate = LocalDate.now();
        System.out.print("\n Initial date format: " + localDate);

        String date = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yy")); // V

       // System.out.println(Arrays.toString(localDate.toString().split("-", 2))); X
        System.out.println("\n Date string formatted: " + date);// V

        //System.out.println(String.valueOf(date.replace("-","/"))); X

    }
}
