public class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
