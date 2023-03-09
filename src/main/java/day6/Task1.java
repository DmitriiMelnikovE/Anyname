package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(1980);
        System.out.println(car.yearDifference(2020));
        Motorbike motorbike = new Motorbike("Bike", "Black", 2000);
        motorbike.info();
        System.out.println((motorbike.yearDifference(2020)));

    }
}
