/**
 * Tekwill Academy
 * Java Fudamentals
 * Exercises Ex9.1 Books
 *
 * @Author Sergiu
 */
public class Main {
    public static void main(String[] args) {
        /*Condition: Write a class named Book. It must have three fields:
        * 1. string field title
        * 2. int field yearOfPublishing
        * 3. boolean field isAvailable
        * */

        Book book=new Book();

        book.title="Abecedar";
        book.yearOfPublishing=1995;
        book.isAvailable=false;

        System.out.println("Book: Title - "+book.title+"\nPublishing - "+book.yearOfPublishing+"\nStatus - "+book.isAvailable);
    }
}