package expression;

/**
 * Class that uses some functionality of Expressions.
 *
 * @author Carsten Fuhs
 */
public class ExpressionMain {

    /**
     * @param args Ignored.
     */
    public static void main(String[] args) {
        // ((1 + 2) * (5 * 6))
        Expression e1 = new IntConstant(1);
        Expression e2 = new IntConstant(2);
        Expression e5 = new IntConstant(5);
        Expression e6 = new IntConstant(6);
        Expression plus = new PlusExpression(e1, e2);
        Expression times = new TimesExpression(e5, e6);
        Expression bigTimes = new TimesExpression(plus, times);

        Expression[] exps = { e1, e2, e5, e6, plus, times, bigTimes };

        for (Expression exp : exps) {
            System.out.println(exp + " has " + exp.numberOfNodes()
                + " nodes and value " + exp.computeValue());
        }
    }
}
