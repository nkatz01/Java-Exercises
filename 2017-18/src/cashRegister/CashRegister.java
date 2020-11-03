package cashRegister;

public class CashRegister {
    private int itemCount;
    private double totalPrice;

    public void addItem(double price)
    {
        itemCount++;
        totalPrice+=price;
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

    /*Constructor*/
    public CashRegister()
    {
        itemCount=0;
        totalPrice=0;
    }


}
