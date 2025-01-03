//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0.0;
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
        if ( withdraw <= this.balance && withdraw >= 0){
            this.balance -= withdraw;
        }
        else{
            System.out.println("Insufficient funds");
        }
        }
       public void printSummary (){
           System.out.printf("Account Holder: %s \n",accountHolder);
           System.out.printf("Balance : %.2f \n", balance);
       }
      //could not create the transfer method by myself,
    public void transfer(BankAccount otherAccount, double amount){
        //withdraw
        if (amount > this.balance){
            System.out.println("not enough funds");
            return;
        }
        //withdraw from the account
        this.withdraw(amount);

        //deposit in the other account
        otherAccount.deposit(amount);
    }
    public static void main(String[] args) {
      BankAccount account1 = new BankAccount("Vedika");
      BankAccount account2 = new BankAccount("Bhavna");
     //calling each method
        account1.deposit(100.0);
        account2.deposit(50.0);

        account1.withdraw(0);
        account2.withdraw(0);

        account1.transfer(account1, 30.0);


        account1.printSummary();
        account2.printSummary();
    }
}