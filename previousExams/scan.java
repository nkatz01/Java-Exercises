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
//sum();
 System.out.println(scan());
}
 
public static int scan(){
    System.out.println("Please enter integer; "+"a non-integer to terminate; "+ "0 for a count of positive integers entered");
    Scanner scan = new Scanner(System.in); 
    int i = 0; 
    int times = 0; 
    while( scan.hasNextInt()){
        
        i=scan.nextInt();
          
        if (i>0)
        times++;
        if (i==0)
        break;
         
    }
    if (i==0)
    return times; 
     else
     return -1; 
    }
 



public static void sum(){

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
