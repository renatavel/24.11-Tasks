import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        String number=scn.nextLine();
        char[] array=number.toCharArray();
        boolean isSorted=true;
        for(int i=0;i<number.length()-1 && isSorted;i++){
            isSorted=false;
            for(int j=1;j<number.length();j++){
                if((int)number.charAt(i)<(int)number.charAt(j))
                {
                    char temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    isSorted=true;
                }
                else{
                    isSorted=false;
                }
            }
        }

        String largestNumber = new String(array);
        System.out.println(largestNumber);
    }
}
