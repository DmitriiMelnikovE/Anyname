package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> car = new ArrayList<>();
        car.add("Ford");
        car.add("Toyota");
        car.add("Honda");
        car.add("Mazda");
        car.add("Jeep");
        for (String cars : car) {
            System.out.print(cars + " ");
        }
        car.add(3, "Volvo");
        car.remove(0);
        System.out.println();
        for (String cars : car) {
            System.out.print(cars + " ");
        }
    }
}
