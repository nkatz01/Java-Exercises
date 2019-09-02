package previousExams;


/**
 * Write a description of class Var here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Var implements Exp
{
   private final String name;
public Var(String n) { name = n; }

public Exp replace(Var var, Exp val){
 
if (var.equals(this))
return val;
else 
return this; 
}

@Override
public String toString(){
return name+"";
}
 
}
 
