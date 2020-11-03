package operationWithMatrices;

public class ThatOneRowIsAll1s {

    public static void main(String[] args) {

        int[][] A = {
                {1,2,3,4,5,6},
                {9,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,2,3,4,5,6},
                {1,1,1,1,1,1},
        } ;

        boolean notAllOnes=true;
        int m=5;//number of rows
        int n=6; //number of columns


        for(int i=0;i<m;i++)
        {


            notAllOnes=false;
            for(int j=0;j<n;j++){
                if (A[i][j]!=1)
                    notAllOnes=true;

            }
            if (notAllOnes==false)
            {System.out.println("Yes");
                break; }
        }

        if (notAllOnes==true)
            System.out.println("No");



    }
}
