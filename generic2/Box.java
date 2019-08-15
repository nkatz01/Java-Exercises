package generic2;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void copyFrom(Box<T> src) {
        this.data = src.data;
    }
}
