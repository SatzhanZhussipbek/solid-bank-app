package solidbank.springproject;

public class Account {
    private AccountType accountType;

    private String id;

    private String clientID;

    private double balance;

    private boolean withdrawAllowed;

    public Account(AccountType accountType, String id, String clientID, double balance, boolean
            withdrawAllowed) {
        this.accountType = accountType;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }
    @Override
    public String toString() {
        return "";
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
