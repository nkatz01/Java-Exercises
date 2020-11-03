package bankAccount1;

public interface ProvidesMonthlyIncome {
    double getMonthlyIncome();


    default boolean isIncomeAboveThreshold(double threshold){
        if (threshold<this.getMonthlyIncome())
            return true;
        else
            return false;
    }
}