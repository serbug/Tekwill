/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercises Ex13.4 Account
 *
 * @Author Sergiu
 */
/*Condition: There is a class named Account. It includes three fields: id, code and balance.
Override the method toString() in this class. The method should return a string
representation of an instance of the Account.
*/
public class Main {
    public static void main(String[] args) {
        Account account = new Account(10, "123-456-789", 2000L);
        System.out.println(account);
    }
}