package bankAccount1;

public class StandardAccount extends Account {
    private int withdrawals;

    public void withdraw(double amount) {
        final int FREE_WITHDRAWALS = 3;
        final double WITHDRAWAL_FEE = 1;
        super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS)
            super.withdraw(WITHDRAWAL_FEE);
    }

    public void monthEnd() {
        withdrawals = 0;
    }
}