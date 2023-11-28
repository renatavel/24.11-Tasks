import java.util.Scanner;
interface Salary {
    int ToPay(int hours, int rate);
    default double salaryForOvertime(double totalNumberOfHours,double standardSalary){
       double rateOfOvertimePay=2;
        return standardSalary+(totalNumberOfHours*rateOfOvertimePay);
    }
    static String bonusReceived(int yearsOfExperience){
        if(yearsOfExperience>3){
            return "You're receiving a bonus!";
        }
        else {
            return "Unfortunately,not enough work experience.";
        }
    }
}
public class Staff extends Person implements Salary{
    String education,position;
    void intialize1(){
        super.initialize();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your education: ");
        education = sc.nextLine();
        System.out.println("Please enter your position: ");
        position = sc.nextLine();
    }

    String print1(){
        super.print();
        String all= "Education: "+this.education+",position: "+this.position;
        System.out.println(all);
        return all;
    }

    @Override
    public int ToPay(int workedHours,int rateOfTheHours){
       return workedHours*rateOfTheHours;
    }

}
