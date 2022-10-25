package testingpackage;

public class BalanceChecker {

    public BalanceChecker(AmountCalculator amount, int balance) {
        this.amount = amount;
        this.balance = balance;
    }
//Constructor
    private AmountCalculator amount;
    private int balance;
//Getter
    public AmountCalculator getAmount() {
        return amount;
    }
//Getter
    public int getBalance() {
        return balance;
    }
//Setter
    public void setAmount(AmountCalculator amount) {
        this.amount = amount;
    }
//Setter
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
