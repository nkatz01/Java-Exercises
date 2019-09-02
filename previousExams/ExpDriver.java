package previousExams;
import java.util.Arrays;

/**
 * Write a description of class ExpDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExpDriver
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
    Var x = new Var("x");
    Exp e = new PlusExp(new Constant(2), new PlusExp(new Constant(3), x));
    
    System.out.println(e.toString());
 
     Exp f = e.replace(x, new Constant(7));
     System.out.println(f.toString());
    // System.out.println(  f.getVars()  );
     Exp g = new PlusExp(e, new Var("y"));
     System.out.println(g.toString());
    System.out.println( g.getVars());
    
    ZeroAssignment a = new ZeroAssignment(); 
    System.out.println( e.evaluate(a));
    
    Exp h = new PlusExp(g, new Constant(7));
    System.out.println( h.evaluate(a));

}


}
