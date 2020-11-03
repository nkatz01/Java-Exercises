package binaryGap;

import java.util.regex.*;
class Main {



    public static int solution(int N) {

        if (N < Integer.MAX_VALUE && N > 0) {
            String bin  ="";
            int q = N;

            while (q>=1 ){

                bin += q%2 == 0 ? "0" : "1";
                q = q/2;
            }  ;


            String rev = Main.reverse(bin);



            int res =  CheckGap(rev);

            return res!=-1 ? res - 2 : 0;

        }
        else
            throw new ArithmeticException("Overflow!");

    }

    public static int CheckGap(String str){
        Pattern pattern = Pattern.compile("((1)(0)+(1))$");
        Matcher matcher = pattern.matcher(str);
        String longest ="";
        int longestLength = -1;

        for(int i = str.length(); i> longestLength; i-- ){
            matcher.region(0,i);
            if(matcher.find() && longestLength < matcher.end() - matcher.start()) {
                longest = matcher.group();
                longestLength = longest.length();

            }
        }



        return longestLength;

    }

    public static String reverse(String toBeRev){
        String rev ="";
        for(int j=toBeRev.length(); j>0; --j)
            rev += toBeRev.charAt(j-1);
        return rev;

    }
    public static void main(String[] args) {
        System.out.println(Main.solution(529));


    }
}
