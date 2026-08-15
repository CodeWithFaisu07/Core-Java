package exception_handling;

public class InsuficientFundsException extends Exception{
    public InsuficientFundsException(){
        super("what do you want ? you dont have money");
    }
}
