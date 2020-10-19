package expression;

public class Main {
    public static void main(String[] args) {
        Expression literal1 = new Literal(1.3);
        Expression literal2 = new Literal("abe");

        System.out.println(literal1.getValue());
        System.out.println(literal1.toString());

        System.out.println(literal2.getValue());
        System.out.println(literal2.toString());

        Expression newOperation = new OperationPlus(literal1, literal2);
        Expression newOperation1   = new OperationPlus(newOperation, new Literal(6));
        System.out.println();


        System.out.println(newOperation.getType());
        System.out.println(newOperation.getValue());

        System.out.println(newOperation.toString());
        System.out.println(newOperation1.toString());
        System.out.println(newOperation1.getType());



    }
}