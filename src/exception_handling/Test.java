package exception_handling;

import java.awt.image.BaseMultiResolutionImage;

public class Test {
    private double balance;
    public Test(double amount){
        this.balance=amount;
    }
    public void withdraw(double amount) throws Exception{
        if (amount>balance){
            throw new InsuficientFundsException();

        }
        balance-=amount;
    }

}
