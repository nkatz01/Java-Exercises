package bankAccount1;

public class SavingsAccount extends Account implements ProvidesMonthlyIncome {
    private double interestRate, minimumMonthlyBalance;

    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < minimumMonthlyBalance)
            // use the accessor method
            minimumMonthlyBalance = getBalance();
    }
    @Override
    public double getMonthlyIncome(){
        return (minimumMonthlyBalance * interestRate/100);
    }

    public void monthEnd() {
        deposit(minimumMonthlyBalance * interestRate / 100);
        minimumMonthlyBalance = getBalance();
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}