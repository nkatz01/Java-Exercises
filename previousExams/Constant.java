package previousExams;
import java.util.ArrayList; 
import java.util.Arrays; 

/**
 * Write a description of class Constant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Constant implements Exp
{
    // instance variables - replace the example below with your own
 private final int value;
public Constant(int v) { value = v; }

public Exp replace(Var var, Exp val){
 
if (var.equals(this))
return val;
else 
return this; 
}

@Override
public String toString(){
return value+"";
}

public ArrayList<Var> getVars(){
    //return new ArrayList<Var>(Arrays.asList(null));
     ArrayList<Var> cl = new ArrayList<Var>();
   cl.add(null); 
   return cl; 
} 

}
