package twoArrDiff;

class Main {
    public static double [] difference(double[] vec1, double[] vec2){
        double[] arr = new double[vec1.length];
        for (int i=0; i<vec1.length; i++)
            arr[i]=(vec1[i]-vec2[i]);
        return arr;
    }
    public static void main(String[] args) {
        double[] vec1 = { -2, -4, 9} ;
        double[] vec2= {3, -2, 4} ;
        System.out.print(java.util.Arrays.toString(difference(vec1,vec2)));
    }

}