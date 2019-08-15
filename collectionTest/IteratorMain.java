package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Demonstrates that while one is iterating over a collection,
 * one should not /modify/ the collection by another means than
 * the corresponding iterator.
 *
 * @author Carsten Fuhs
 */
public class IteratorMain {

    public static void main(String[] args) {

        // create an ArrayList of 2 elements
        ArrayList<String> container =
                new ArrayList<String>(Arrays.asList("A", "B"));

        System.out.println(container);

        // this iteration throws a ConcurrentModificationException
        // the second time we reach the loop header
        for (String s : container) {

            // modifies container -- after this instruction is performed, the
            // iteration over container cannot continue in a reasonable way
            container.add("C");

            // just printing container is ok, though
            System.out.println(container);
        }

        /* The above for-loop is compiled to essentially the same bytecode as
         * the following Java source code:
         *
         * Iterator<String> iter = container.iterator();
         * while (iter.hasNext()) {
         *     String s = iter.next();
         *     container.add("C");
         *     System.out.println(container);
         * }
         *
         * (before Java 5, people used to create a lot of explicit Iterator
         * objects like this; now they are created mostly "under the hood")
         */
    }
}
