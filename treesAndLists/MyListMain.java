package treesAndLists;

import java.util.ArrayList;

/**
 * Tests some functionality of the class MyList<T>.
 *
 * @author Carsten Fuhs
 */
public class MyListMain {
    public static void recursiveTest() {
        System.out.println("*** Recursive ***");
        MyList<Integer> xs = new MyList<Integer>();
        System.out.println(xs);

        System.out.println("Size: " + xs.size());
        System.out.println("IsEmpty: " + xs.isEmpty());

        xs.add(0, 20);
        System.out.println("Added 20 at 0, got: " + xs);
        xs.add(1, 21);
        System.out.println("Added 21 at 1, got: " + xs);
        xs.add(0, 22);
        System.out.println("Added 22 at 0, got: " + xs);
        xs.add(2, 23);
        System.out.println("Added 23 at 2, got: " + xs);
        xs.add(0, 24);
        System.out.println("Added 24 at 0, got: " + xs);
        xs.set(4, 25);
        System.out.println("Set 25 at 4, got: " + xs);
        
        System.out.println("Size: " + xs.size());
        System.out.println("IsEmpty: " + xs.isEmpty());

        System.out.println("Contains 22: " + xs.contains(22));
        System.out.println("Contains 70: " + xs.contains(70));

        System.out.println("Get from index 0: " + xs.get(0));
        System.out.println("Get from index 2: " + xs.get(2));

        xs.remove(0);
        System.out.println("Removed at 0: " + xs);
        xs.add(0, 26);
        System.out.println("Added 26 at 0, got: " + xs);
        xs.remove(1);
        System.out.println("Removed at 1: " + xs);

        MyList<Integer> ys = new MyList<Integer>(xs);

        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);

        xs.remove(0);
        System.out.println("Removed in xs at 0!");
        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);

        ys.remove(1);
        System.out.println("Removed in ys at 1!");
        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);
    }

    public static void loopTest() {
        System.out.println("*** Loop ***");
        MyList<Integer> xs = new MyList<Integer>();
        System.out.println(xs);

        System.out.println("Size: " + xs.sizeLoop());
        System.out.println("IsEmpty: " + xs.isEmpty());

        xs.addLoop(0, 20);
        System.out.println("Added 20 at 0, got: " + xs);
        xs.addLoop(1, 21);
        System.out.println("Added 21 at 1, got: " + xs);
        xs.addLoop(0, 22);
        System.out.println("Added 22 at 0, got: " + xs);
        xs.addLoop(2, 23);
        System.out.println("Added 23 at 2, got: " + xs);
        xs.addLoop(0, 24);
        System.out.println("Added 24 at 0, got: " + xs);
        xs.setLoop(4, 25);
        System.out.println("Set 25 at 4, got: " + xs);
        
        System.out.println("Size: " + xs.sizeLoop());
        System.out.println("IsEmpty: " + xs.isEmpty());

        System.out.println("Contains 22: " + xs.containsLoop(22));
        System.out.println("Contains 70: " + xs.containsLoop(70));

        System.out.println("Get from index 0: " + xs.getLoop(0));
        System.out.println("Get from index 2: " + xs.getLoop(2));

        xs.removeLoop(0);
        System.out.println("Removed at 0: " + xs);
        xs.addLoop(0, 26);
        System.out.println("Added 26 at 0, got: " + xs);
        xs.removeLoop(1);
        System.out.println("Removed at 1: " + xs);

        MyList<Integer> ys = new MyList<Integer>(xs);

        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);

        xs.removeLoop(0);
        System.out.println("Removed in xs at 0!");
        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);

        ys.removeLoop(1);
        System.out.println("Removed in ys at 1!");
        System.out.println("xs: " + xs);
        System.out.println("ys: " + ys);
    }

    public static void recursiveStressTest(int limit) {
        MyList<Integer> xs = new MyList<Integer>();
        for (int i = 0; i < limit; i++) {
            xs.add(0, i);
        }
        xs.get(limit - 1);
    }

    public static void loopStressTest(int limit) {
        MyList<Integer> xs = new MyList<Integer>();
        for (int i = 0; i < limit; i++) {
            xs.addLoop(0, i);
        }
        xs.getLoop(limit - 1);
    }

    public static void main(String[] args) {
        recursiveTest();
        loopTest();
        final int LIMIT = 20000;
        loopStressTest(LIMIT);
        recursiveStressTest(LIMIT);
    }
}
