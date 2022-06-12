/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex14.3 Shape hierarchy
 *
 * @Author Sergiu
 */
/*Condition: You have an abstract class Shape with two abstract methods: getPerimeter() and
getArea(). See the provided code template.
You need to declare and implement three classes: Triangle, Rectangle, and
Circle. The classes must extend the Shape class and implement all abstract methods.
To implement the methods the standard class Math may help you.
● The class Triangle must have a constructor with three double arguments for
setting the length of each side. To calculate the area of this shape you may use
Heron's formula.
● The class Rectangle must have a constructor with two double arguments for
setting the length of different sides.
● The class Circle must have a constructor with one double argument for setting
the radius. You may use Math.PI as the PI constant or you can declare it yourself.
*/
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\n Triangle perimeter: " + triangle.getPerimeter());
        System.out.println(" Triangle area: " + triangle.getArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("\n Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println(" Rectangle area: " + rectangle.getArea());

        Circle circle = new Circle(10);
        System.out.println("\n Circle perimeter: " + circle.getPerimeter());
        System.out.println(" Circle area: " + circle.getArea());
    }
}