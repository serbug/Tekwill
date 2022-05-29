/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex9.1 Books
 *
 * @Author Sergiu
 */

/* Condition: Write a class named Book. It must have three fields:
 *             1. string field title
 *             2. int field yearOfPublishing
 *             3. boolean field isAvailable
 *  */
public class Main {

    public static void main(String[] args) {
        Book book = new Book();

        book.title = "Thinking in Java";
        book.yearOfPublishing = 2011;
        book.isAvailable = false;

        String status;
        if (!book.isAvailable) {
            status = "Unavailable";
        } else {
            status = "Available";
        }

        System.out.println("\n" + book.title + "\n" + book.yearOfPublishing + "\n" + status);
    }
}