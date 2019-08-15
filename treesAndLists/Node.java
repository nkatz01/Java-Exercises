package treesAndLists;

/**
 * Helper class for generic binary trees.
 * 
 * @param <T> type of the values to be stored in the Nodes
 * 
 * @author Carsten Fuhs
 */
public class Node<T> {
    // Alternative: We could also set the visibility of the class Node
    // to "package". This could make sense since the class is only a helper
    // class for Tree<T> in the same package which the user of Tree<T> need
    // not access.

    private T data; // the data element stored at the current node
    private Node<T> left; // the left subtree
    private Node<T> right; // the right subtree

    /**
     * Constructs a new Node with data as the encapsulated value.
     *
     * @param data the data element to store in this Node
     */
    public Node(T data) {
        this(data, null, null);
    }

    /**
     * Constructs a new node using data, left, and right
     * as the new node's data, left subtree, and right subtree.
     *
     * @param data the data element to store in this Node
     * @param left the left subtree; use null for none
     * @param right the right subtree; use null for none
     */
    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * @return the data element stored in this Node
     */
    public T getData() {
        return this.data;
    }

    /**
     * @param data the data element to be stored in this Node
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the left subtree
     */
    public Node<T> getLeft() {
        return this.left;
    }

    /**
     * @param left the left subtree to set
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * @return the right subtree
     */
    public Node<T> getRight() {
        return this.right;
    }

    /**
     * @param right the right subtree to set
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }

    /**
     * Determines the size of the tree that has this Node as its root.
     *
     * @return the size of the tree that has this Node as its root
     */
    public int size() {
        int result = 1;
        if (this.left != null) {
            result = result + this.left.size();
        }
        if (this.right != null) {
            result = result + this.right.size();
        }
        return result;
    }

    /**
     * @return a String representation of the data stored in this Node
     */
    @Override
    public String toString() {
        if (this.data == null) {
            return "null";
        }
        return this.data.toString();
    }
}
