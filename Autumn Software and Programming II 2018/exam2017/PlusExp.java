package previousExams;
import java.util.ArrayList; 
import java.util.Arrays;

/**
 * Write a description of class PlustExpression here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlusExp implements Exp
{
  private final Exp left;
private final Exp right;

public PlusExp(Exp l, Exp r) {
left = l;
right = r;
}

public Exp replace(Var var, Exp val){
 
PlusExp pex= new PlusExp(left.replace( var, val),right.replace( var,  val));

return pex; 
 
}

@Override
public String toString(){
return "("+left.toString()+" + "+right.toString()+")";
}

public ArrayList<Var> getVars(){
    ArrayList<Var> LL = left.getVars(); 
    ArrayList<Var> RL = right.getVars();
   /* ArrayList<Var> NL = new ArrayList<Var>(); 
    for (Var var: LL){
    if (var!=null && !(LL.contains(var)))
        NL.add(var);
    }
     for (Var var: RL){
    if (var!=null && !(LL.contains(var)))
        NL.add(var);
    }*/
      ArrayList<Var> NL =   new ArrayList<Var>(); 
      LL.add(left.getVars().get(0));
       RL.add(right.getVars().get(0));
        for (Var var: LL){
            if (var!=null & !NL.contains(var))
        NL.add(var);
    }
     for (Var var: RL){
          if (var!=null && !NL.contains(var))
         NL.add(var);
    }
      

   // System.out.println(NL);
    return NL; 
}

public int evaluate(Assignment a){
return left.evaluate(a) + right.evaluate(a); 
}

}
