package exam2018;
import java.util.ArrayList; 
import java.util.Arrays;

/**
 * Write a description of class SConverterDr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SConverterDr
{
    // instance variables - replace the example below with your own
public static void main(String[] args){
    StringConverter sc = new StringConverter(); 
    ArrayList<String> arl = new ArrayList<>(Arrays.asList("Chaim", "Fishl", "Moishe")); //16
    System.out.println(sc.convertAll(arl));
}
}
