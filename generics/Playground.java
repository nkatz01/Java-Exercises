package generics;

/**
 * Class to play with a few concepts ...
 *
 * @author Carsten Fuhs
 */
public class Playground {
    public static void main(String[] args) {
        Box<? extends Animal> aBox = new Box<Cat>(new Cat("Schroedinger"));
        Animal a = aBox.getData();
        //aBox.setData(new Dog("Fido"));
        //aBox.setData(new Cat("Tiger"));
        FancyMathBox<Integer> mBox = new FancyMathBox<Integer>(123);
        Box<Number> nBox = mBox;
        nBox.setData(1.5);
        mBox.setData(2.5);
        // what?! ... right, MathBox<Integer> is a subclass of Box<Number>

        //int x = mBox.getData(); // getData() returns Number, not Integer
    }
}
