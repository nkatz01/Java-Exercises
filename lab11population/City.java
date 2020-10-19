package population;
import java.util.ArrayList; 

/**
 * Write a description of class City here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class City
{
    // instance variables - replace the example below with your own
   // private int population;
    private static ArrayList<Person> persons = new ArrayList<Person>() ; 

    /**
     * Constructor for objects of class City
     */
    public City()
    {
       
         
    }
    
      
    
    public static void addPerson(Person person){
       persons.add(person);
    }
    
   public static int getPopulationViaPerson(){
      return  persons.get(0).getStaticPopulation();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int getPopulation()
    {
        // put your code here
        return persons.size();
    }
}
