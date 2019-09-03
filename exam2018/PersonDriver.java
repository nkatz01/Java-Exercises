package exam2018;


/**
 * Write a description of class PersonDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonDriver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PersonDriver
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        Person jim = new Person("jim"); 
        Person jim2 = new Person("jim");
        Person jimNull = null; 
        Person jimNameNull = new Person(null); 
        Person mark = new Person("mark"); 
        Angel matatron = new Angel(); 
        System.out.println(""); 
        System.out.println(jim2.equals(mark)); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
     
}
