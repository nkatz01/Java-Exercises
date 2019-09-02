package previousExams;


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

}
