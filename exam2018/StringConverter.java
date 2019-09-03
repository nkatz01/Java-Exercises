package exam2018;
import java.util.ArrayList; 


/**
 * Write a description of class StringConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringConverter implements Converter<String,Integer>
{
    // instance variables - replace the example below with your own
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public Integer convert(String word){
    if (word==null)
    throw new IllegalArgumentException("wrong argument"); 
    return word.length(); 
    
    }
}
