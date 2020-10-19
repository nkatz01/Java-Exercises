package fibonacci;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FibTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FibTest
{
    private static final int TIMEOUT = 600000;
    private static final int SHORTTIMEOUT = 1000;

    /**
     * Default constructor for test class FibTest
     */
    
    public FibTest()
    {
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegative(){
        final int N = -1; // makes the method take a while on my machine
            long fibN = Fibonacci.fib(N);
            
        
    }
    
      @Test(timeout = TIMEOUT)
      public void testFibLOong() {  
        final int N = 46; // makes the method take a while on my machine
            long fibN = Fibonacci.fib(N);
            
        }
    
       @Test(timeout = SHORTTIMEOUT)
      public void testFibshort(
      
      ) {  final int N = 46; // makes the method take a while on my machine
            long fibN = Fibonacci.fib(N);
            }
            
       @Test 
      public void test0() {  
        final int N = 0; // makes the method take a while on my machine
            long fibN = Fibonacci.fib(N);
             assertEquals(0, fibN) ;
        }
       @Test 
      public void test1() {  
        final int N = 1; // makes the method take a while on my machine
            long fibN = Fibonacci.fib(N);
            assertEquals(1, fibN);  }
   
}
