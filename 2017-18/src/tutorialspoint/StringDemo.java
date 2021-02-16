package tutorialspoint;
import java.io.*;

public class StringDemo {

    public   static  void main(String[] args) throws Exception {
       String whatever = new String("Hey");
       whatever = new String("No");

       // System.out.println(whatever);
       // try {
//            File file = new File("E://file.txt");
//            FileReader fr = new FileReader(file);
//        }
//        catch (FileNotFoundException f){
//            f.printStackTrace();
//        }

        exceptionTest();


    }

    public  static  void exceptionTest() throws Exception {
        int a[] = new int[2];
        try {
            //FileInputStream file = new FileInputStream("E://file.txt");
            System.out.println("Access element three :" + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException  f) {// Not valid! {
            f.printStackTrace();
            throw new Exception();
         }
        finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
//        catch (IOException i) {
//            i.printStackTrace();
//            return -1;
//        }
        System.out.println("hey");

    }
}
