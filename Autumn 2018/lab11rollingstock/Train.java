package rollingstock;
import java.util.ArrayList; 

/**
 * Write a description of class Train here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Train  implements RollRailStock
{
    // instance variables - replace the example below with your own
    private Locomotive locomotive; 
    private ArrayList<Carriage> carriages; 
    /**
     * Constructor for objects of class Train
     */
    public Train(Locomotive locomotive, ArrayList carriages )
    {
        // initialise instance variables
         
       this.locomotive=locomotive; 
       this.carriages=carriages; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Locomotive getLocomotive(int y)
    {
        // put your code here
        return locomotive;
    }
    
    public ArrayList<Carriage> getCarriages(int y)
    {
        // put your code here
        return carriages;
    }
    
    public int getTrackGauge(){
    return locomotive.getTrackGauge();
    }
    
    public int getKW(){
         return locomotive.getKW();
    }
}
