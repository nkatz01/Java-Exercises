package treesAndLists;

import java.util.ArrayList;

/**
 * Generic implementation of a (potentially empty) singly-linked list in Java.
 * Can also store <code>null</code> data elements.
 *
 * @param <T> the type of the data objects to store
 * @author Carsten Fuhs
 */
public class MyList<T> {
    /** the first element of this MyList; null if this MyList is empty. */
    private Element<T> head;

    /**
     * Constructs an empty <code>MyList</code>.
     */
    public MyList() {
        this.head = null;
    }

    /**
     * Copy constructor: Constructs a shallow copy of <code>other</other>.
     * Here "shallow copy" means that a new list structure is created (so that
     * later structural modifications to the new <code>MyList</code> will not
     * affect <code>other</code> and vice versa), but the stored objects
     * themselves are not duplicated.
     *
     * @param other to be copied to a new <code>MyList</code>
     */
    public MyList(MyList<? extends T> other) {
        this.head = this.copy(other.head);
    }

    /**
     * Recursive helper method to copy a list.
     *
     * @param otherHead its contents are to be copied to a new list
     * @return a new list with the same contents as the list headed by
     *  <code>otherHead</code>
     */
    private Element<T> copy(Element<? extends T> otherHead) {
        if (otherHead == null) {
            return null;
        }
        Element<T> copyOfNext = this.copy(otherHead.getNext());
        return new Element<T>(otherHead.getData(), copyOfNext);
    }


    /**
     * Check whether this <code>MyList</code> is empty.
     *
     * @return whether this <code>MyList</code> is empty
     */
    public boolean isEmpty() {
        // An isEmpty() method in class Element
        // would not make much sense (why?).
        return this.head == null;
    }

    /**
     * Returns the size of this <code>MyList</code>, i.e., the number of
     * its elements, using recursion.
     *
     * @return the number of elements of this <code>MyList</code>
     */
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.head.size();
    }

    /**
     * Determines the size of this <code>MyList</code>, i.e., the number of
     * its elements, using a loop.
     *
     * @return the number of elements of this <code>MyList</code>
     */
    public int sizeLoop() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.head.sizeLoop();
    }

    /**
     * Clears this <code>MyList</code>, i.e., removes all elements.
     */
    public void clear() {
        // Java's garbage collector will do the actual clearing of the memory
        this.head = null;
    }

    /**
     * Getter for the data object stored at position <code>index</code>
     * in this <code>MyList</code>.
     * Uses recursion.
     * 
     * @param index the index of the data object to retrieve, where
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T get(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return this.head.get(index);
    }

    /**
     * Getter for the data object stored at position <code>index</code>
     * in this <code>MyList</code>.
     * Uses a loop.
     * 
     * @param index the index of the data object to retrieve, where
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T getLoop(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return this.head.getLoop(index);
    }

    /**
     * Checks whether this <code>MyList</code> contains <code>value</code>.
     * Uses recursion.
     *
     * @param value the value for which we want to know whether it is in this 
     *  <code>MyList</code>
     * @return whether this <code>MyList</code> contains <code>value</code>
     */
    public boolean contains(T value) {
        return ! this.isEmpty() && this.head.contains(value);
    }

    /**
     * Checks whether this <code>MyList</code> contains <code>value</code>.
     * Uses a loop.
     *
     * @param value the value for which we want to know whether it is in this 
     *  <code>MyList</code>
     * @return whether this <code>MyList</code> contains <code>value</code>
     */
    public boolean containsLoop(T value) {
        return ! this.isEmpty() && this.head.containsLoop(value);
    }

    /**
     * Overwrites the data contents at <code>index</code> by
     * <code>value</code>.
     * Uses recursion.
     *
     * @param index we want to remove the value at this position,
     *  0 <= index < this.size() should hold
     * @param value the data item to store at index; may be null
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public void set(int index, T value) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        this.head.set(index, value);
    }

    /**
     * Overwrites the data contents at <code>index</code> by
     * <code>value</code>.
     * Uses a loop.
     *
     * @param index we want to remove the value at this position,
     *  0 <= index < this.size() should hold
     * @param value the data item to store at index; may be null
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public void setLoop(int index, T value) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        this.head.setLoop(index, value);
    }

    /**
     * Adds the value <code>value</code> at position <code>index</code> to this
     * <code>MyList</code>.
     *
     * @param index we want to add <code>value</code> at this position,
     *  0 <= index <= this.size() should hold
     * @param value to be added
     * @throws IndexOutOfBoundsException if index < 0 or index > this.size()
     */
    public void add(int index, T value) {
        if (index == 0) {
            this.head = new Element<T>(value, this.head);
        }
        else if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        else {
            this.head.add(index, value);
        }
    }
        
    /**
     * Adds the value <code>value</code> at position <code>index</code> to this
     * <code>MyList</code>.
     * Uses a loop.
     *
     * @param index we want to add <code>value</code> at this position,
     *  0 <= index <= this.size() should hold
     * @param value to be added
     * @throws IndexOutOfBoundsException if index < 0 or index > this.size()
     */
    public void addLoop(int index, T value) {
        if (index == 0) {
            this.head = new Element<T>(value, this.head);
        }
        else if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        else {
            this.head.addLoop(index, value);
        }
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one
     * from their indices). Returns the element that was removed
     * from the list.
     * Uses recursion.
     *
     * @param index we want to remove the value at this position,
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T remove(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            T result = this.head.getData();
            this.head = this.head.getNext();
            return result;
        }
        return this.head.remove(index);
    }

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one
     * from their indices). Returns the element that was removed
     * from the list.
     * Uses a loop.
     *
     * @param index we want to remove the value at this position,
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T removeLoop(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            T result = this.head.getData();
            this.head = this.head.getNext();
            return result;
        }
        return this.head.removeLoop(index);
    }

    
    /**
     * Produces a <code>String</code> representation of this <code>MyList</code>.
     *
     * @return a <code>String</code> representation of this <code>MyList</code>
     *  with its values in the order in which they are stored
     */
    @Override
    public String toString() {
        return "[" + toStringContents(this.head) + "]";
    }

    /**
     * Static recursive helper method to obtain a <code>String</code>
     * representation of a list.
     *
     * @param head we want to represent the list starting here
     * @return a <code>String</code> representation of the list starting
     *  with <code>head</code>
     */
    private static String toStringContents(Element<?> head) {
        // note the unbounded wildcard in the method signature:
        // it does not matter what kind of objects are stored in head
        if (head == null) {
            return "";
        } else if (head.getNext() == null) { // just 1 element, so no comma
            return head.toString();
        } else {
            // use recursion to print content of the whole list
            return head.toString() + ", " + toStringContents( head.getNext() );
        }
    }

    /**
     * Produces a <code>String</code> representation of this <code>MyList</code>.
     *
     * @return a <code>String</code> representation of this <code>MyList</code>
     *  with its values in <i>reverse</i> order
     */
    public String toStringReverse() {
        return "[" + toStringContentsReverse(this.head) + "]";
    }

    /**
     * Static recursive helper method to obtain a <code>String</code>
     * representation of a list in reverse.
     *
     * @param head we want to represent the list starting here
     * @return a <code>String</code> representation of the list starting
     *  with <code>head</code>, in reverse
     */
    private static String toStringContentsReverse(Element<?> head) {
        if (head == null) {
            return "";
        } else if (head.getNext() == null) {
            return head.toString();
        } else {
            // the only difference to toStringContents(...) is
            // in the calls in the following line (and their order)
            return toStringContentsReverse( head.getNext() ) + ", " + head.toString();
        }
    }

    /**
     * Creates a copy of this <code>MyList</code> as an <code>ArrayList</code>.
     *
     * @return an <code>ArrayList</code> that stores the same elements
     *  in the same order as this <code>MyList</code>
     */
    public ArrayList<T> toArrayList() {
        ArrayList<T> res = new ArrayList<T>();
        if (! this.isEmpty()) {
            this.head.fillArrayList(res);
        }
        return res;
    }
}
