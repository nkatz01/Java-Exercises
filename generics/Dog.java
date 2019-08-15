package generics;

/**
 * Dogs are Animals that can bark.
 *
 * @author Carsten Fuhs
 */
public class Dog extends Animal {

    /**
     * Creates a Dog called <code>name</code>.
     *
     * @param name the Dog's name, non-null
     */
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.print("Arf! ");
        bark();
    }

    /**
     * Barks on stdout.
     */
    public void bark() {
        System.out.println("Woof!");
    }
}
