public class Circle extends Shape {
     double radius;

    @Override
    public double area() {

        return Math.PI * (Math.pow(radius, 2));
    }
}
