package exam2018;

 
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
   
    
 public static void main(String[] args){
     Testing test = new Testing(); 
    test.testNegative();
    } 
    // instance variables - replace the example below with your own
  /**
* Computes the factorial of n for non-negative n.
* Throws an IllegalArgumentException for negative n.
*
* @param n an int value for which we want to compute
* the factorial, should be greater than or equal to 0
* @return factorial of n
* @throws IllegalArgumentException if n is less than 0
*/
public static long factorial(int n) {
if (n < 0) {
String msg = "Illegal negative argument " + n;
throw new IllegalArgumentException(msg);
}
if (n == 0) {
return 1;
}
return n * factorial(n-1);
}
}
