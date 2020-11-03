package exam2018;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Person
     */
  public Person(String name){
    this.name = name; }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public boolean equals(Object obj)
    {
        if (obj==null)
        return false; 
        else if (!(obj instanceof Person))
            return false;
         
        Person p = (Person)obj; 
        if (p.name==null)
            return p.name==this.name; 
        else{
            if (p.name==this.name)
            return true;
            else 
            return false; 
        }
        
    }
}
