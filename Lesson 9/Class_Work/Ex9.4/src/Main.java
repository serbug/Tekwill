/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex9.4
 *
 * @Author Sergiu
 */

/*Condition: You are given a class named Movie. Write two constructors for the class.
 *    The first constructor should take three argumens(title,desc,year) and initialize the
 *    corresponding fields.
 *    The second one should take only two argumens(title,year) and initialize title and year.
 *    In this cas, the field desc should have a value "empty".
 * */
public class Main {
    public static void main(String[] args) {

        Movie mv1 = new Movie("Tunul de lemn", "Moldova film", 1986);
        System.out.println("\nFirst Movie: " + mv1.toString());

        Movie mv2 = new Movie("Mesterul Manole", 1995);
        System.out.println("\nSecond Movie: " + mv2.toString());
    }
}