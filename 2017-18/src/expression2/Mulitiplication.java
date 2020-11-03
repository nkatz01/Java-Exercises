package expression2;

public class Mulitiplication implements IntegerExpression {
    private IntegerExpression right, left;
    public Mulitiplication(IntegerExpression lef, IntegerExpression righ){
        right=righ;
        left=lef;
    }
    public int getValue(){
        return right.getValue()*left.getValue();
    }
    public String toString (){
        return left.toString()+right.toString()+"*";
    }
}