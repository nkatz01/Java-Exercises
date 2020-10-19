package population;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    private final int POPULATION =1;
    private static int population; 
    /**
     * Constructor for objects of class Person
     */
    public Person(int age, String name)
    {
        this.age=age;
        this.name=name; 
        this.population++;
        City city = new City(); 
        city.addPerson(this);
      
    }
    public static int getStaticPopulation(){
        return population; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  public  int getPopulation()
    {
       return POPULATION;
         
    }
}
