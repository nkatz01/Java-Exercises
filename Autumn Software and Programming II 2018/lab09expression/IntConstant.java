package expression;

/**
 * Expression that represents an int value.
 *
 * @author 
 */
public class IntConstant implements Expression {

    /** stores the encapsulated value */
    private int value;

    /**
     * Constructs a new IntConstant encapsulating value.
     *
     * @param value to be encapsulated in this IntConstant
     */
    public IntConstant(int value) {
        this.value = value;
    }

    /**
     * @return the int value this IntConstant stands for
     */
    public int getValue() {
        return this.value;
    }

   public int numberOfNodes(){
    return 1; 
    } 
    
    public int computeValue(){
        return this.getValue(); 
    }

    @Override
    public String toString() {
        return "" + this.value;
    }
}
