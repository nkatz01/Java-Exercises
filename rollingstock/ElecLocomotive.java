package rollingstock;


/**
 * Write a description of class ElecLocomotive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElecLocomotive extends Locomotive 
{
    // instance variables - replace the example below with your own
    private long volts;

    /**
     * Constructor for objects of class ElecLocomotive
     */
    public ElecLocomotive(int trackGauge, int KW, long volts)
    {
        // initialise instance variables
        super(trackGauge, KW); 
        this.volts=volts; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public long getVoltage()
    {
        // put your code here
        return  this.volts;
    }
}
