package messages;


/**
 * Write a description of interface HasFee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface HasFee
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
       
    
    public default double calcFee(){
   return 1.50;
    };
}
