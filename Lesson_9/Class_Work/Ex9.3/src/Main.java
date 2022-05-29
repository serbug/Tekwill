/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex9.3 User
 *
 * @Author Sergiu
 */

/*Condition: Write a class named User. It must have three string fields: login,firstName,
 * lastName and a constructor with three parameters to initialize these fields.
 *
 * Create a instance of User class inside main method.*/

public class Main {
    public static void main(String[] args) {
        User user = new User("login", "firstName", "lastName");

        System.out.println("\n" + user.login + "\n" + user.firstName + "\n" + user.lastName);
    }
}