package previousExams;


/**
 * Write a description of class StringMultiplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMultiplier  implements  Combiner<String, Integer, String>
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class StringMultiplier
    
    public  StringMultiplier(String s)
    {
        // initialise instance variables
       this.s=s;
    } */

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String combine(String w, Integer n)
    {   
        String s=""; 
      if ((w==null || n==null)|| n<0)
          throw new IllegalArgumentException();
          else {
              if (n==0){
         
        return s; 
        }
        
        else {
        while (n>0){
        s+=w;
        n--;
        }
         
       
        return s; 
       } 
    }
}

}
