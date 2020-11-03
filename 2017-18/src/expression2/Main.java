package expression2;

public class Main implements IntegerExpression {
    private int val;
    public Main(int val){
        this.val=val;
    }
    public int getValue(){
        return val;
    }
    public String toString(){
        return " "+val+" ";
    }
    public static void main(String[] args) {
        IntegerExpression p1 = new Addition(new Main(1), new Main(2));
        IntegerExpression p2 = new Mulitiplication(p1, new Main(3));
        System.out.println(p2.toString());
    }
}