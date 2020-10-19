package expression;

/**
 * Abstract class for Expressions with two direct subexpressions.
 * Provides an implementation for numberOfNodes() method. 
 *
 * @author 
 */
public abstract class BinaryExpression implements Expression {

    /** the two subexpressions; non-null */
    private Expression left;
    private Expression right;

    /** String representation of the operator symbol; non-null */
    private String operatorSymbol;

    /**
     * Constructs a BinaryExpression with left and right as direct subexpressions
     * and with operatorSymbol as the String representation of the operator.
     *
     * @param left the left subexpression; non-null
     * @param right the right subexpression; non-null
     * @param operatorSymbol String representation of the operator symbol; non-null
     */
    public BinaryExpression(Expression left, Expression right, String operatorSymbol) {
        if (left == null || right == null || operatorSymbol == null) {
            throw new IllegalArgumentException("Illegal argument null!");
        }
        this.left = left;
        this.right = right;
        this.operatorSymbol = operatorSymbol;
    }

    /**
     * Getter for the left subexpression.
     *
     * @return the left subexpression
     */
    public Expression getLeft() {
        return this.left;
    }

    /**
     * Getter for the right subexpression.
     *
     * @return the right subexpression
     */
    public Expression getRight() {
        return this.right;
    }

    /**
     * Getter for the operator symbol.
     *
     * @return the operator symbol
     */
    public String getOperatorSymbol() {
        return this.operatorSymbol;
    }
    public int numberOfNodes(){
    return 2; 
    } 
    
   /* public int computeValue(){
       // int leftExp = new IntConstant(this.left);
       // int rightExp = new IntConstant(this.left);
           
             
          String operator = this.getOperatorSymbol().toString();
         return  compute(this.left = left,  this.right = right);
    }*/


    @Override
    public String toString() {
        return "(" + this.left + " " + this.operatorSymbol + " " + this.right + ")";
    }
}
