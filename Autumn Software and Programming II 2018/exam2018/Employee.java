package exam2018;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    // instance variables - replace the example below with your own
    private int salary;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String name, int salary)
    {
        // initialise instance variables
        super(name);
       this.salary=salary;
    }

     @Override
    public boolean equals(Object obj)
    {
        if (!super.equals(obj))
        return false; 
        else if (!(obj instanceof Employee))
            return false;
         
        Employee emp = (Employee)obj; 
         
        
            if (emp.salary==this.salary)
            return true;
            else 
            return false; 
         
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}
