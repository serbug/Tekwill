import java.util.Scanner;

/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex7.2 Check burgs
 *
 * @Author Sergiu
 */
public class Main {

    public static void main(String[] args) {
	/*Condition: Write a program that reads the name of a city and checks if the name ends with
      "burg". Keep in mind, a city can have a short name. The program should output true or false.
     */

        Scanner sc = new Scanner(System.in);

        System.out.print("\n City: ");
        String city = sc.nextLine();

        boolean check = city.endsWith("burg");

        System.out.println("\n\t\t\t"+ String.valueOf(check).toUpperCase());
    }
}
