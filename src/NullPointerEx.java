import java.util.Scanner;

public class NullPointerEx {
    public static void main(String[] args) {
        try{
           String smth=null;
            System.out.println(smth.toLowerCase());
        }
        catch(NullPointerException e){
            System.out.println("You cannot enter the null value!");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
