package previousExams;


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


}


}
