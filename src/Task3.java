import java.util.Random;
import java.util.Scanner;

public class Task3 {
    static int sum=0;
    static int array[];
    static int[] generateArray(int n){
        int array[]=new int[n];
        sum=0;
        Random rnd=new Random();
        for(int i=0;i< array.length;i++){
            array[i]= rnd.nextInt(-10,10);
            sum+=array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        do{
            array=generateArray(n);
        }while(sum!=0);

        for(int value:array){
            System.out.print(value +" ");
        }
    }
}
