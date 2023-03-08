package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Ford");
        car.setColour("Red");
        car.setYear(1984);
        System.out.println(car.getModel());
        System.out.println(car.getColour());
        System.out.println(car.getYear());
    }
}
