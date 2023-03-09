package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2000,70, 162);
        airplane.setYear(2010);
        airplane.setLength(80);
        airplane.fillUp(50);
        airplane.fillUp(20);
        airplane.info();
    }
}
