package largestDiff;

import java.util.Arrays;
class Main {

    public static void main(String[] args)
    {
        final int SIZE =5;
        int[] arr = new  int[SIZE];
        arr[0]=-25;
        arr[1]=-80;
        arr[2]=-20;
        arr[3]=-60;
        arr[4]=-60;
        largestDiff(arr);

        int [] array =  { 0, 1, -2, 4,7 };
        System.out.print(largestDifference(array));
    }

    public static void largestDiff(int[] arr)
    {
        int higherstDiff;
        int i=arr.length-1;
        higherstDiff=Math.abs(arr[i-1]-arr[i]);
        if (arr.length>2)
        {
            for(int j=1; j<(arr.length-1); j++)
            {
                higherstDiff=(Math.abs(arr[i-2]-arr[i-1])>higherstDiff)?Math.abs(arr[i-2]-arr[i-1]): higherstDiff;
                i--;
            }
            System.out.println(Math.abs(higherstDiff));
        }


        else
            System.out.println(Math.abs(higherstDiff));
    }

    public static int largestDifference(int[] v) {
        int largestDiff = 0;
        largestDiff = Math.abs(v[0] - v[1]);
        for (int i = 0; i < v.length - 1; i++) {
            if (Math.abs(v[i] - v[i + 1]) > largestDiff)
                largestDiff = Math.abs(v[i] - v[i + 1]);
        }
        return largestDiff;
    }

}