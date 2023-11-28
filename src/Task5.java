public class Task5 {
     public static String repFirstChar(String s){
            char c=s.charAt(0);
        if(65<=(int)c && (int)c<=90){
            return "upper";
        }
        else if(97<=(int)c && (int)c<=122){
            return "lower";
        }
        else if(48<=(int)c && (int)c<=57){
            return "digit";
        }
        else{
            return "others";
        }
    }
    public static void main(String[] args) {
         System.out.println(repFirstChar("test"));
    }
}
