package meanAndSD;

class Main {
    public static double getMean(double[] vec){
        double total=0;
        for (double e:vec)
            total+= e;
        System.out.println(total);

        return total/vec.length;
    }
    public static double getStandardDeviation(double[] vec){
        double mean =getMean(vec);
        double divmean=0;
        for (double e:vec)
            divmean+=(e-mean)*(e-mean);
        divmean=divmean/vec.length;
        double sqr= Math.sqrt(divmean);
        return sqr;}

    public static void main(String[] args) {
        double[] array= {1 , -4 , 12, 4 ,7 };

        double[]array1={2, 4, 4, 4, 7, 9 };
        System.out.println(getStandardDeviation(array1));
        //System.out.println(Array.toString(array));
        System.out.println(getMean(array));
    }
}