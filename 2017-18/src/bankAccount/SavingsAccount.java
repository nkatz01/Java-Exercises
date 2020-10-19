package bankAccount;

public class SavingsAccount extends BankAccount{
    public double interestRate;
    private double minBalance;
    public SavingsAccount(String name, double interestRate){
        super(name);
        this.interestRate=interestRate;
        this.minBalance=0;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;

    }
    public void monthEnd(){
        deposite(minBalance+interestRate/100);
        minBalance= getBalance();
    }
    public void withdraw(double amount){
        super.withdraw(amount);
        if (getBalance()<minBalance)
            minBalance=getBalance();
    }
    public void print(){
        System.out.print("Savings");
        super.print();
        System.out.print(", interest rate = "+ interestRate);
    }
}