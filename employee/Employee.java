package employee;
import java.util.ArrayList; 

/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    // instance variables - replace the example below with your own
    private String name;
    private Employee lineManager;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name,  Employee lineManager)
    {
        // initialise instance variables
        this.name=name; 
        this.lineManager=lineManager;
    }
     public Employee(String name)
    {
        // initialise instance variables
        this(name, null);
    }
    public Employee getLineManager(){
      //  System.out.println(this.lineManager==null);
    return this.lineManager;
    }       

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String toString()
    {
        // put your code here
         return this.name; 
    }
    
     public Employee getCEO(){
        if (this.getLineManager()==null){
        Employee CE0 = new Employee(this.toString()); 
        return CE0;
    }
      else 
         return getLineManager().getCEO();
         
    } 
    
    public Employee getCEOLoop(){
        while (this.getLineManager()!=null){
            return getLineManager().getCEOLoop();
        } 
         Employee CE0 = new Employee(this.toString());
        return CE0;
        
    }
    
    public ArrayList<Employee> getCommandChain(){
         ArrayList<Employee> commandChainArrList = new  ArrayList<Employee>(); 
        return fillCommandChain(commandChainArrList);
        
    }
    public ArrayList<Employee> fillCommandChain(ArrayList<Employee> chain){
        chain.add(this);
        if (this.getLineManager()!=null){
            
           this.getLineManager().fillCommandChain(chain);
        }
           
               return chain;         
        }
        
        
     
    }
    

