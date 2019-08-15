package treesAndLists;

import java.util.ArrayList;
import java.util.List;

/**
 * A position describes a particular location in a tree via a sequence
 * of Directions from the root.
 *
 * For instance, a position [RIGHT, LEFT] is reached from the root
 * of a tree we first need to go to the right subtree and then to the
 * left subtree. So for the tree
 * <pre>
 * 
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * </pre>
 * the value at position [RIGHT, LEFT] is 4.
 * 
 * @author Carsten Fuhs
 */
public class Position {
    private List<Direction> directions;

    /**
     * Constructs an empty Position, corresponding to the root of a Tree.
     */
    public Position() {
        this(new ArrayList<>());
    }

    /**
     * Constructs a Position corresponding to directions.
     *
     * @param directions indicates the Directions this Position will represent;
     *  modifications to directions after the call to the constructor will be
     *  reflected in this Position
     */
    public Position(List<Direction> directions) {
        this.directions = directions;
    }

    /**
     * @return the number of Directions in this Position
     */
    public int size() {
        return this.directions.size();
    }

    /**
     * @param index we want the Direction indicated for the index;
     *  0 <= i < this.size() must hold
     * @return the Direction indicated at index i
     */
    public Direction get(int index) {
        return this.directions.get(index);
    }

    /**
     * @return a String representation of this Position
     */
    @Override
    public String toString() {
        return this.directions.toString();
    }
}
