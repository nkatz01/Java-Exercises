package previousExams;


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

}
