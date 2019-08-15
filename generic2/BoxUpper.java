package generic2;

// We can rewrite copyFrom() to take a box that contains data
// that is a subclass of T and store it to a Box<T> object
public class BoxUpper<T> {
    private T data;
    public void copyFrom(Box<? extends T> src) {
        this.data = src.getData();
    }
}
