 package rollingstock;
import java.util.ArrayList;

 
public class RollRailStockDriver
{
     
    public static void main(String[] args)
    {
     ElecLocomotive eletctricLocomotive = new ElecLocomotive(1000,5000, 5000000 );//trackspacing, kw, voltage
     SteamLocomotive steamlocomotive = new SteamLocomotive(800, 4500, 1.5); //trackspacing, kw, power in pascal units
     Carriage carriage1 = new Carriage(800, 10); //2nd param no of seats
     Carriage carriage2 = new Carriage(800, 20); 
     
     Carriage carriage3 = new Carriage(1000, 10); //2nd param no of seats
      
     
     ArrayList<Carriage> twoCarriages = new ArrayList<Carriage>();
     twoCarriages.add(carriage1);
     twoCarriages.add(carriage2);
     Train train1 = new Train(steamlocomotive,twoCarriages ); 
     
     ArrayList<Carriage> oneCarriages = new ArrayList<Carriage>();
     twoCarriages.add(carriage3);
    Train train2 = new Train(eletctricLocomotive,oneCarriages );  
    
    System.out.println(train1.getTrackGauge() +", "+ train1.getKW());
    System.out.println(train2.getTrackGauge() +","+ train2.getKW());
    }

   
}
