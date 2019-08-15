package treesAndLists;

import java.util.*;

/**
 * Generic class providing an abstract data type for binary trees.
 *
 * @param <T> The type of the data stored in the tree.
 * @author Carsten Fuhs
 */
public class Tree<T> {

    /*
     * The root node of the tree. May be null.
     */
    private Node<T> root;

    /**
     * Constructs an empty tree.
     */
    public Tree() {
        this.root = null;
    }

    /**
     * Constructs a tree with root as root.
     *
     * @param root may be null
     */
    public Tree(Node<T> root) {
        this.root = root;
    }

    /**
     * Get the data stored in the tree at Position pos.
     *
     * @param pos must be a position in which this Tree has a Node
     * @return the data stored at that Node
     */
    public T get(Position pos) {
        return get(pos, 0, this.root);
    }

    /**
     * Recursive helper method to retrieve the data stored in a tree.
     * 
     * @param pos the Position in the overall tree
     * @param index the index of the Direction in Position that we have already
     *  reached in the overall tree
     * @param node the current Node in the tree
     * @return the value stored in node at position pos where we consider that
     *  pos starts at index
     */
    private static <T> T get(Position pos, int index, Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException("No data stored at this position!");
        }
        assert index >= 0;
        assert index <= pos.size();
        if (index == pos.size()) { // we are there!
            return node.getData();
        }
        Direction d = pos.get(index);
        Node<T> child = getChild(node, d);
        return get(pos, index + 1, child);
    }

    /**
     * Get the child of a Node in a given Direction.
     *
     * @param node a node whose child we want to go to; non-null
     * @param d the direction in which to go; non-null
     * @param <T> the type of the data in the Node
     * @return the child of node in direction d
     */
    private static <T> Node<T> getChild(Node<T> node, Direction d) {
        switch (d) {
        case LEFT:
            return node.getLeft();
        case RIGHT:
            return node.getRight();
        default:
            throw new UnsupportedOperationException("Unknown direction " + d + "!");
        }
    }

    /**
     * Set the child of a Node in a given Direction.
     *
     * @param node a node whose child we want to set; non-null
     * @param newChild the new child for node
     * @param d the direction in which to go; non-null
     * @param <T> the type of the data in the Node
     */
    private static <T> void setChild(Node<T> node, Node<T> newChild, Direction d) {
        switch (d) {
        case LEFT:
            node.setLeft(newChild);
            break;
        case RIGHT:
            node.setRight(newChild);
            break;
        default:
            throw new UnsupportedOperationException("Unknown direction " + d + "!");
        }
    }

    /**
     * Tries to add value to this Tree at Position pos. If there is already
     * a node at pos, this Tree is not modified, and false is returned.
     * Otherwise only the (unique) prefix of pos is considered that refers
     * to a position below a node in this Tree where value could be added
     * (i.e., where currently this Tree has no node, but there is a node at
     * the "parent position").  
     * 
     * Examples: Consider pos = [RIGHT, LEFT] and value = 8.
     *
     * <ul>
     *  <li>For the empty tree, the tree will be updated to a tree
     *      with 8 at its root.
     *  <li>For the tree with the single node 1, the tree will be updated to
     *      <pre>
     *      1
     *       \
     *        8
     *      </pre>
     *  <li>For the tree
     *      <pre>
     *         1
     *        / \
     *       2   3
     *      </pre>
     *      the tree will be updated to 
     *      <pre>
     *         1
     *        / \
     *       2   3
     *          /
     *         8
     *      </pre>
     *  <li>For the tree
     *      <pre>
     *         1
     *        / \
     *       2   3
     *          /
     *         4
     *      </pre>
     *      nothing will change since there already is a node (labelled 4)
     *      at position pos.
     * </ul>
     * 
     * @param pos the position where the value should be inserted; non-null  
     * @param value to be added to this Tree
     * @return whether this Tree was modified
     */
    public boolean addAtPosition(Position pos, T value) {
        // implemented iteratively for a change; we only need to follow
        // a single path in the tree, so the advantages of recursion
        // are less pronounced

        if (this.root == null) { // pos does not matter in this case
            this.root = new Node<>(value);
            return true;
        }
        final int posSize = pos.size();
        if (posSize == 0) { // the root position is already occupied
            return false;
        }
        int posIndex = 0;
        Node<T> currentNode = this.root;
        Direction dir = pos.get(posIndex);
        posIndex++;
        Node<T> child = getChild(currentNode, dir);

        while (child != null && posIndex < posSize) {
            currentNode = child;
            dir = pos.get(posIndex);
            posIndex++;
            child = getChild(currentNode, dir);
        }
        if (child == null) {
            setChild(currentNode, new Node<>(value), dir);
            return true;
        }
        return false;
    }

    /**
     * @return whether this Tree is empty
     */
    public boolean isEmpty() {
        return this.root == null;
    }

    /**
     * Computes the number of nodes in this tree.
     * 
     * @return the number of nodes in this tree
     */
    public int size() {
        return size(this.root);
    }

    /**
     * Recursive helper method to compute the size of a Tree.
     * 
     * @param root the root node of the (sub)tree
     * @return the number of nodes
     */
    private static <T> int size(Node<T> root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.getLeft()) + size(root.getRight());
    }

    /**
     * Does a preorder tree traversal, printing the nodes.
     */
    public void preOrder() {
        preOrder(this.root);
    }

    /**
     * Does a preorder tree traversal from root, printing the nodes.
     *
     * @param root may be null
     */
    private static <T> void preOrder(Node<T> root) {
        if (root == null) {
            return;
        }
        doSomething(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    /**
     * Does an inorder tree traversal, printing the nodes.
     */
    public void inOrder() {
        inOrder(this.root);
    }

    /**
     * Does an inorder tree traversal from root, printing the nodes.
     *
     * @param root may be null
     */
    private static <T> void inOrder(Node<T> root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        doSomething(root.getData());
        inOrder(root.getRight());
    }

    /**
     * Does a postorder tree traversal, printing the nodes.
     */
    public void postOrder() {
        postOrder(this.root);
    }

    /**
     * Does a postorder tree traversal from root, printing the nodes.
     *
     * @param root may be null
     */
    private static <T> void postOrder(Node<T> root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        doSomething(root.getData());
    }

    /**
     * Prints t and a whitespace.
     * @param t may be null
     */
    private static <T> void doSomething(T t) {
        System.out.print(t + " "); // doing something
    }


    /**
     * Does a preorder tree traversal, printing the nodes.
     * Does not use recursion!
     */
    public void preOrderLoop() {
        preOrderLoop(this.root);
    }

    /**
     * Does a preorder tree traversal, printing the nodes from root.
     * Does not use recursion!
     */
    private static <E> void preOrderLoop(Node<E> root) {
        // use LinkedList for stack here as we want null entries
        Deque<Node<E>> stack = new LinkedList<Node<E>>();
        stack.push(root);
        while (! stack.isEmpty()) {
            Node<E> node = stack.pop();
            if (node != null) {
                doSomething(node.getData());

                // first push the Node that is to be visited /later/
                stack.push(node.getRight());

                // then push the Node to stack that is to be visited /earlier/
                // (top-of stack is popped next)
                stack.push(node.getLeft());
            }
        }
    }

    /**
     * @return a String representation of this Tree via a list in
     *  in-order representation of the values
     */
    @Override
    public String toString() {
        if (this.root == null) {
            return "[]";
        }
        return "[" + toStringContent(this.root) + "]";
    }

    /**
     * Recursive helper method to convert a tree to a String.
     *
     * @param node the node whose subtree we want as a String
     * @return a list of the values in node in inOrder representation
     */
    private static <T> String toStringContent(Node<T> node) {
        assert node != null;

        // for a more efficient implementation that does not build intermediate
        // String objects and then throws them away, use an object of the class
        // StringBuilder as a parameter to construct the String object in it
        if (node.getLeft() != null) {
            if (node.getRight() != null) {
                return toStringContent(node.getLeft()) + ","
                        + node.toString() + ","
                        + toStringContent(node.getRight());
            } else {
                return toStringContent(node.getLeft()) + "," + node.toString();
            }
        } else {
            if (node.getRight() != null) {
                return node.toString() + "," + toStringContent(node.getRight());
            } else {
                return node.toString();
            }
        }
    }
}
