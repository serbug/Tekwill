/**
 * Tekwill Academy
 * Java Fundamentals
 * Exercise Ex14.4 Mutable geometric shapes
 *
 * @Author Sergiu
 */
/*Condition: Suppose, you are writing a geometric engine. Now it includes classes Circle,
Rectangle and interfaces Movable and Scalable.
*/
public class Main {
    public static void main(String[] args) {
        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);

        MutableShape rectangle = new Rectangle(1.0f,1.0f,1.0f,1.0f);
        rectangle.move(0.5f,0.75f);
        rectangle.scale(0.25f);


        System.out.println(((Circle) circle).getRadius());
    }
}