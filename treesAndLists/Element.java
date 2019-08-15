package treesAndLists;

import java.util.ArrayList;

/**
 * Generic helper class to represent elements of a (singly) linked lists.
 *
 * @param T the type of the data objects to store
 * @author Carsten Fuhs
 */
public class Element<T> {

    /** The data object encapsulated by this Element; may be null. */
    private T data;

    /** The next Element in the list; null means no next element. */
    private Element<T> next;

    /**
     * Constructs a new <code>Element</code> that stores <code>data</code>
     * internally and that has <code>null</code> as next element.
     *
     * @param data will be encapsulated in this <code>Element</code>
     */
    public Element(T data) {
        this(data, null);
    }

    /**
     * Constructs a new <code>Element</code> that stores <code>data</code>
     * internally and that has <code>next</code> as next element.
     *
     * @param data will be encapsulated in this <code>Element</code>
     * @param next the <code>Element</code> to be used as the next
     *  <code>Element</code>
     */
    public Element(T data, Element<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Getter for the encapsulated data object.
     *
     * @return the encapsulated data object
     */
    public T getData() {
        return this.data;
    }

    /**
     * Getter for the next <code>Element</code> referenced by this
     * <code>Element</code>.
     *
     * @return the next <code>Element</code> referenced by this
     *  <code>Element</code>
     */
    public Element<T> getNext() {
        return this.next;
    }

    /**
     * Checks whether some <code>Element</code> reachable from this
     * <code>Element</code> contains <code>value</code>.
     * Uses recursion.
     *
     * @param value the value for which we want to know whether it is
     *  reachable from this <code>Element</code>
     * @return whether some <code>Element</code> reachable from this
     *  <code>Element</code> contains <code>value</code>.
     */
    public boolean contains(T value) {
        if (areEqual(this.data, value)) {
            return true;
        }
        return this.next != null && this.next.contains(value);
    }

    /**
     * Checks whether some <code>Element</code> reachable from this
     * <code>Element</code> contains <code>value</code>.
     * Uses a loop.
     *
     * @param value the value for which we want to know whether it is
     *  reachable from this <code>Element</code>
     * @return whether some <code>Element</code> reachable from this
     *  <code>Element</code> contains <code>value</code>.
     */
    public boolean containsLoop(T value) {
        Element<T> current = this;
        do {
            if (areEqual(current.data, value)) {
                return true;
            }
            current = current.next;
        } while (current != null);
        return false;
    }

    /**
     * Returns how many <code>Elements</code> are reachable from this
     * <code>Element</code>, including this <code>Element</code> itself.
     * Uses recursion.
     *
     * @return the number of <code>Elements</code> reachable from this
     *  <code>Element</code>.
     */
    public int size() {
        if (this.next == null) {
            return 1;
        }
        return this.next.size() + 1;
    }

    /**
     * Returns how many <code>Elements</code> are reachable from this
     * <code>Element</code>, including this <code>Element</code> itself.
     * Uses a loop.
     *
     * @return the number of <code>Elements</code> reachable from this
     *  <code>Element</code>.
     */
    public int sizeLoop() {
        Element<T> current = this.next;
        int result = 1;
        while (current != null) {
            current = current.next;
            result++;
        }
        return result;
    }

    /**
     * Getter for the data object stored at position <code>index</code>
     * from this <code>Element</code>.
     * Uses recursion.
     *
     * @param index the index of the data object to retrieve, where
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T get(int index) {
        if (index < 0) { // the original index was too small
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) { // zero steps to go, we want the local element
            return this.data;
        }
        if (this.next == null) { // the original index was too big
            throw new IndexOutOfBoundsException();
        }
        return this.next.get(index - 1); // one step less to go from this.next!
    }

    /**
     * Returns the Element max(n, 0) steps via this.next
     * away from this Element.
     *
     * @param n number of steps to take 
     * @return the Element max(n, 0) steps via this.next
     *  away from this Element
     */
    private Element<T> advanceBy(int n) { // returns the Element that
        Element<T> current = this;    // is n steps from this Element
        for (int i = 0; i < n; i++) {
            if (current.next == null)
                throw new IndexOutOfBoundsException();
            current = current.next;
        }
        return current;
    }

    /**
     * Getter for the data object stored at position <code>index</code>
     * from this <code>Element</code>.
     * Uses a loop to count /down/, similar to our recursive version.
     *
     * @param index the index of the data object to retrieve, where
     *  0 <= index < this.size() should hold
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public T getLoop(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Element<T> current = advanceBy(index);
        return current.data;
    }

    /**
     * Setter for the data object stored at position <code>index</code>
     * from this <code>Element</code>.
     * Uses recursion.
     *
     * @param index the index of the data object to set, where
     *  0 <= index < this.size() should hold
     * @param newData the element to be stored at index
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public void set(int index, T newData) {
        if (index < 0) { // the original index was too small
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) { // zero steps to go, we want the local element
            this.data = newData;
        }
        else if (this.next == null) { // the original index was too big/small
            throw new IndexOutOfBoundsException();
        }
        else {
            this.next.set(index - 1, newData); // one step less to go from this.next!
        }
    }

    /**
     * Setter for the data object stored at position <code>index</code>
     * from this <code>Element</code>.
     * Uses a loop.
     *
     * @param index the index of the data object to set, where
     *  0 <= index < this.size() should hold
     * @param newData the element to be stored at index
     * @throws IndexOutOfBoundsException if index < 0 or index >= this.size()
     */
    public void setLoop(int index, T newData) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Element<T> current = this;
        for (int stepsToGo = index; stepsToGo > 0; stepsToGo--) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException();
            }
            current = current.next;
        }
        current.data = newData;
    }

    public void add(int index, T newData) {
        if (index <= 0) { // cannot add /before/ the current element
            throw new IndexOutOfBoundsException();
        }
        else if (index == 1) {
            // now we are right before the new position of newData,
            // so add a new Element for newData into the linked list
            this.next = new Element<T>(newData, this.next);
        }
        else if (this.next == null) {
            throw new IndexOutOfBoundsException();
        }
        else {
            this.next.add(index - 1, newData);
        }
    }

    public void addLoop(int index, T newData) {
        if (index <= 0) {
            throw new IndexOutOfBoundsException();
        }
        Element<T> current = advanceBy(index - 1);
        // now we are right before the new position of newData
        current.next = new Element<T>(newData, current.next);
    }

    public T remove(int index) {
        if (index <= 0 || this.next == null) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 1) {
            // now we are right before the element to remove
            T result = this.next.data;
            this.next = this.next.next; // unlink the list element to remove it 
            return result;
        }
        return this.next.remove(index - 1);
    }

    public T removeLoop(int index) {
        if (index <= 0) {
            throw new IndexOutOfBoundsException();
        }
        Element<T> current = advanceBy(index - 1);
        if (current.next == null) {
            throw new IndexOutOfBoundsException();
        }
        // now we are right before the element to remove
        T result = current.next.data;
        current.next = current.next.next; // unlink the list element to remove it
        return result;
    }

    /**
     * Static recursive helper method to copy a list to an <code>ArrayList</code>.
     *
     * @param target we want to copy the list starting with <code>head</code> here
     * @param head to be copied
     * @param <T> the type of the data in the list
     */
    public void fillArrayList(ArrayList<? super T> target) {
        target.add(this.data);
        if (this.next != null) {
            this.fillArrayList(target);
        }
    }

    /**
     * Static helper method to check two (potentially <code>null</code>)
     * references for object equality. Could also use Objects.equals(x,y)
     * from the Java API.
     *
     * @param x may be null
     * @param y may be null
     * @return true if <code>x</code> and <code>y</code> are both
     *  <code>null</code> or <code>x.equals(y)</code>; false otherwise
     */
    private static boolean areEqual(Object x, Object y) {
        if (x == null) {
            return y == null;
        }
        return x.equals(y);
    }

    /**
     * Returns a <code>String</code> representation of this
     * <code>Element</code>.
     *
     * Note: This implementation of <code>toString()</code> only
     * uses the current <code>Element</code>, but not the next
     * <code>Element</code>.
     *
     * @return a <code>String</code> representation of this <code>Element</code>
     */
    @Override
    public String toString() {
        return this.data.toString(); // prints only one Element
    }
}
