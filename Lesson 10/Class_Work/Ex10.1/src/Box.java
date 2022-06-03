public class Box {
    double height;
    double width;
    double length;

    public Box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getVolume(){
     return height*width*length;
    }
}
