package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i=0; i<=20000;i++){
            sb.append(i+" ");
        }System.out.println(sb.toString());
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        long startTime1 = System.currentTimeMillis();
        for (int i=0; i<=20000;i++){
            System.out.print(i+" ");
        }long stopTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
    }
}
