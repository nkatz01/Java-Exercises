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
        
        
        
         
        
        Employee berl2 = new Employee("berl", 16000);
        Employee berl3 = new Employee("berl", 16000);       
        Employee berl7 = new Employee(null, 16000);
        Employee berl8 = new Employee(null, 16000);
       
        Employee berl9 = new Employee("berl", 16000);
        Employee berl10 = new Employee("mark", 16000);
        
      Employee berl = new Employee(null, 14000);   
      Employee berl4 = new Employee(null, 16000);
      
      Employee berl6 = new Employee(null, 14000);
      Employee berl1 = new Employee("berl", 14000);
      
     
      
        Employee betzalel = null; 
        System.out.println(""); 
       // System.out.println(jim2.equals(mark)); 
        System.out.println(berl10.equals(mark)); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
     
}
