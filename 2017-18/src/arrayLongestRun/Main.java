package arrayLongestRun;

public class Main {
    public static int getLongersRunLength(int [] v){
        int longestrun=1;
        int consec=1;
        int i=0;

        while (i < v.length-1){
            if (v[i]==v[i+1])
                consec++;
            else{
                if (consec>longestrun){
                    longestrun=consec;}
                consec=1;}
            i++;
        }
        if (consec>longestrun)
            return consec;
        else
            return longestrun;

    }

    public static void main(String[] args) {
        int[] array = {1, 1, 5, 6, 3, 1, 2, 4, 3, 2, 5, 2, 5, 3, 9,3, 6, 2, 3};
        System.out.println(getLongersRunLength(array));
    }

}

