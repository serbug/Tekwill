/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex13.5 Book as strings
 *
 * @Author Sergiu
 */
/*Condition: Here's a class named Book. It has three fields: string field title, int field
yearOfPublishing and an array of strings authors. Override the method toString in
the class to return string representations of books.
The overridden method must return a string including all field-value pairs separated
by commas. An array of authors always includes at least one author.
*/
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java 8 in Action",2017, new String[]{"Mario Fusco","Alan Mycroft"});
        System.out.println(book);
    }
}