public class CheckingAccount {
    private String name;
    private int balance;
    private String id;
    private double interestRate;
    private String currency;
    private boolean isActive;

    /**
     * Constructor for checking account
     *
     * @param inputName     the name of the account holder
     * @param inputBalance  the initial balance of the account
     * @param inputId       the unique identifier for the account
     * @param inputCurrency The currency type of the account (e.g USD, EUR).
     */
    public CheckingAccount(String inputName, int inputBalance, String inputId, String inputCurrency) {
        this.name = inputName;
        this.balance = inputBalance;
        this.id = inputId;
        this.currency = inputCurrency;
        this.interestRate = 0.02;
        this.isActive = true;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public double getMonthlyInterest() {
        return this.interestRate * this.balance;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void closeAccount() {
        this.isActive = false;
        this.balance = 0;
        System.out.println("Account" + this.id + "has been closed");

    }

    public void applyFees(int feeAmount) {
        if (this.balance >= feeAmount) {
            this.balance -= feeAmount;
            System.out.println(" Fee of " + feeAmount + " " + this.currency + "applied to account" + this.id);
        }
    }
}
