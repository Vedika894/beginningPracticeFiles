//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Bank bankOfGods = new Bank();

                // Access accountOne through the Bank's getter
                CheckingAccount accountOne = bankOfGods.getAccountOne();
                System.out.println("Account One Balance: " + accountOne.getBalance());

                // Modify accountOne's balance
                accountOne.setBalance(5000);
                System.out.println("Updated Balance: " + accountOne.getBalance());
                System.out.println("Monthly Interest: " + accountOne.getMonthlyInterest());

                // Close accountOne
                accountOne.closeAccount();

                // Access accountTwo through the Bank's getter
                CheckingAccount accountTwo = bankOfGods.getAccountTwo();

                // Apply fees to accountTwo
                accountTwo.applyFees(50);
                System.out.println("Account Two Balance after fees: " + accountTwo.getBalance());
            }
        }


