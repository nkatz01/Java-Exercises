package generics;

/**
 * Cats are Animals that may or may not be happy.
 *
 * @author Carsten Fuhs
 */
public class Cat extends Animal {
    /** state: Is this Cat happy at the moment? */
    private boolean happy;

    /**
     * Creates a happy Cat called <code>name</code>.
     *
     * @param name the Cat's name, non-null
     */
    public Cat(String name) {
        this(name, true);
    }

    /**
     * Creates a Cat called <code>name</code> with happiness state
     * <code>happy</code>.
     *
     * @param name the Cat's name, non-null
     * @param happy whether this Cat is initially happy
     */
    public Cat(String name, boolean happy) {
        super(name);
        this.happy = happy;
    }

    @Override
    public void makeNoise() {
        if (this.happy) {
            System.out.println("Purr!");
        } else {
            System.out.println("Meeouw!");
        }
    }

    /**
     * @return the happy
     */
    public boolean isHappy() {
        return this.happy;
    }

    /**
     * @param happy the happy to set
     */
    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
