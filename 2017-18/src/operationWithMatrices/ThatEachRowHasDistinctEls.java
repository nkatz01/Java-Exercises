package operationWithMatrices;

public class ThatEachRowHasDistinctEls {
    public static void main(String[] args) {

        int[][] A = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
        } ;
        int rows=0;
        int m=5;//number of rows
        int n=6; //number of columns



        for(int i=0;i<m;i++) {
            int[] B = new int[n];
            for(int j=0;j<n;j++){
                B[j]=A[i][j];



            }

            rows+=check1DarrayForDistinct(B, n);

        }

        if (rows==m)

            System.out.println("YES");
        else

            System.out.println("NO");


    }
    public static int check1DarrayForDistinct(int[] B, int n){
        int value=0;
        boolean notDistinct= false;
        for (int j=0; j<(n-1); j++){
            value=B[j];
            for (int i=(j+1); i<n; i++){
                if (value==B[i]){
                    notDistinct=true;
                }
            }
            if(notDistinct)
                return 0;

        }

        return 1;

    }
}
