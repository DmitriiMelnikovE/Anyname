package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        for (int i=0; i<matrix.length;i++) {
        for (int j=0; j<matrix[i].length;j++){
            matrix[i][j]=(int)(Math.random()*50);
        }
        }System.out.print("Массив матрицы: ");
        for (int[] a:matrix){
            System.out.println();
            for (int b:a){
                System.out.print(b+" ");
            }
        }System.out.println();
        int max=0;
        int index=0;
        for (int i=0; i<matrix.length; i++){
            int sum=0;
            for (int j=0; j<matrix[i].length;j++){
                sum=sum+matrix[i][j];
            }System.out.print(sum+" ");
            if(sum>=max){
                max=sum;
                index=i;
            }
        }System.out.println();
        System.out.println("Максимальное число: "+max+". В строке "+index);
    }
}
