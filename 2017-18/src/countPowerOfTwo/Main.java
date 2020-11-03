package countPowerOfTwo;

import java.util.Scanner;
/**
 Program to compute the first integral power to which 2 can be
 raised that is greater than that multiple of a given integer.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number, 0 to quit: ");
        int n = in.nextInt();
        int i = 1;
        for (int j=n*n; j>Math.pow(2, i); i++){

        }
//while (n * n > Math.pow(2, i))
//i++;
        System.out.println("2 raised to " + i
                + " is the first power of two greater than " + n + " squared");
    }
}