package genericTypes;

import java.util.Arrays;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("kayin", 1);
        Pair<String, Integer> pair2 = new Pair<String, Integer>("hevel", 2);
        Pair<String, Integer> pair3 = new Pair<String, Integer>(pair2);

        System.out.println(pair.getTcomponent());
        System.out.println(pair.getGcomponent());

        System.out.println(pair.toString());
        System.out.println(pair3.toString());

        Pair<Integer, String> np = pair.swap();
        Pair<Integer, String> np1 = pair3.swap();

        System.out.println(np.toString());
        System.out.println(np1.toString());

        // MyList list1 = new MyList()

        ArrayList<Number> arrlist = new ArrayList<Number>();
        arrlist.add(24);
        arrlist.add(26);
        System.out.println(returnSum(arrlist));

        String word = "abcdefg";
        System.out.println(Reverse(word));
        System.out.println(computeAtoPowN(7, 7));
    }

    public static int computeAtoPowN(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int results = computeAtoPowN(a, n / 2);
        if (n % 2 != 0) {
            return a * results * results;
        } else {
            return results * results;
        }
    }

    /*
     * public static Appendable returnAppended( Appendable firstObj, Appendable
     * secObj) { return firstObj.append(secObj); }
     */

    public static double returnSum(ArrayList<Number> arraylist) {
        double sum = 0;
        for (Number item : arraylist)
            sum += item.doubleValue();
        return sum;
    }

    public static String Reverse(String str) {
        // String first;
        // String rest;
        // String reversed;
        if (!(str.length() <= 1)) {
            // first = str.substring(0,1);
            // rest = str.substring(1);
            // reversed = Reverse(rest);
            // reversed = reversed+first;
            return Reverse(str.substring(1)) + str.substring(0, 1);// call function with smaller problem; at the end return
            // returned value from second copy + string in first
            // position from caller
            // reversed;
        } else {
            // known basic case
            return str.substring(0);

        }

    }

}