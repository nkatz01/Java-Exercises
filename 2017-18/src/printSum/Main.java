package printSum;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        do {
            System.out.print("Please enter a number, 0 to quit: ");
            n = in.nextInt();
            if (n != 0) {
                sum = sum + n;
                System.out.println("Sum = " + sum);
            }

        } while (n!=0) ;


    }
}