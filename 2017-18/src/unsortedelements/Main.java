package unsortedelements;
//print out all elements that are not in place in terms of lowest to highest
class Main {
    public static void main(String[] args) {
        boolean sorted=true;
        int[] array =  {0,-1,6,7,8,9,4};
        for (int i=1; i<(array.length)-1; i++){

            if (array[i]<array[i-1] && array[i]<array[i+1]){
                System.out.println(array[i]);
                sorted=false;}
            else if  (array[i]>array[i-1] && array[i]>array[i+1]){
                System.out.println(array[i]);
                sorted=false;}
        }
        if (array[array.length-1]<array[array.length-2])
            sorted = false;
        System.out.println(array[array.length-1]);
        if (sorted)
        {System.out.println("sorted");}
    }
}