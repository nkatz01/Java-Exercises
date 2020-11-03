package bankAccount1;

public abstract class Account {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract void monthEnd();

    public double getBalance() {
        return balance;
    }
}