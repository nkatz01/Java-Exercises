package bankAccount;

public class CashRegister {


    private int itemCount;
    private double totalPrice;
    private String name;
    private static int noOfRegisters=0;
    public void addItem(double price)
    {
        itemCount++;
        totalPrice+= price;
    }
    public void clear()
    {
        itemCount=0;
        totalPrice=0;
    }

    public double getTotal()
    {
        return totalPrice;
    }

    public int getCount()
    {
        return itemCount;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name +" item count: "+itemCount+ ", item price: "+totalPrice;
    }

    public static double changeClass(double totPri){
        return totPri/100;
    }
    public static int changeNoOfRegisters(){
        noOfRegisters--;
        return noOfRegisters;
    }
    public static int getNoOfRegisters(){
        return noOfRegisters;
    }
    public CashRegister(String name){
        this.name=name;
        itemCount=0;
        totalPrice=0;
        noOfRegisters++;
    }

}


