package generics;

public class FancyMathBox<T extends Number> extends Box<Number> {
    public FancyMathBox(T data) {
        super(data);
    }

    public double sqrt() { // uses doubleValue() from Number
        Number data = this.getData();
        double val = data.doubleValue();
        return Math.sqrt(val);
    }
}
