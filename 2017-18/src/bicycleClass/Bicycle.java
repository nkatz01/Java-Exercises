package bicycleClass;

import java.util.concurrent.ThreadLocalRandom;
public class Bicycle
{
    //instance variables
    private int ID;
    private int dockingStationID;

    //class variable
    public static int lastAssignedNumber=100;

    //instance methods
    public int getID()
    {
        return ID;
    }

    public boolean pickup()
    {
        if (dockingStationID!=0)
        {
            dockingStationID=0;
            return true;
        }
        else
            return false;
    }

    public boolean park(int dockSID)
    {
        if (dockingStationID==0)
        {
            dockingStationID=dockSID;
            return true;
        }
        else
            return false;
    }
    public String getDockingStationNo()
    {
        if (dockingStationID==0 )
            return " is in use (docking station set at 0)";
        else
            return " is at " + dockingStationID;
    }

    public static int getNumberOfBicycles()
    {
        return lastAssignedNumber-100;
    }

    public static int getRandomNumber(){

        int rand = ThreadLocalRandom.current().nextInt( 0  ,   10 + 1);

        return rand ;
    }

    //Constructor
    public Bicycle()
    {
        this.ID=lastAssignedNumber+1;
        this.dockingStationID=0;
        lastAssignedNumber++;


    }
}//end of class Bicycle