package fibonacci;


/**
* Class with a static method to compute the n-th Fibonacci number fib(n)
* for n >= 0 according to the definition
*
* fib(0) = 0
* fib(1) = 1
* fib(n) = fib(n-1) + fib(n-2) for n >= 2
*/
 public class Fibonacci {
/**
* Straightforward recursive implementation for the n-th Fibonacci number.
*
* @param n expected to be non-negative
* @return the value of the n-th Fibonacci number fib(n)
* @throws IllegalArgumentException if n < 0
*/
public static long fib(int n) {
if (n < 0) {
throw new IllegalArgumentException("Illegal negative value " + n);
}
if (n == 0) {
return 0;
}
if (n == 1) {
return 1;
}
return fib(n-1) + fib(n-2);
}



}