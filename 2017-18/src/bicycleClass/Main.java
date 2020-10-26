package bicycleClass;

import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        ;
        //cration of first object
        Bicycle bicycle1 = new Bicycle();
        System.out.print("Enter docking No for bicycle 1: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        //passess docking station the user entered to park method
        bicycle1.park(input);
        //System.out.println(Bicycle.lastAssignedNumber);

        //cration of object 2
        Bicycle bicycle2 = new Bicycle();
        System.out.print("Enter docking No for bicycle 2: ");
        input = in.nextInt();
        bicycle2.park(input);
        //cration of object 2
        // boolean equ = bicycle1.equals( bicycle1);
//System.out.println(equ);
        Bicycle bicycle3 = new Bicycle();
        System.out.print("Enter docking No for bicycle 3: ");
        input = in.nextInt();
        bicycle3.park(input);
        System.out.println();
        System.out.println("Bicycle with ID: "+ bicycle1.getID() + bicycle1.getDockingStationNo());
        System.out.println("Bicycle with ID: "+ bicycle2.getID() + bicycle2.getDockingStationNo());
        System.out.println("Bicycle with ID: "+ bicycle3.getID() + bicycle3.getDockingStationNo());
        System.out.println();
        //call to get number of instances
        System.out.println("The number of bicycles currently in the system is "+ Bicycle.getNumberOfBicycles());

        //call pickup() and park()
        System.out.println();
        System.out.println("The program wil now attempt to hire bikes "+ bicycle1.getID()+","+bicycle2.getID()+","+bicycle3.getID());
        System.out.println();
        System.out.println(bicycle1.pickup()==true?"Bicycle with ID: "+bicycle1.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle1.getID()+ " is not available (already hired).");

        System.out.println(bicycle2.getDockingStationNo()!=" is in use (docking station set at 0)"?"Bicycle with ID: "+bicycle2.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle2.getID()+ " is not available (already hired).");
        bicycle2.pickup();
        //alternative for bicycle2
        /*System.out.println(bicycle2.park(input)==true?"Bicycle with ID: "+bicycle2.getID()+ " is not available (already hired).":
        "Bicycle with ID: "+bicycle2.getID()+ " is successfully hired.");
        bicycle2.pickup();*/

        //checks whether they're indeed in use
        System.out.println(bicycle3.park(input)==false?"Bicycle with ID: "+bicycle3.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle3.getID()+ " is not available (already hired).");
        bicycle3.pickup();
        /*System.out.println();
        System.out.println("Bicycle with ID: "+ bicycle1.getID() + bicycle1.getDockingStationNo());
        System.out.println("Bicycle with ID: "+ bicycle2.getID() + bicycle2.getDockingStationNo());
        System.out.println("Bicycle with ID: "+ bicycle3.getID() + bicycle3.getDockingStationNo());
        System.out.println();*/


        //program randomly assignes docking stations
        int random = Bicycle.getRandomNumber();
        System.out.println(random);
        bicycle1.park(random);
        random = Bicycle.getRandomNumber();
        System.out.println(random);
        bicycle2.park(random);
        random = Bicycle.getRandomNumber();
        System.out.println(random);
        bicycle3.park(random);
        System.out.println("Bicycle with ID: "+bicycle1.getID()+ bicycle1.getDockingStationNo());
        System.out.println("Bicycle with ID: "+bicycle2.getID()+ bicycle2.getDockingStationNo());
        System.out.println("Bicycle with ID: "+bicycle3.getID()+ bicycle3.getDockingStationNo());



        System.out.println(bicycle1.pickup()==true?"Bicycle with ID: "+bicycle1.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle1.getID()+ " is not available (already hired).");
        System.out.println(bicycle2.pickup()==true?"Bicycle with ID: "+bicycle2.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle2.getID()+ " is not available (already hired).");
        System.out.println(bicycle3.pickup()==true?"Bicycle with ID: "+bicycle3.getID()+ " is successfully hired.":
                "Bicycle with ID: "+bicycle3.getID()+ " is not available (already hired).");






    }
}



