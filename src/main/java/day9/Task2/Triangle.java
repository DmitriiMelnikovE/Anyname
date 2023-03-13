package day9.Task2;

import day9.Task1.Teacher;

public class Triangle extends Figure{
    private double length1;
    private double length2;
    private double length3;
    public Triangle (double length1, double length2, double length3, String colour){
        super(colour);
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
    }
    @Override
    public double perimeter() {
        return length1+length2+length3;
    }
    double p=(length1+length2+length3)/2;
    @Override
    public double area() {
       return Math.sqrt(p*(p-length1)*(p-length2)*(p-length3));
    }
}
