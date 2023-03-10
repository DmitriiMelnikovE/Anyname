package day9.Task2;

public class Rectangle extends Figure{
    private double width;
    private double height;
    public Rectangle(double width, double height, String colour){
        super(colour);
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return width*height;
    }

    @Override
    public double perimeter() {
        return 2*width+2*height;
    }
}
