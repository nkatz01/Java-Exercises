package rotateValuesInArr;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        double[] x = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]" + " is " + x[i]);
        }
        System.out.println();

        for (int i = (x.length - 1); i >= 0; i--) {
            System.out.println("x[" + i + "]" + " is " + x[i]);
        }
        System.out.println();
        for (double i : x) {
            System.out.print(i + "   ");
        }
        System.out.println();
        System.out.println(Arrays.toString(rotateValues(x, 3)));

    }

    public static double[] rotateValues(double[] arr, int n) {

        double[] z = Arrays.copyOf(arr, arr.length);
        if (n > arr.length)
            return z;
        double[] y = new double[arr.length];
        int difference = ((arr.length) - n);
        int startingIndex = arr.length - difference;
        int q = 0;
        for (int i = (startingIndex + 1); i < y.length; i++) {
            y[i] = arr[q];
            q++;
        }
        for (int i = 0; i <= startingIndex; i++) {
            y[i] = arr[q];
            q++;
        }

        return y;

    }

}

