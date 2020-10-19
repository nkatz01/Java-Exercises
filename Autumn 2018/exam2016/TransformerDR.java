package exam2016;
import java.util.List; 
import java.util.Arrays;

/**
 * Write a description of class TransformerDR here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransformerDR
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    StringDoubler sd = new StringDoubler(); 
    
    System.out.println(sd.transform("abc")); 
      
     System.out.println(Transformer.transformList(sd, Arrays.asList("abc", "def", "ghi"))); 
    }
}
