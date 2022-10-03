package testingpackage;

public class BalanceChecker {
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
