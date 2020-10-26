package binaryMatrixProcessing;

class Main {
    public static void main(String[] args) {

        int[][] A = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0, 0 }, };

        int n=6; // number of rows and cols in matrix
        int i = 0;
        int curj = 0;
        int curR = 1;
        int curR2 = 0;
        int curj2 = 0;
        boolean foundOnSameRow = false;
        boolean foundOnSameCol = false;
        boolean foundOnSameRowAndCol = false;
        for (i = 0; i < n * n; i++) { // tests each cell for first 1 up to end of A. n being number of rows and cols in array.
            if (curj == n) { // when end of row is reached
                curj = 0;// restart column
                curR++;// increase row
            }
            curj = (n - (n - (curj + 1)));// considering col starts at 0, increas col and also use for record keeping for
            // when/if 1 is found. (col no will be real col as opposed to java's -1 index
            // number)
            if (A[curR - 1][curj - 1] == 1)// when first 1 is found
            {
                curR2 = curR;// initialize a second row variable
                curj2 = curj;// ini a second col variable
                for (int l = i + 1; l < n * n; l++) {// do a second loop to search for second 1, continuing from the index after
                    // which first 1 was found
                    if (curj2 == n) {// col resetter and row increase for second loop
                        curj2 = 0;
                        curR2++;
                    }
                    curj2 = (n - (n - (curj2 + 1)));// record col
                    if (A[curR2 - 1][curj2 - 1] == 1) { // if both
                        if (curR2 == curR && curj2 == curj)// if a 1 found on same row and and also on same col
                            foundOnSameRowAndCol = true;
                        else if (curj2 == curj)// if only found on same col
                            foundOnSameCol = true;
                        else if (curR2 == curR)// if only found on same row
                            foundOnSameRow = true;
                        else
                            ;
                    } // end of first if
                } // end of middle for
            } // end of second if
        } // end of outer for
        if (foundOnSameRowAndCol || (foundOnSameCol && foundOnSameRow)) // if found on same row and col (of first find) OR
            // if found separete instances of both
            System.out.println("foundOnSameRowAndCol==true ");
        else if (foundOnSameRow)
            System.out.println("foundOnSameRow==true ");
        else if (foundOnSameCol)
            System.out.println("foundOnSameCol==true ");
        else
            System.out.println("notfoundNotOnSameColNorOnSameRow ");
    }
}
