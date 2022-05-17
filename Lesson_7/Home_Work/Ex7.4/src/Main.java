import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

        //Solution 1
        System.out.print("\n Insert a date (2017-07-28): ");
        String date = sc.nextLine();

        String[] str = date.split("-");

        for (String temp : str) {

            temp = str[1] + "/" + str[2] + "/" + str[0];
            date = temp;

        }
        System.out.println("\n New format: "+date);

        //Solution 2 best practice
//        LocalDate localDate = LocalDate.now();
//
//        System.out.print("\n Initial date format: " + localDate);
//
//        String date = localDate.format(DateTimeFormatter.ofPattern("dd/MM/yy"));
//
//        System.out.println("\n Date string formatted: " + date);

    }
}
