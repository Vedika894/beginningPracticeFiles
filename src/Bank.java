public class Bank {
    //Represents the first account in the bank
    private CheckingAccount accountOne;

    //Represents the second account in the bank
    private CheckingAccount accountTwo;

    public Bank() {
        //Blank constructor initializing 2 accounts with default value
        accountOne = new CheckingAccount("Zeus", 100, "1", "USD");
        accountTwo = new CheckingAccount("Hades", 200, "2", "USD");
    }
    public CheckingAccount getAccountOne(){
        return accountOne;
    }
    public CheckingAccount getAccountTwo(){
        return accountTwo;
    }
     //setter method
    public CheckingAccount setAccountTwo(){
        return accountTwo;
    }

    public CheckingAccount setAccountOne(){
        return accountOne;
    }



}

