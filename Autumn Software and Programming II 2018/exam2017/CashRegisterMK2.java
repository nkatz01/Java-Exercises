package previousExams;
import java.util.ArrayList; 
import java.util.Iterator; 
/**
 * Write a description of class CashRegisterMK2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashRegisterMK2
{
    // instance variables - replace the example below with your own
    private ArrayList<Double> items;

    /**
     * Constructor for objects of class CashRegisterMK2
     */
    public CashRegisterMK2()
    {
        // initialise instance variables
        items = new ArrayList<Double>();
    }
    
    public void addItem(double price){
        items.add(price);
    }
    
    public void clear(){
       
           Iterator<Double> iter = items.iterator(); 
           while (iter.hasNext()){
            iter.next();
            iter.remove(); }
        
    }
    
     public void clear2(){
       
          items = new ArrayList<Double>();
        
    }
    
    public double getTotal(){
        double price=0;
        for(Double item: items){
            price+=item; 
        }
        return price; 
    }
    
    public int getCount(){
    return items.size(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
