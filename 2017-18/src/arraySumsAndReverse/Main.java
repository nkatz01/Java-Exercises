package arraySumsAndReverse;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        final int SIZE =5;
        int[] anArray = new int[SIZE];
        int arraySum_=0;
        Scanner scan = new Scanner(System.in);
        int input, result, alternateSum;
        for (int i=0; i<anArray.length; i++){
            System.out.print("Please enter integer " + (i+1)+":");
            input=scan.nextInt();
            anArray[i]=input;
        }//for ends
        String message="The values you have entered are ";
        printArrayElements(message, anArray);

        arraySum_=arraySum(anArray);
        final int SIZE_2 =1;
        int[] Sum = new int[SIZE_2];
        Sum[0]=arraySum_;
        message="The sum of the values you have entered is ";
        printArrayElements(message,Sum);

        message="The sum of the values in the odd indexes, minus the sum of those in the even indexes is ";
        Sum[0]=altSum(anArray);//reusing the array Sum and overriding what was stored there i.e. the sum of all inputs.
        printArrayElements(message,Sum);

        message="The values you have entered, in reverse order are";
        anArray=reverseArray(anArray);
        printArrayElements(message,anArray);

    }//first method(main) ends


    public static void printArrayElements(String message, int[] arrayToPrint){
        if (arrayToPrint.length>1){
            System.out.println(message + " "+ Arrays.toString(arrayToPrint));}
        else
            System.out.println(message + " "+ arrayToPrint[0]);

    }//second method ends

    public static int arraySum(int[] incomingArray)
    {
        int total=0;

        int l= incomingArray.length;
        if (l>0)
            for (int i=0; i<incomingArray.length; i++){
                total=total+incomingArray[i];
            }

        return total;

    }//third method ends

    public static int altSum(int[] incomingArray){
        int evenTotal=0;
        int oddTotal=0;
        int l= incomingArray.length;
        if (l>=2){
            for (int i=1; i<=incomingArray.length; i+=2){
                if (i<incomingArray.length){
                    evenTotal=evenTotal+incomingArray[i];
                    oddTotal=oddTotal+incomingArray[i-1];}
                else{oddTotal=oddTotal+incomingArray[i-1];}
            }

        }
        else if (l<2)
            oddTotal=incomingArray[0];
        return oddTotal-evenTotal;//for ends

    }//forth method ends

    public static int[] reverseArray(int[] data){
        int[] arrayReversed = new int[data.length];
        int i=data.length-1;
        for(int c=0; c<data.length; c++){
            arrayReversed[c]= data[i];
            i--;
        }
        return arrayReversed;
    }//fifth method ends


}//class ends