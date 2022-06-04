import java.util.Scanner;
/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex11.6 Heron's formula
 *
 * @Author Sergiu
 */

/*Condition: Many years ago when Paul went to school, he did not like Heron's formula to
calculate the area of a triangle, because he considered it very complex. Once he decided
to help all school students: to write and distribute the program, calculating the area of a
triangle by its three sides.
However, there was a problem: as Paul did not like the formula, he did not memorize
it. Help him finish this act of kindness and write the program, calculating the area of a
triangle by the transferred length of its sides, in accordance with the Heron's formula:
S = p * (p − a)(p − b)(p − c)
where p = – half-perimeter of the triangle. On the input, the program has (a + b + c) / 2
integers, and the output should be a real number corresponding to the area of the
triangle.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Insert the first side: ");
        int a = sc.nextInt();
        System.out.print("\n Insert the second side: ");
        int b = sc.nextInt();
        System.out.print("\n Insert the third side: ");
        int c = sc.nextInt();

        float area = (a+b+c)/2;

        System.out.println("\n Area of triangle is " + area);
    }
}