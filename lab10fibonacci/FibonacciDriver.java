package fibonacci;


/**
 * Write a description of class FibonacciDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibonacciDriver
{
   
    public static void main(String[] args) {
    final int N = 46; // makes the method take a while on my machine
    long fibN = Fibonacci.fib(N);
    System.out.println("fib(" + N + ") = " + fibN);
    }
}
