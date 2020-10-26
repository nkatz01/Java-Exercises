package bankAccount1;

public class RentalProperty implements ProvidesMonthlyIncome{
    String address;
    int rent;
    RentalProperty(int rent, String address){
        this.rent=rent;
        this.address=address;
    }

    public double getMonthlyIncome(){
        return rent;
    }

}