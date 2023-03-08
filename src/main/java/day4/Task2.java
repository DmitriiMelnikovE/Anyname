package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i=0; i< array.length; i++){
            array[i]=(int)(Math.random()*10000);
        } System.out.println("Сгенерирован следующий массив: ");
        int max=0;
        for(int result:array){
            System.out.print(result+" ");
            if (result>max){
            max=result;
            }
        }   System.out.println();
        System.out.println("Максимально число: "+max);
        int min=10001;
        for (int result:array){
            if (result<min){
                min=result;
            }
        }System.out.println("Минимальное число: "+min);
        int zero=0;
        int amount=0;
        int sum=0;
            for (int result:array){
                if (result%10==0){
                    zero=result;
                    amount++;
                }
            }
            System.out.println("Количество чисел, оканчивающихся на 0: "+amount);
            for (int result:array){
                if (result%10==0){
                    zero=result;
                    sum=sum+zero;
                }
            }System.out.println("Сумма чисел, оканчивающихся на 0: "+sum);
    }

}
