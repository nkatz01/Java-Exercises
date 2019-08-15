package generics;

public class FooBox {
    private Foo data;

    public FooBox(Foo data) {
        this.data = data;
    }

    public Foo getData() {
        return this.data;
    }
}
