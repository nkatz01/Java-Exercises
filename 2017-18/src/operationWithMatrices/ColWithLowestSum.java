package operationWithMatrices;

class ColWithLowestSum {
    public static void main(String[] args) {//print sum of colomn with lowest sum compared to other columns
        int[][] A =
                {
                        {1,1,1,1,1,1},
                        {2,2,2,2,2,2},
                        {3,3,3,3,3,3},
                        {4,4,4,4,4,4},
                        {5,5,5,5,5,4},
                }   ;
        int m=5;//number of rows
        int n=6; //number of columns
        int candsum;
        int minsum=0;
        for (int i=0; i<m; i++)
            minsum= minsum+A[i][0];

        for (int j=1; j<n; j++){
            candsum=0;
            for (int i=0; i<m; i++){
                candsum=candsum+A [i][j];}
            if (candsum<minsum)
                minsum=candsum;
        }

        System.out.println(minsum);

     }
}