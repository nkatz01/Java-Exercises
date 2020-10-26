package oysterCard;

public class Main{
    String newcard;
    private double balance;
    private  double dailyCharges;
    private  int lasttime=-60;
    private int lastdate=0;


    public Main(String card){
        newcard=card;
        balance=0.0;
    }
    public String getCard()
    {
        return newcard;
    }

    public double getBalance(){
        return balance;
    }
    public boolean topUp(double amount){
        if (amount<0)
            return false;
        else {
            balance+=amount;
            return true; }
    }
    public boolean touch(int date, int time){
        if ((dailyCharges>=4.50 && date-lastdate==0) || (Math.abs(time-lasttime)<60 && date-lastdate==0))//same day but over max charge or within hour
            return true;
        else if (date-lastdate==0) {//same day but under max and not enough money
            if (balance<1.50)
                return false;
            else{//same day, under max and enough money
                balance-=1.50;
                lasttime=time;
                dailyCharges+=1.50;
                return true;
            }
        }
        else  {//not same day
            if (balance<1.50) //and not enough money
                return false;
            else {//enough money
                balance-=1.50;
                lasttime=time;
                dailyCharges=1.50;
                lastdate=date;
                return true;

            }
        }
    }
    public static void main(String[] args){
        Main t1 = new Main("1234");
        //first time and not enough money
        System.out.println(t1.touch(3,5));
        System.out.println(t1.getBalance());
//same day but over max charge or within hour
        System.out.println(t1.topUp(4.5));
        System.out.println(t1.touch(3,5));
        System.out.println(t1.touch(3,5));
        System.out.println(t1.touch(3,5));
        System.out.println(t1.touch(3,5));
        System.out.println(t1.getBalance());
        //same day, not withing hour but over max charge
        System.out.println(t1.touch(3,66));
        System.out.println(t1.touch(3,132));
        System.out.println(t1.touch(3,500));
        System.out.println(t1.getBalance());
        //new day
        System.out.println(t1.touch(4,1));
        System.out.println(t1.getBalance());
        Main t2 = new Main("2345");
        System.out.println(t2.topUp(3));
        System.out.println(t2.touch(3,132));
        System.out.println(t2.touch(3,500));
        System.out.println(t2.touch(3,561));
        System.out.println(t2.getBalance());
//topup exatly and try again
        System.out.println(t2.topUp(1.5));
        System.out.println(t2.touch(3,561));
        System.out.println(t2.getBalance());
//top up, use up for 1 day and leave enough for next day to reset daylicharges and start afreash
        System.out.println(t2.topUp(6.0));
        System.out.println(t2.touch(4,132));
        System.out.println(t2.touch(4,500));
        System.out.println(t2.touch(4,561));
        System.out.println(t2.getBalance());

        System.out.println(t2.touch(5,561));
        System.out.println(t2.getBalance());
        t1.balance=4.0;
        System.out.println(t1.getBalance());







    }

}