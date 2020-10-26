package cashRegister;

/*test cash register*/
import java.util.Scanner;
public class Main
{
    public static  void main(String[] args)
    {   //of calss scanner, create object anew, and initialize by cunstrocter Scanner, passint it the object System.in
        CashRegister reg1 = new CashRegister();

        System.out.println("please enter the price on the item");
        Scanner scan1 = new Scanner(System.in);
        double price=scan1.nextDouble();
        reg1.addItem(price);

        System.out.println("please enter the price on the item");
        price=scan1.nextDouble();
        reg1.addItem(price);

        System.out.println("Total cost is " + reg1.getTotal() + " and number of items bought is " + reg1.getCount() );
            /*System.out.println((reg1.getCount()==2)?"OK" : "FAIL");
            System.out.printf("%.2f\n", reg1.getTotal());
            System.out.println((reg1.getTotal()==4.94)?"OK":"FAIL");*/



        CashRegister reg3=new CashRegister();
        System.out.println("reg 3 just created, totalPrice is automatically reset to "+reg3.getTotal());
        System.out.println(reg1.getTotal()+ " is still the total and item count from reg1");
        System.out.println("please enter the price on the item");
        price=scan1.nextDouble();
        reg3.addItem(price);
        System.out.println("please enter the price on the item");
        price=scan1.nextDouble();
        reg3.addItem(price);
        System.out.println("Total cost is " + reg3.getTotal() + " and number of items bought is " + reg3.getCount() );
        reg1.clear();
        System.out.println(reg1.getTotal()  + " now reg1 is cleared "+ reg1.getCount());
        System.out.printf("%.2f\n", reg3.getTotal() );
        System.out.println(  reg3.getCount()+" is still the total and item count from reg3 ");


    }
    public static void Reg2( )
    {
        CashRegister reg2 = new CashRegister();
        Scanner scan3 =new Scanner(System.in);
        System.out.println("Please enter the price on the item, press 0 to end");
        double price=scan3.nextDouble();
        reg2.addItem(price);
        while (price!=0)
        {System.out.println("Please enter the price on the item, press 0 to end");
            price=scan3.nextDouble();
            reg2.addItem(price);
        }
        System.out.println("Total cost is " + reg2.getTotal() + " and number of items bought is " + reg2.getCount() );
        //double price=
        //}
    }
}