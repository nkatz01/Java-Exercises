package expression;

/**
 * Represents an Expression of the form e1 + e2.
 * 
 * @author 
 */
public class PlusExpression extends BinaryExpression {

    /**
     * Constructs a PlusExpression with left and right as direct subexpressions.
     *
     * @param left the left subexpression; non-null
     * @param right the right subexpression; non-null
     */
    public PlusExpression(Expression left, Expression right) {
        super(left, right, "+");
    }
    
    public int  computeValue(){
        return (getLeft().computeValue() + getRight().computeValue()); 
    }
    
     public int numberOfNodes(){
    return 2; 
    } 

}
