package fibbonacci;

import java.util.Scanner;

public class Main //Fibonacci


{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the nth fibonacci number >0 in the squence that you're interested in? : ");

        int nthFibonacci= keyboard.nextInt();

        if (nthFibonacci==0)
        {
            System.out.print("Sorry, 0 isn't accepted");
            return;}
        else {
            System.out.println("The "+ nthFibonacci+"nt fibonacci number is "+ (fibonacci(nthFibonacci)));

        }

    }

    public static int fibonacci (int _nthFibonacci){
        int _results=0;
        if (_nthFibonacci<=2)
            return 1;
        else {
            int fn1=1;
            int fn2=1;
            for (int i=1; i<=_nthFibonacci-2; i++) {
                _results=fn1+fn2;
                fn2=fn1;
                fn1=_results;

            }
            return _results;


        }

    }
}

