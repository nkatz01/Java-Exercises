package exam2018;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
 import org.junit.Test;

/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    /**
     * Default constructor for test class Test
     */
  

      @Test (timeout = 2000, expected  = IllegalArgumentException.class)
    public     void testNegative(){
    Factorial fc = new Factorial();
    int i =-1; 
    long res = fc.factorial(i); 
    }
    
    @Test (timeout = 2000)
    public void testOne(){
     Factorial fc = new Factorial();
    int i = 1; 
     long res = fc.factorial(i); 
     assert(res==1);
    }
    
    @Test (timeout=2000)
    public void testFunction(){
     Factorial fc = new Factorial();
    int i = 3;
    long res = fc.factorial(i); 
      assert(res==6);
    }
}
