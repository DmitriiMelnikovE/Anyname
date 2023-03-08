package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum=0;
        int max=0;
        int index=0;
        for (int i=0;i<array.length;i++) {
            array[i] = (int) (Math.random() * 10000);
            System.out.print(array[i] + " ");
        }for (int i=0;i<array.length;i++){
            sum=array[i]+array[i+1]+array[i+2];
            if(i== array.length-3)
            break;
            if (sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println();
        System.out.println("Значение суммы: "+max+". Индекс: "+index);
    }
}
