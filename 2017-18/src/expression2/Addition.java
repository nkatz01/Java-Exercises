package expression2;

public class Addition implements IntegerExpression {

    private IntegerExpression right, left;
    public Addition (IntegerExpression lef, IntegerExpression righ){
        right=righ;
        left=lef;
    }

    public int getValue(){
        return right.getValue()+left.getValue();

    }
    public String toString(){
        return right.toString()+left.toString()+" +";
    }
}