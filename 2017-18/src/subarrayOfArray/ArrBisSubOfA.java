package subarrayOfArray;

public class ArrBisSubOfA {

    public static void main(String[] args) {


         iterativeSol();
         SortedAnd0ofN();

        int[] A = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] B = {  1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        recursiveSol(0, A.length - 1, A, B);//first param refers to first element in B, the second, to the last element in A.



    }

    public static int recursiveSol(int j, int i, int[] A, int[] B) {
        int found = 0;
        if (B.length > A.length) {
            System.out.println("Array B is not sub of Array A");
            return B.length - 1;
        }
        if (i == -1) {// base case - Array A's finished traversing back to front
            return 0;
        }

        found += recursiveSol(j, i - 1, A, B); // increase indexes in A - equivelant of inner loop - pass 1 (if matching
        // value found in A) or 0 (if matching value not found in A)through the
        // recursive calls back to the first caller.

        if (B[j] != A[i])
            found = found + 0;

        else

            found = found + 1;

        j++;

        if (i == A.length - 1 && j < B.length)// increase index in B - equivelant of outer loop
            found += recursiveSol(j, i, A, B); // sum up the 1s gained (or not) for each element in B - from each "whole loop
        // cycle" through A.

        if (j == 1 && i == A.length - 1) {// it has finished reversing from all the recursion calls
            if (found == B.length)

                System.out.println("B is a subarray of A");
            else
                System.out.println("B is not subarray of A");
        }

        return found;// added advantage: if one wants evaluation above to be doen by outside caller -
        // that's possible.

    }



    public static void iterativeSol(){
        int[] A =  {1,2,5};
        int[] B = {2,5,1};
        int count=0;

        for (int i=0; i<B.length; i++){
            for (int j=0; j<A.length; j++)
            {
                if (B[i]==A[j])
                {count++;
                    break; }
            }


        }
        if (count==B.length)

            System.out.println("B is sub array of A");

        else
            System.out.println("B is not a sub array of A");

    }




    public static void SortedAnd0ofN(){

        int[] A =  {1,2,3,4};//eg used
        int[] B = { 1,2,3};//eg used
        if (B.length>A.length)//we can do this as we know values aren't repeated
        { System.out.println("Array B not subof array A");
            return; }
        int i=0;//index counter for B
        int j=0; //index counter for A
        int flag=0;
        while (i<B.length)
        {
            if (flag==1 || j==A.length)//if value of corrsponding index in A is more than value of corresponding index in B, or if all indexes in A have been visited - terminate the loop
            {
                break; }
            flag=compareArrays(A, j, B, i); //send array ref and index no to compareArrays func
            //System.out.println(flag);
            if (flag==-1)//if value of corrsponding index in A is less than value of corresponding index in B,
                i--;//pass again the current index no of Array B.
            i++;
            j++;//whilst increasing the index of A, regardless.

        }

        if (flag==0)
            System.out.println("Array B is subbary of A");
        else
            System.out.println("Array B is not subbary of A");
    }

    public static int compareArrays( int[] A, int j, int[]  B, int i){
        if (A[j]>B[i])
            return 1;//because Arrays are sorted, we know the chance for the value to be found in A is gone.
        if (A[j]==B[i])
            return 0;
        else return -1; //we may still find the value further in A.
    }








}
