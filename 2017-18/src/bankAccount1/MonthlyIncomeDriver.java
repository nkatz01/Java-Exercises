package bankAccount1;

public class MonthlyIncomeDriver{

    public static void printInfo(ProvidesMonthlyIncome provider, double threshold){
        System.out.println(provider.getMonthlyIncome()+"is above threshold: "+provider.isIncomeAboveThreshold(threshold));
    }

}