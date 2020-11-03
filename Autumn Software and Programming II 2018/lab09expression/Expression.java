package expression;

/**
 * Basic interface for arithmetic expressions.
 *
 * @author Carsten Fuhs
 */
public interface Expression {

    /**
     * Computes the int value represented by this Expression.
     *
     * @return the int value represented by this Expression
     */
    int computeValue();

    /**
     * Computes the number of sub-expressions of this Expression
     * (its "size").
     *
     * @return the number of nodes of this Expression.
     */
    int numberOfNodes();
}
