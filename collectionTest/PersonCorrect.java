package collectionTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * This class correctly overrides both Object.equals(Object) and
 * Object.hashCode() in a consistent way: Whenever two objects
 * of this class are equal, they also have the same hash code.
 *
 * The method containsIssue shows that a HashSet which contains some object
 * o1 of this class will also report that it contains an /equal/ object o2 of
 * this class (that is, o1.equals(o2) returns true). This is the case even
 * though o1 and o2 are not the /same/ object (that is, o1 == o2 returns false).
 *
 * The method orderIssue shows that the order of iteration over a HashSet
 * is in general chaotic, i.e., it does not necessarily correspond to the
 * order in which the elements were inserted (or any other order). In contrast,
 * a LinkedHashSet guarantees that the iteration order is the same order as
 * the order in which the elements were inserted for the first time.
 *
 * @author Carsten Fuhs
 */
public class PersonCorrect {
    private String name;
    private int age;

    public PersonCorrect(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (! (o instanceof PersonCorrect)) {
            return false;
        }
        PersonCorrect other = (PersonCorrect) o;
        if (this.age != other.age) {
            return false;
        }
        if (this.name == null) {
            return other.name == null;
        }
        return this.name.equals(other.name);
    }
    
    @Override
    public int hashCode() {
        // As we have overridden Object.equals(Object), we also override
        // Object.hashCode() in such a way that whenever two objects are
        // equal, they also have the same hash code. This is required by
        // the contract of Object.hashCode() that is stated in its javadoc
        // documentation:

        // We can use the static method Objects.hash as a helper to get a good
        // implementation of hashCode() in our classes based on the same
        // attributes that we also use for equals(Object). The method is
        // null-tolerant, i.e., we are also allowed to pass references to it
        // that may be null, and it will not crash. See also:
        //
        // http://docs.oracle.com/javase/8/docs/api/java/util/Objects.html#hash-java.lang.Object...-
        return Objects.hash(this.name, this.age);
    }
    

    @Override
    public String toString() {
        return "(" + this.name + "," + this.age + ")";
    }

    public static void containsIssue() {
        String name = "John Doe";
        PersonCorrect p1 = new PersonCorrect(name, 30);
        PersonCorrect p2 = new PersonCorrect(name, 30);
        // p1 and p2 are not the same ...
        System.out.println(p1 + " == " + p2 + "? " + (p1 == p2));
        // ... but equal:
        System.out.println(p1 + " equals " + p2 + "? " + p1.equals(p2));

        Set<PersonCorrect> personSet = new HashSet<PersonCorrect>();
        personSet.add(p1);

        System.out.println(personSet + " contains " + p1 +
                           "? " + personSet.contains(p1));

        // in this class the answer is true, as expected
        System.out.println(personSet + " contains " + p2 +
                           "? " + personSet.contains(p2));
    }

    public static void orderIssue() {
        // persons contains 7 objects with names in alphabetic order
        // (to make seeing the expected order easier for us)
        PersonCorrect[] persons = {
            new PersonCorrect("A", 32), new PersonCorrect("B", 17),
            new PersonCorrect("C", 8), new PersonCorrect("D", 2),
            new PersonCorrect("E", 2), new PersonCorrect("F", 49),
            new PersonCorrect("G", 7)
        };

        // we consider two different implementations of the Set interface ...
        Set<PersonCorrect> hashSet = new HashSet<>();
        Set<PersonCorrect> linkedHashSet = new LinkedHashSet<>();

        // insert the elements in the same order into both Sets
        for (PersonCorrect p : persons) {
            hashSet.add(p);
            linkedHashSet.add(p);
        }

        // iteration over the HashSet (in its toString() method) has
        // a surprising order
        System.out.println("HashSet:       " + hashSet);

        // iteration over the LinkedHashSet has the order in which
        // the elements were inserted
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }

    public static void main(String[] args) {
        containsIssue();
        orderIssue();
    }
}
