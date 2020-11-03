package crackingCodingInterview;

public class StringPermutation {
   static void permutation(String str){
        permutation(str,"");

    }

    static void permutation(String str, String prefix){
     if (str.length() == 0)
     System.out.println("");
     else{
         for (int i = 0; i < str.length(); i++){
             String rem = str.substring(0,i) + str.substring(i + 1);
           if (str.length() == 3)
             System.out.println(prefix + str.charAt(i));

             permutation(rem, prefix + str.charAt(i));
         }
    }}

  public   static  void main(String[] args){
        permutation("abcd");
     // System.out.println("abc".substring(0,1));
    }
}
