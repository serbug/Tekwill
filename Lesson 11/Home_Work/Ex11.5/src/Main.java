/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex11.5 The secret enumeration
 *
 * @Author Sergiu
 */

/*Condition: You are given a hidden enum named Secret with some constants in uppercase.
Write a program that counts and prints how many constants in the enumeration start
with "STAR". The enum is accessible during testing.
The small enum for tests:
// At least two constants start with STAR
enum Secret {
STAR, CRASH, START, // ..
}
*/
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (Secret value : Secret.values()) {
            if (value.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}