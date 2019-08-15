package dll;

/**
 * Helper class for doubly linked lists.
 * 
 * @param <T> The type of the data to store
 * @author Carsten Fuhs
 */
public class DLLElement<T> {
    private DLLElement<T> next; // next element in the list
    private DLLElement<T> previous; // previous element in the list
    private T data; // the encapsulated data

    /**
     * Constructs a new DLLElement which encapsulates data and has null
     * as previous and next elements.
     *  
     * @param data to be stored
     */
    public DLLElement(T data) {
        this(data, null, null);
    }

    /**
     * Constructs a new DLLElement which encapsulates data and points to
     * next and previous, respectively.
     *  
     * @param data to be stored
     */
    public DLLElement(T data, DLLElement<T> next, DLLElement<T> previous) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    /**
     * @return the next
     */
    public DLLElement<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(DLLElement<T> next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
    public DLLElement<T> getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(DLLElement<T> previous) {
        this.previous = previous;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return a String representation of just the encapsulated object
     */
    @Override
    public String toString() {
        return this.data.toString();
    }
}
