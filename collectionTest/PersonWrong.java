package collectionTest;

import java.util.HashSet;
import java.util.Set;

/**
 * This class demonstrates that if you override Object.equals(Object),
 * in general you also need to override Object.hashCode() so that
 * e.g. HashSets that store objects of this class behave as desired.
 *
 * @author Carsten Fuhs
 */
public class PersonWrong {
    private String name;
    private int age;

    public PersonWrong(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // override Object.equals(Object) based on the attributes
        if (! (o instanceof PersonWrong)) {
            return false;
        }
        PersonWrong other = (PersonWrong) o;
        if (this.age != other.age) {
            return false;
        }
        if (this.name == null) {
            return other.name == null;
        }
        return this.name.equals(other.name);
    }

    /* public int hashCode() has /not/ been overridden in this class although
     * public boolean equals(Object o) has been overridden (by breaking down
     * equality of PersonWrong to its attributes, which is a common way to
     * implement equals). This violates the contract of Object.hashCode()
     * mentioned in its javadoc documentation:
     *
     * http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--
     *
     * See also:
     *
     * http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
     *
     * | Note that it is generally necessary to override the hashCode method
     * | whenever this method is overridden, so as to maintain the general
     * | contract for the hashCode method, which states that equal objects
     * | must have equal hash codes.
     */

    @Override
    public String toString() {
        return "(" + this.name + "," + this.age + ")";
    }

    public static void containsIssue() {
        String name = "John Doe";
        PersonWrong p1 = new PersonWrong(name, 30);
        PersonWrong p2 = new PersonWrong(name, 30);
        // p1 and p2 are not the same ...
        System.out.println(p1 + " == " + p2 + "? " + (p1 == p2));
        // ... but equal:
        System.out.println(p1 + " equals " + p2 + "? " + p1.equals(p2));

        Set<PersonWrong> personSet = new HashSet<PersonWrong>();
        personSet.add(p1);
        System.out.println(personSet + " contains " + p1 +
                           "? " + personSet.contains(p1));

        // The expected answer is 'true', but 'public int hashCode()'
        // for class PersonWrong is /not/ consistent with
        // 'public boolean equals(Object)'. This leads to the answer
        // 'false', even though personSet does contain an object that
        // is equal to p2.
        System.out.println(personSet + " contains " + p2 +
                           "? " + personSet.contains(p2));
    }

    public static void main(String[] args) {
        containsIssue();
    }
}
