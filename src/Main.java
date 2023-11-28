import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==0){
                str.append("+");
            }
            else{
                str.append("-");
            }
        }
        System.out.println(str);


    }
}