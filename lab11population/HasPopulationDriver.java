package population;


/**
 * Write a description of class HasPopulationDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HasPopulationDriver
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
    Person pers1 = new Person(20, "shimi"); 
    Person pers2 = new Person(24, "yossi"); 
    City city = new City(); 
    System.out.println(City.getPopulation());
    System.out.println(City.getPopulationViaPerson());
    }
}
