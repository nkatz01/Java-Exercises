package exam2016;
import java.util.Scanner; 
import java.io.IOException; 
public class Employee extends Person {
private int salary;


public Employee(String name, int salary){
super(name); 
this.salary= salary; 
}


public static double returnsDouble()throws IOException{
Scanner scan = new Scanner(System.in); 
double i = 0.00; 
System.out.println("Please enter a double value"); 
if (scan.hasNextDouble()==false)
throw new IOException("wrong input"); 
else 
i = scan.nextDouble(); 
return i; 
}

public static void main(String[] args)throws IOException{
System.out.println(returnsDouble()); 
}
}
