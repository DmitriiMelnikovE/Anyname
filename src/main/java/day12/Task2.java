package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        numbers(number);
    }
    public static List<Integer> numbers (List<Integer> number){
        for (int i = 0; i <= 350; i += 2) {
            number.add(i);
        }
        for (int i = 0; i <= 133; i++) {
            number.remove(16);
        }
        System.out.print(number + " ");
        return number;
    }
}
