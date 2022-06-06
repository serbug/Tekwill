public class Square extends Shape {
    double side;

    @Override
    public double area() {

        return Math.pow(side, 2);
    }
}
