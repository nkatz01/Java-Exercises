package unparidElementInArr;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.function.Function;

import java.util.*;
import java.util.List;

class Main {
    public static int solution(int[] A) {
        Arrays.sort(A);
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int n = 0; n < A.length; n++) {
            if (A[n] % 2 == 0) {
                B.add(A[n]);
                continue;

            }
            if (findIndex(A, A[n]) != n)
                // System.out.println(findIndex(A, n))
                B.add(A[n]);
        }
        int val = 0;
        for (int i : A) {

            if (!B.contains(i))
                val = i;

        }
        return val;
    }

    public static int findIndex(int arr[], int t) {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 3, 5, 6, 0, 6, 3 };
        //  System.out.println(Main.solution(arr));
        System.out.println(Main.solution1(arr)) ;
    }

    public static int solution1(int[] A) {
        A = Arrays.stream(A).filter(x -> x % 2 != 0).toArray();
        List<Integer> AL = Arrays.stream(A).boxed().collect(Collectors.toList());

        Map<Integer, Long> BL = AL.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Integer result = 0;
        for (Map.Entry<Integer, Long> entry : BL.entrySet()) {
            if (Long.valueOf(1).equals(entry.getValue())) {
                result = entry.getKey();
            }
        }

        return result;
    }
}