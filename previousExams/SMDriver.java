package previousExams;


/**
 * Write a description of class SMDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SMDriver
{
   

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void   main(String[] args)
    {
        // put your code here
     StringMultiplier  sm = new  StringMultiplier(); 
       System.out.println(sm.combine("bc", 0));
     System.out.println(sm.combine("bc", 3));
    
     //  System.out.println(sm.combine("bc", -1));
    // System.out.println(sm.combine("bc", null));
      System.out.println(sm.combine(null, 3));
    }
}
