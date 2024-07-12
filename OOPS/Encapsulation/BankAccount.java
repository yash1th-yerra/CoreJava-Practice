public class BankAccount {
    private String accountNumber;
    private double balance;
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("amount deposit "+amount+" successful");
        }
        else{
            System.out.println("invalid deposit amount");
        }

    }
}
class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.setAccountNumber("123456789");
        account.deposit(5000);
        account.deposit(10000);
        System.out.println("Account no:"+account.getAccountNumber()+" balance:"+account.getBalance());
    }
}