package operationWithMatrices;

public class RowNoOfLowestSum {

    public static void main(String[] args) {

        int[][] A = {
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,1,1,1,1,1},
                {1,2,3,4,5,6},
        } ;
        int row=0;
        int m=5;//number of rows
        int n=6; //number of columns
        int candsum;
        int minsum=0;

        for(int j=0;j<n;j++)
            minsum=minsum+A[0][j];

        for(int i=1;i<m;i++) {
            candsum=0;
            for(int j=0;j<n;j++){
                candsum=(candsum+A[i][j]);



            }
            if (candsum<minsum)
            {minsum=candsum;
                row=i;}
        }


        System.out.println(row+1);


    }
}
