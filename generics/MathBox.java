package generics;

import java.math.BigInteger;
import java.util.*;

public class MathBox<T extends Number> {
    private T data;

    public MathBox(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public String toString() {
        return "" + this.data;
    }
    
    public double sqrt() {
        double d = this.data.doubleValue();
        return Math.sqrt(d);
    }

    public static ArrayList<Double> listOfSqrts(ArrayList<? extends Number> list) {
        ArrayList<Double> result = new ArrayList<>();
        for (Number x : list) {
            result.add(Math.sqrt(x.doubleValue()));
        }
        return result;
    }
    
    public static void main(String[] args) {
        /*
        MathBox<String> box = new MathBox<String>("SP2");
        String s = box.getData();
        System.out.println(s);
        */

        MathBox<BigInteger> bBox = new MathBox<BigInteger>(BigInteger.valueOf(100));
        BigInteger b = bBox.getData();
        System.out.println("sqrt of " + b + " is " + bBox.sqrt());

        MathBox<Integer> iBox = new MathBox<Integer>(64);
        Integer i = iBox.getData();
        System.out.println("sqrt of " + i + " is " + iBox.sqrt());

        /*
        MathBox<Integer> iBox2 = new MathBox<Integer>(null);
        System.out.println(iBox2);
        */
    }
}
