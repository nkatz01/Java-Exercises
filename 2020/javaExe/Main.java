package javaExe;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        minsweeperMapping(new char[][]{
                {'*','.','.','.'},
                {'.','*','.','.'},
                {'.','.','.','.'},
                {'.','.','.','.'}
        });
    }


    public  static int[][] minsweeperMapping(char[][] arr){
        int[][] mapped = new int[arr.length][arr[0].length];

        for (char i = 0; i<arr.length; i++) {
            for(char j=0; j<arr[0].length; j++){
                if(arr[i][j]=='.')
                    mapped[i][j] = 0;
                else

                    mapped[i][j]=-8;

            }
        }

        for (int i = 0; i<mapped.length; i++) {
            for(int j=0; j<mapped[0].length; j++){

                if(mapped[i][j]<0) {

                    for(int r = i-1; r<i+2; r++){
                        for(int c = j-1; c<j+2; c++){




                            if (r >= 0 && c >= 0 && r<arr.length && c< arr[0].length  && !(r==i && c==j) ) {

                                mapped[r][c]++;




                            }

                        } } //inner two loop ends

                }
            }
        }

        for (int i = 0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++){

                System.out.print(mapped[i][j]);


            }
            System.out.println();
        }

        return  mapped;
    }
}
