package generics;

/**
 * Abstract superclass for Animals.
 *
 * @author Carsten Fuhs
 */
public abstract class Animal {
    /** The Animal's name (non-null). */
    private String name;

    /**
     * Creates a new Animal whose name is <code>name</code>.
     *
     * @param name the new Animal's name; must not be null
     */
    public Animal(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Please supply a name!");
        }
        this.name = name;
    }

    /**
     * Make noise, in a species-specific way.
     */
    public abstract void makeNoise();

    /**
     * @return a String representation of this Pet
     */
    @Override
    public String toString() {
        return this.name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set; non-null
     */
    public void setName(String name) {
        this.name = name;
    }
}
