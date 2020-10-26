package intSeqNumProperties;

import java.util.Scanner;
class Main { //IntSequence
    public static void  main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first integer or press 0 to terminate");

        int number = scan.nextInt();
        double total=number;//recording sum
        int count=1;//is going to count inputs to later calculate avarage
        int highest=number;
        int lowest=number;

        if (number!=0){
            while (number!=0){
                System.out.println("Enter integer " +count+ " or press 0 to terminate");//taking second number
                number = scan.nextInt();
                if (number!=0){
                    count=count+1;
                    total=total+number;
                    if (number>highest)
                    { highest=number;}
                    else if (number<lowest)
                    {lowest=number;}}
            }  //while closing
            System.out.println("You've indicated that you finished your input and are ready for results.");
            double avarage=total/count;
            int range=highest-lowest;
            System.out.println("The smallest value entered was " + lowest);
            System.out.println("The largest value entered was " + highest);
            System.out.println("The range of the values entered was " + range);
            System.out.println("The sum of the values entered was " + total);
            System.out.println("The number of values entered was " + count);
            System.out.printf("The avarage of the values entered was %.1f\n", avarage);

        }//first if closing

        else //is communicating with user that it hadn't entered the while at all
        {System.out.println("You've ordered the program to terminate. 'Good bye'");}
    }//method closing


}