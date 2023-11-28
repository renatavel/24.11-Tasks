import java.util.Scanner;
class NotCapitalizedLetter extends Exception{
    boolean isCapitalized=true;
    public void NotCapitalizedLetter(boolean isCapitalized){
        this.isCapitalized=isCapitalized;
    }
    @Override
    public String toString(){

        return "You haven't started the string value with the capital letter!";
    }

}
class NotPolindrom extends Exception{
    boolean isPolindrom=false;
    public void NotPolindrom(boolean isPolindrom){
        this.isPolindrom=isPolindrom;
    }
    @Override
    public String toString(){

        return "You haven't entered a polindrom.";
    }

}
class NotTheRightLengthException extends Exception{
    int length;
    public void NotTheRightLengthException(int length){
        this.length=length;
    }
    @Override
    public String toString(){

        return "Your string length is out of the bounds.";
    }
}
public class DifferentEx {
    public static void main(String[] args) {
        try {
            Scanner scn = new Scanner(System.in);
            String str = scn.nextLine();
            if (str.length() >= 10) {
                throw new NotTheRightLengthException();
            } else {
                System.out.println("The \""+str+"\" string has a correct length.");
            }
            boolean isPolindrom=true;
            for(int i=0;i<str.length();i++){
              if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(str.length()-i-1)) {
                  isPolindrom=false;
                  break;}
            }
            if(isPolindrom){
                System.out.println("It is a polindrom!");
            }
            else{
                throw new NotPolindrom();
            }

            if(!Character.isUpperCase(str.charAt(0))){
                throw new NotCapitalizedLetter();
            }
            else{
                System.out.println("The string value was written correctly.");
            }

        } catch (NotTheRightLengthException | NotPolindrom | NotCapitalizedLetter e) {
            throw new RuntimeException(e);
        }
    }
}
