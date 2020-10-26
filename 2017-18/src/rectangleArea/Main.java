package rectangleArea;

//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//int n = in.nextInt();

        double length = 3.4;
        double width = 8.4;
//double area= 0.0;

        System.out.print("The length of the rectangle is "+length +"the width is "+ width +"and the area is"+ calculateTriangle(length, width));
    }
    public static double calculateTriangle(double length, double width){
        double area= length*width;
        return area;
    }



}
