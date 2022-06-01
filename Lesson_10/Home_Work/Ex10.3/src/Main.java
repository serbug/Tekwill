/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex10.3 Simulating a clock
 *
 * @Author Sergiu
 */

/*Condition: You are given a class Clock. It has two int fields: hours and minutes. The clock has
a minute scale from 0 to 59 and an hour scale from 1 to 12. The clock does not know
whether it's day or night (no AM or PM).

Implement the method next that increases the value of minutes by 1. The minutes
must be reset to zero when the current hour ends. Do not forget to change the hours as
well. Let's consider the examples.
*/
public class Main {

    public static void main(String[] args) {
	Clock clock = new Clock();
	clock.hours=25;
	clock.minutes=59;

	clock.next();


    }
}
