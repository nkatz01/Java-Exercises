package previousExams;
import java.util.ArrayList;


/**
 * Write a description of interface Exp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Exp
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
  public Exp replace(Var var, Exp val);
 public ArrayList<Var> getVars();
  public int evaluate(Assignment a);

}
