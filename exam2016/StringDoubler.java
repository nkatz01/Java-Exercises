package exam2016;
import java.util.ArrayList; 
/**
 * Write a description of class StringDoubler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringDoubler implements Transformer<String, String>
{
     public String transform(String item){
         String res = ""; 
         if(item==null)
         return null; 
         res= item+item; 
         return res; 
        }
 
}
