/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex14.1 IntBinaryOperation
 *
 * @Author Sergiu
 */
/*Condition: You are given an abstract class IntBinaryOperation. It has one abstract method
perform() and two fields representing the operation arguments. The fields are
initialized in the constructor. See the provided code template.
You need to declare and implement two classes representing concrete operations:
Addition and Multiplication. The classes must extend the abstract class and
implement the method perform(). The implementations should work in accordance
with the class name. Do not forget to write two-argument constructors in your classes.
*/
public class Main {
    public static void main(String[] args) {

        Addition addition = new Addition(3, 2);
        Multiplication multiplication = new Multiplication(3, 2);

        System.out.println("\nAddition operation: " + addition.perform());
        System.out.println("\nMultiplication operation: " + multiplication.perform());
    }
}