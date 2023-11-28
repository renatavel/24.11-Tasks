public class Main {
    public static void main(String[] args) {
        Staff person1=new Staff();
        person1.intialize1();
        person1.print1();

        System.out.println(person1.ToPay(16,35));
        System.out.println(person1.salaryForOvertime(3,100));
        System.out.println(Salary.bonusReceived(4));
    }
}