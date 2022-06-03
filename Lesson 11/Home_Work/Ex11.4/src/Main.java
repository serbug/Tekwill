/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex11.4 Danger levels
 *
 * @Author Sergiu
 */

/*Condition: You are given an enum named DangerLevel.
enum DangerLevel {
HIGH,
MEDIUM,
LOW;
}
Add an integer field to store danger levels and match the number with each
constant:
● HIGH — 3
● MEDIUM — 2
● LOW — 1

You should also add the instance method getLevel that returns the associated
integer number. After your modifications, the following code should be compiled and
work correctly:
DangerLevel high = DangerLevel.HIGH;
DangerLevel medium = DangerLevel.MEDIUM;
System.out.println(high.getLevel() > medium.getLevel()); // true
*/

public class Main {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        System.out.println(high.getLevel() > medium.getLevel()); // true
    }
}