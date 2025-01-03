//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder,int balance ){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //setters for both fields
    public void setAccountHolder(String holder){
        this.accountHolder = holder;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
   //getters for both fields
    public String getAccountHolder(){
        return accountHolder;
    }
   public double getBalance(){
        return balance;
   }

   public void deposit (double deposit){
        balance += deposit;
   }

   public void withdraw (double withdraw){
        if (balance >= 0){
            balance -= withdraw;
       }
        if (withdraw > balance){
            System.out.println("error");
        }
        }
       public void printSummary (){
           System.out.printf("Account Holder: %s \n",accountHolder);
           System.out.printf("Balance : %.2f \n", balance);
       }

    public static void main(String[] args) {
      BankAccount account1 = new BankAccount("Vedika", 100000);
      BankAccount account2 = new BankAccount("Bhavna", 100000);
     //calling each method
        account1.deposit(40000);
        account2.deposit(40000);

        account1.withdraw(0);
        account2.withdraw(0);

        account1.printSummary();
        account2.printSummary();
    }
}