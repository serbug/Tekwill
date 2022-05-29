/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex10.1 Counter
 *
 * @Author Sergiu
 */

/*Condition: You are given a class named Counter. Write two instance methods:
● inc that increases the value of the field current by one;
● getCurrent that returns the current value;
*/
public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        count.inc();
        count.inc();
        count.inc();
        System.out.println(count.getCurrent());
    }
}