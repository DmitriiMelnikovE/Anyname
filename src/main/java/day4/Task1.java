package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i=0; i<size; i++){
            a[i]=(int) (Math.random()*10);
        }System.out.println("Введено число "+size+". Сгенерирован следующий массив:");
        for (int b:a){
            System.out.print(b+" ");
        } System.out.println();
        System.out.println("Длина массива: "+size);
        int c8=0;
        for (int i=0; i<size;i++){
            if (a[i]>8){
                c8++;
            }
        } System.out.println("Количество чисел больше 8: "+c8);
        int c1=0;
        for (int i=0; i<size;i++){
            if (a[i]==1){
                c1++;
            }
        } System.out.println("Количество чисел равных 1: "+c1);
        int cc=0;
        for (int i=0; i<size;i++){
            if (a[i]%2==0){
                cc++;
            }
        } System.out.println("Количество четных чисел: "+cc);
        int cn=0;
        for (int i=0; i<size;i++){
            if (a[i]%2!=0){
                cn++;
            }
        } System.out.println("Количество нечетных чисел: "+cn);
        int sum=0;
        for (int i=0; i<a.length;i++){
            sum=sum+a[i];
        }System.out.println("Сумма всех чисел массива: "+sum);
    }
}
