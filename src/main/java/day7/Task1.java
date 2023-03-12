package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Plane 1", 2000, 30, 100);
        Airplane plane2 = new Airplane("Plane 2", 2010, 40, 150);
        Airplane.compareAirplanes(plane1, plane2);
    }
}