package rollingstock;


/**
 * Abstract class Locomotive - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Locomotive<T extends RollRailStock>  extends PoweredRollRailStock
{
    // instance variables - replace the example below with your own
     
    private int KW; 
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public  Locomotive(int trackGauge, int KW)
    {
        // put your code here
       super(trackGauge, KW); 
       
    }
    
    
}
