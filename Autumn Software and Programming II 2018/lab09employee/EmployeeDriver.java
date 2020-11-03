package employee;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeDriver
{
    
    public static void main(String[] args){
    
     Employee erica = new Employee("Erica"); 
     Employee derek = new Employee("Derek", erica);
     Employee celia = new Employee("Celia", derek); 
     Employee barry = new Employee("Barry", celia);
   
 
      
     // System.out.println(barry.getCEO());
     // System.out.println(barry.getCEOLoop());
     //System.out.println(barry.getCommandChain());
     System.out.println(barry.getCommandChainLoopSol());
    }
}
