package exam2016;
import java.util.ArrayList; 
import java.util.Arrays ; 
/**
 * Write a description of class NoWhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NoWhile
{
   public static void printFor(ArrayList<?> list) {
if (list != null) {
 int i = list.size(); 
 while (i>0){
System.out.println( list.get(i-1) );
i--; 
}
}

}
    // instance variables - replace the example below with your own
   public static void main(String[] args){
    printFor(new ArrayList<String>(Arrays.asList("shimi", "yanky", "dudy"))); 
    }
}
