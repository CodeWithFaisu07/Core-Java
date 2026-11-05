package Multithreading;

public class HSBCBank {
    int accountBal;
    public HSBCBank(int accountBal){
        this.accountBal=accountBal;
    }
   public void withdrawal(int withdrawal){
        accountBal=accountBal-withdrawal;
    }
    public void deposite(int deposite) {
        accountBal=accountBal+deposite;
    }
    public void checkBalance(){
        System.out.println("The Balance is the Account is "+accountBal)
    }
}
