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
    
    do{
    System.out.println("Please enter integer"); 
    int i = scn.nextInt();
    sum+=i;
    times++;
} while (scn.hasNextInt()) ;
    
    System.out.println(sum + " " + times); 
}
 
}
