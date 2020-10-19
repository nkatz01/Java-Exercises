package bankAccount;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount (String name)
    {
        this.name=name;
        this.balance=0;
    }

    public void deposite(double amount)
    {
        balance+=amount;
    }
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    public void monthEnd()
    {
    }
    public double getBalance()
    {
        return balance;
    }
    public void print()
    {
        System.out.println("Account "+name+", balance "+balance);
    }

}
