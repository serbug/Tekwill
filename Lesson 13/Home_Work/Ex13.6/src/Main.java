/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex13.6 Users as strings
 *
 * @Author Sergiu
 */

/*Condition: You are given a class named User. It has three string fields: login, firstName,
lastName. Override the method toString() in the class to return string representations
of users. The overridden method must return a string including all field-value pairs
separated by commas.
*/
public class Main {
    public static void main(String[] args) {

        User user = new User("javagod", "James", "Gosling");
        System.out.println(user);


    }
}