package calculateInterest;

import java.util.Scanner;
class Main //IC4 (interestCalculator4)
{
    public static void main(String arg[])
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter initial balance");
        double initialBalance = scan.nextInt();

        double currentBalance=initialBalance;
        double interestAccumulated=0;
        int years=0;

        while (currentBalance<(initialBalance*2))
        {

            interestAccumulated= interestOn(currentBalance);
            currentBalance=currentBalance+interestAccumulated;
            years++;
            System.out.printf("Your balance at year %d, together with 5%% earened interest, is £%.2f\n", years, currentBalance);

        }
        System.out.printf("Starting with an initial balance of £%.2f, your balance will have more than doubled - to £%.2f by %d years, and of which £%.2f is the interest earned at a rate of 5%%\n",
                initialBalance, currentBalance, years,  interestAccumulated);

        interestOnSavingYears();
    }

    public static double interestOn(double balance)
    {
        double interest = balance * 0.05;
        return interest;

    }

    public static void interestOnSavingYears()
    {
        double initialBalance = 10000;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter saving years");
        int savingYears = scan.nextInt();

        System.out.println("The initial balance is £" + initialBalance);

        double currentBalance=initialBalance;
        double interestAccumulated=0;
        for (int i=1; i<=savingYears; i++){
            interestAccumulated= interestOn(currentBalance);
            currentBalance=currentBalance+interestAccumulated;
            System.out.printf("Year %d balance is £%.2f interest earned is £%.2f\n", savingYears, currentBalance, interestAccumulated);
        }
    }

}
