package rollingstock;


/**
 * Write a description of class Carriage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Carriage extends RailVehicle  implements RollRailStock
{
    // instance variables - replace the example below with your own
   private int numOfSeats;

    /**
     * Constructor for objects of class Carriage
     */
    public Carriage(int trackGauge, int numOfSeats)
    {
        // initialise instance variables
        super(trackGauge);
       this.numOfSeats=numOfSeats;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumOfSeats()
    {
        // put your code here
        return numOfSeats;
    }
}
