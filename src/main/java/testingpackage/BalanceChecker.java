package testingpackage;

public class BalanceChecker {

    public BalanceChecker(AmountCalculator amount, int balance) {
        this.amount = amount;
        this.balance = balance;
    }

    private AmountCalculator amount;
    private int balance;

    public AmountCalculator getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setAmount(AmountCalculator amount) {
        this.amount = amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
