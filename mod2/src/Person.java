import java.util.Scanner;

public class Person {
    String surname, first_name,street,city,zipCode;
     void initialize() {
         System.out.println("Please enter your surname: ");
         Scanner sc = new Scanner(System.in);
         surname = sc.nextLine();
         System.out.println("Please enter your first name: ");
         first_name = sc.nextLine();
         System.out.println("Please enter your street: ");
         street = sc.nextLine();
         System.out.println("Please enter your zip Code: ");
         zipCode = sc.nextLine();
         System.out.println("Please enter your city: ");
         city = sc.nextLine();
     }
     public String print(){
        String all="Surname: "+this.surname+",first name: "+this.first_name+",street: "+this.street+",zip Code: "+this.zipCode+",city: "+this.city;
         System.out.println(all);
         return all;
     }
}
