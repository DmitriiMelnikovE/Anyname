package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e=scanner.nextInt();
        if (e>=1&&e<=4){
            System.out.println("Малоэтажный дом");
        } else if (e>=5&&e<=8){
            System.out.println("Среднеэтажный дом");
        } else if (e>=9){
            System.out.println("Многоэтажный дом");
        } else if (e<=0){
            System.out.println("Ошибка ввода");
        }
    }
}
