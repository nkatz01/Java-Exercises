package rollingstock;


/**
 * Write a description of class SteamLocomotive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SteamLocomotive extends Locomotive
{
    // instance variables - replace the example below with your own
    private float pascalPower;

    /**
     * Constructor for objects of class SteamLocomotive
     */
    
     public SteamLocomotive(int trackGauge ,int KW, float pascalPower)
    {
        // initialise instance variables
        super(trackGauge, KW); 
        this.pascalPower=pascalPower; 
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public float getPower()
    {
        // put your code here
        return  this.pascalPower;
    }
}
