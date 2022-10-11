package testingpackage;

import org.springframework.beans.factory.annotation.Autowired;

public class DemoRunnerAppTest {

    @Autowired
    private BalanceChecker balanceChecker;
    @Autowired
    private AmountCalculator amountCalculator;
    public static void main(String[] anrgs){

        System.out.println("Good testing");
    }
}
