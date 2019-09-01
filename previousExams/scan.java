package previousExams;
import java.util.Scanner;

public class scan{
/**
 * Write a description of class scan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    int sum = 0;
    int times=0;
      int i;
      System.out.println("Please enter integer"); 
  do {
     
   
     if (scn.hasNextInt()){
     
    i = scn.nextInt();
    sum+=i;
    times++;}
    else
    break;
   // if (times==1)
    //System.out.println(scn.hasNextInt()==false); 
  System.out.println("Please enter integer"); 
   }   while (scn.hasNext()); 
    System.out.println(sum + " " + times); 
}
 
}
