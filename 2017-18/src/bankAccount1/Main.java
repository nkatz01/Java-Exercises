package bankAccount1;

class Main {
    public static void main(String[] args) {
        final double THRESHOLD = 12;
        SavingsAccount savingsaccount1 = new SavingsAccount();
        StandardAccount standardaccount = new StandardAccount();
        savingsaccount1.setInterestRate(10);

        savingsaccount1.deposit(100);

        System.out.println(savingsaccount1.getBalance());

//savingsaccount1.withdraw(10);
        savingsaccount1.monthEnd();
        savingsaccount1.monthEnd();

        System.out.println(savingsaccount1.getBalance());

        System.out.println(savingsaccount1.getMonthlyIncome());
        RentalProperty rentalproperty = new RentalProperty(100, "1 bishops ave");
        //  System.out.println(savingsaccount1.isIncomeAboveThreshold(12));
        System.out.println(rentalproperty.getMonthlyIncome());
        MonthlyIncomeDriver.printInfo(rentalproperty, THRESHOLD);
        MonthlyIncomeDriver.printInfo(savingsaccount1, THRESHOLD);


    }




}