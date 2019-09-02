package previousExams;


/**
 * Write a description of class CashRDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRDriver
{
    public static void main(String[] args){
    CashRegisterMK2 reg1 = new CashRegisterMK2();
    reg1.addItem(2.95);
    reg1.addItem(1.99);
    System.out.println(reg1.getCount() + " items, total " + reg1.getTotal());
    //reg1.clear();
    reg1.clear2();
    System.out.println(reg1.getCount() + " items, total " + reg1.getTotal());
    
    }
}
