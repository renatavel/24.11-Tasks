import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scn=new Scanner(System.in);
            System.out.println("Please enter the first value: ");
            int x=scn.nextInt();
            System.out.println("Please enter the second value: ");
            int y=scn.nextInt();
            double division=x/y;
            System.out.println(division);

            int array[] =new int[6];
            System.out.println(array[7]);
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("The program finished.");
        }
    }
}