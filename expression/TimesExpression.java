package expression;

/**
 * Represents an Expression of the form e1 * e2.
 * 
 * @author 
 */
public class TimesExpression extends BinaryExpression {

    /**
     * Constructs a TimesExpression with left and right as direct subexpressions.
     *
     * @param left the left subexpression; non-null
     * @param right the right subexpression; non-null
     */
    public TimesExpression(Expression left, Expression right) {
        super(left, right, "*");
    }
    
    public int  computeValue(){
        return (getLeft().computeValue() * getRight().computeValue()); 
    }

}
