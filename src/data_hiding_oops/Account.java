

public static class Account {
    private double balance;

    //Public Method to Withdraw Money
    public double getBalance(double balance){
        boolean result = validate("Faisal Khan", "faisal@khan8084");
        if(result){
            this.balance = this.balance - balance;
            System.out.println("Amount is Debited from your Account" +balance);
        }
        else{
            //throw a meaningful erorr  or Message
            System.out.println("UserName/Password is Invalid");
        }
        return 0.0;
    }

    //Public Method to Deposit Money
    public void setBalance(double balance){
        boolean result = validate("Faisal Khan", "faisal@khan8084");
        if(result == true){
            this.balance= this.balance+balance;
            System.out.println("Amount is Credited "+balance);
        }

    }
    //private Method for Authentication
    private boolean validate(String username , String Password){
        //logic of Authentication;
        return  username.equalsIgnoreCase("Faisal Khan") && Password.equals("faisal@khan8084");
    }
}

static void main() {
    Account acc = new Account();
    acc.setBalance(40000);
    acc.getBalance(45);

}

