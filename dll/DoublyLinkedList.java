package dll;

/**
 * Implementation of a generic doubly linked list in Java.
 * 
 * @param <T> The type of the data objects to store
 * @author Carsten Fuhs
 */
public class DoublyLinkedList<T> {
    // the first element of this list; null iff this list is empty
    private DLLElement<T> firstElement;

    // the last element of this list; null iff this list is empty
    private DLLElement<T> lastElement;

    /**
     * Constructs an empty DoublyLinkedList.
     */
    public DoublyLinkedList() {
        this.firstElement = null;
        this.lastElement = null;
    }

    /**
     * Adds <code>value</code> at position <code>index</code> to this list.
     *
     * @param index we want to add <code>value</code> at this position,
     *  0 <= index <= this.size() must hold
     * @param value to be added
     * @throws IllegalArgumentException if index < 0 or index > this.size()
     */
    public void addAtPosition(int index, T value) {
        assert this.hasSaneStructure(); // check class invariants on the structure
        if (index < 0) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
        // case 1: list empty
        if (this.isEmpty()) {
            if (index == 0) { // the only place we can insert now
                this.firstElement = new DLLElement<T>(value);
                this.lastElement = this.firstElement;
                return;
            } else {
                throw new IllegalArgumentException("Illegal index: " + index);
            }
        }
        // case 2: list not empty
        // case 2a: insert at position 0, before the first element
        if (index == 0) {
            DLLElement<T> newElem = new DLLElement<T>(value, this.firstElement, null);
            this.firstElement.setPrevious(newElem);
            this.firstElement = newElem;
            return;
        }
        // case 2b: insert at a later position
        DLLElement<T> current = elementAtPosition(index, this.firstElement);
        // case 2b (i): insert at the end
        if (current == null) {
            DLLElement<T> newElem = new DLLElement<T>(value, null, this.lastElement);
            this.lastElement.setNext(newElem);
            this.lastElement = newElem;
            return;
        }
        // case 2b (ii): insert somewhere in the middle, between two elements
        // -> atm current is at the index where the new element is supposed to go

        // * inform the new element of its neighbours
        DLLElement<T> newElem =
                new DLLElement<T>(value, current, current.getPrevious());

        // * inform the next neighbour of the new element
        newElem.getNext().setPrevious(newElem);

        // * inform the prev neighbour of the new element
        newElem.getPrevious().setNext(newElem);
    }

    /**
     * Return the element at position index starting from first.
     *
     * @param index must be >= 0 and <= the length of the sequence of
     *  "next" references from first 
     * @param first we want to iterate index positions along its
     *  "next" reference
     * @return the element at position index starting from first
     */
    private static <T> DLLElement<T> elementAtPosition(int index, DLLElement<T> first) {
        assert index >= 0;
        // iterative implementation
        DLLElement<T> current = first;
        for (int i = 0; i < index; i++) {
            if (current != null) {
                current = current.getNext();
            } else {
                throw new IllegalArgumentException("Illegal index: " + index);
            }
        }
        return current;
    }

    /**
     * Return the element at position index starting from first.
     *
     * @param index must be >= 0 and <= the length of the sequence of
     *  "next" references from first 
     * @param first we want to iterate index positions along its
     *  "next" reference
     * @return the element at position index starting from first
     */
    private static <T> DLLElement<T> elementAtPositionRecursive(int stepsToGo, DLLElement<T> first) {
        assert stepsToGo >= 0;
        // alternative recursive implementation for elementAtPosition
        if (stepsToGo == 0) {
            return first;
        }
        if (first == null) {
            throw new IllegalArgumentException("Illegal index!");
        }
        return elementAtPositionRecursive(stepsToGo - 1, first.getNext());
    }

    /**
     * Retrieves the index-th element from this list.
     * 
     * @param index the position from which we want to retrieve the stored
     *  data; 0 <= index and index < this.size() must hold
     * @return the element at position index in this list
     * @throws IllegalArgumentException if index < 0 or index >= this.size()
     */
    public T get(int index) {
        assert this.hasSaneStructure();
        if (index < 0) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
        
        DLLElement<T> current = elementAtPosition(index, this.firstElement);
        if (current == null) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
        return current.getData();
    }

    /**
     * @return true if this list is empty; false otherwise 
     */
    public boolean isEmpty() {
        assert this.hasSaneStructure();
        return this.firstElement == null;
    }

    /**
     * @return the number of elements in this list
     */
    public int size() {
        assert this.hasSaneStructure();
        // iterative solution
        if (this.firstElement == null) {
            assert this.lastElement == null;
            return 0;
        }
        int result = 0;
        for (DLLElement<T> current = this.firstElement;
             current != null;
             current = current.getNext()) {
            // iteration with "for (...; ...; ...)" is not necessarily about ints
            result++;
        }
        return result;
    }

    /**
     * Deletes the index-th element from this list.
     * 
     * @param index the position at which we want to delete the stored
     *  data from the list; 0 <= index and index < this.size() must hold
     * @throws IllegalArgumentException if index < 0 or index >= this.size()
     */
    public void delete(int index) {
        assert this.hasSaneStructure();

        if (index < 0 || this.isEmpty()) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
        DLLElement<T> target = elementAtPosition(index, this.firstElement);
        if (target == null) {
            throw new IllegalArgumentException("Illegal index: " + index);
        }
        if (target == this.firstElement) {
            if (target == this.lastElement) { // just 1 element in list
                this.firstElement = null;
                this.lastElement = null;
            } else { // there is a next element that needs updating
                this.firstElement.getNext().setPrevious(null);
                this.firstElement = this.firstElement.getNext(); 
            }
            return;
        }
        if (target == this.lastElement) {
            // there is an previous element that needs updating
            this.lastElement.getPrevious().setNext(null);
            this.lastElement = this.lastElement.getPrevious();
            return;
        }
        // target is between two other elements, bring them together
        target.getNext().setPrevious(target.getPrevious());
        target.getPrevious().setNext(target.getNext());
    }

    /**
     * @return a String representation of this DoublyLinkedList
     */
    public String toString() {
        assert this.hasSaneStructure();
        // iterative solution

        // to /construct/ a String step by step, a (mutable) StringBuilder
        // is more efficient than creating (immutable) String objects (and
        // then throwing them away immediately)
        StringBuilder result = new StringBuilder();
        result.append('[');

        boolean first = true;
        for (DLLElement<T> current = this.firstElement;
             current != null;
             current = current.getNext()) {
            if (first) { // use commas only from the second iteration onwards
                first = false;
            } else {
                result.append(',');
            }
            result.append(current.toString());
        }
        result.append(']');
        return result.toString();
    }

    /**
     * Sanity check to check the "class invariants" of a DoublyLinkedList,
     * i.e., the assumptions on the state of the object that all methods
     * rely on (and that all methods must guarantee).
     *
     * @return whether the pointer structure of the doubly-linked list
     *  is still intact (i.e., consistent)
     */
    private boolean hasSaneStructure() {
        if (this.firstElement == null) {
            return this.lastElement == null;
        }
        if (this.lastElement == null) {
            return false; // this.firstElement != null at this point
        }
        if (this.firstElement.getPrevious() != null) {
            return false;
        }
        if (this.lastElement.getNext() != null) {
            return false;
        }

        for (DLLElement<T> current = this.firstElement;
             current != null;
             current = current.getNext()) {
            if (current.getNext() != null) {
                // the condition deliberately uses "!=" and not "not equals"
                if (current.getNext().getPrevious() != current) {
                    return false;
                }                    
            } else if (current != this.lastElement) {
                // the elements reachable from this.firstElement and
                // this.lastElement might not be the same
                return false;
            }
            if (current.getPrevious() != null
                    && current.getPrevious().getNext() != current) {
                return false;
            }
        }

        for (DLLElement<T> current = this.lastElement;
             current != null;
             current = current.getPrevious()) {
            if (current.getPrevious() != null) {
                // the condition deliberately uses "!=" and not "not equals"
                if (current.getPrevious().getNext() != current) {
                    return false;
                }                    
            } else if (current != this.firstElement) {
                // the elements reachable from this.firstElement and
                // this.lastElement might not be the same
                return false;
            }
            if (current.getNext() != null
                    && current.getNext().getPrevious() != current) {
                return false;
            }
        }
        return true;
    }
}
