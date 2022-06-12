/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex14.5 Returning from a method
 *
 * @Author Sergiu
 */
/*Condition: Java has a standard interface named java.lang.Runnable with the single method
run. The method has no arguments and returns nothing.
You should implement the given method createRunnable that takes two
arguments: text and repeats. The method must return an instance of an anonymous
class implementing java.lang.Runnable. The overridden method of the anonymous
class should
*/
public class Main {
    public static void main(String[] args) {

   Create.createRunnable("Hello!",5).run();

    }
}