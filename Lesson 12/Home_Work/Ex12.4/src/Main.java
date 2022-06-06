/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex12.4 Shapes area
 *
 * @Author Sergiu
 */

/*Condition: You have five classes: Shape, Triangle, Circle, Square, and Rectangle. The class
Shape has a method area(). This method does nothing. Override the method in all
subclasses. Overridden methods should return an area of a particular figure. Use class fields for this.
The area of a triangle is S = bh/2where h is the height of the triangle, b is the base of the triangle.
The area of a circle is S = πR where R is the radius of the circle. For π use Math.PI 2 constant.
The area of a square is S = s where s is the length of the side of the square.
The area of a rectangle is S = wh where w is the width of the rectangle and h the
height of the rectangle.
*/
public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape();
        System.out.println("\n Shape area: " + shape.area());

        Triangle triangle = new Triangle();
        triangle.height = 5;
        triangle.base = 3;
        System.out.println("\n Triangle area: " + triangle.area());

        Circle circle = new Circle();
        circle.radius = 10;
        System.out.printf("\n Circle area is %.2f \n", circle.area());

        Square square = new Square();
        square.side = 6;
        System.out.println("\n Square area: " + square.area());

        Rectangle rectangle = new Rectangle();
        rectangle.width = 4;
        rectangle.height = 3;
        System.out.println("\n Rectangle area: " + rectangle.area());


    }
}
