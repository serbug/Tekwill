/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex15.1 Complex numbers
 *
 * @Author Sergiu
 */
/*Condition: Here's a class ComplexNumber. You need to override its methods equals() and
hashCode(). The method equals() should compare two instances of ComplexNumber
by the fields re and im. The method hashCode() must be consistent with your
implementation of equals().
Implementations of the method hashCode() that return a constant or do not
consider a fractional part of re and im, will not be accepted.
*/
public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()

        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}