package rollingstock;


/**
 * Abstract class RollRailStock - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class RollRailStock
{
    // instance variables - replace the example below with your own
    
    private int trackGauge;
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */   
    
    public RollRailStock(int trackGauge){
    this.trackGauge = trackGauge; 
    }
    public int getTrackGauge()
    {
        // put your code here
        return trackGauge;
    }
}
