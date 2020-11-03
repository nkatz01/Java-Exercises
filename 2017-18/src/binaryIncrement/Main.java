package binaryIncrement;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int A[] = new int[3];


        A[0] = 0;
        A[1] = 1;
        A[2] = 1;
        int i = A.length - 1;
        while (i >= 0) {//starts counting from end of array backwards
            if ((A[i] != 1)) {//as soon as it finds a cell !=1, it overrides it with 1.
                A[i] = 1;
                break;
            }
            i--;//  decreases counter
        }
        i++; //i increases in order to move rewind 1 cell back.
        while (i <= A.length - 1) {
            A[i] = 0; //overrids all the cells it had passed until the end of the array in order to increase binary no only by 1
            i++;
        }

        System.out.println(Arrays.toString(A));

    }

}
