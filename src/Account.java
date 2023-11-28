class NotEnoughMoneyException extends Exception{
    int n,y;
public NotEnoughMoneyException(int n,int y){
    this.n=n;
    this.y=y;
}
    @Override
public String toString(){
    return "You don't have enough money on your balance.";
}
        }
public class Account {
    String owner,accountNumber;
    int balance;
    Account(String owner,String accountNumber,int balance){
        this.owner=owner;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void transfer(int amountToTransfer) throws NotEnoughMoneyException {
       if(balance<amountToTransfer){
         throw new NotEnoughMoneyException(balance,amountToTransfer);
       }
       else{
           System.out.println("The operation could be performed successfully.");
       }
    }

    public static void main(String[] args) {
        Account account1 = null;
        try {
            account1 = new Account("Renata", "002R", 350);
            account1.transfer(350);
        } catch (NotEnoughMoneyException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Your current account balance: " + account1.balance + ".");
        }
    }
}
