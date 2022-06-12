public class Rectangle extends Shape {
    protected double a;
    protected double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}
