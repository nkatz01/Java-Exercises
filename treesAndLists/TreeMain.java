package treesAndLists;

import java.util.Arrays;

/**
 * Uses some of the functionalities of the Tree<T> data structure.
 *
 * @author Carsten Fuhs
 */
public class TreeMain {
    public static Tree<Integer> makeExampleTree() {
        Node<Integer> root =
            new Node<>(12,
                       new Node<>(42, null, null),
                       new Node<>(15,
                                  new Node<>(80, null, null),
                                  null));

        return new Tree<Integer>(root);
    }

    public static void main(String[] args) {
        Tree<Integer> tree = makeExampleTree();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
        System.out.println();
        tree.preOrderLoop();
        System.out.println();

        /*
        final int NUMBER_OF_POS = 4;
        Position[] pos = new Position[NUMBER_OF_POS];
        pos[0] = new Position(Arrays.asList(Direction.RIGHT, Direction.LEFT));
        pos[1] = new Position(Arrays.asList(Direction.LEFT));
        pos[2] = new Position();
        pos[3] = new Position(Arrays.asList(Direction.RIGHT));

        Tree<Integer> tree = new Tree<>();
        tree.addAtPosition(pos[0], 1);
        tree.addAtPosition(pos[1], 2);
        tree.addAtPosition(pos[0], 3);
        tree.addAtPosition(pos[0], 4);
        tree.addAtPosition(pos[0], 5);
        System.out.println("Tree: " + tree);
        System.out.println("Size: " + tree.size());
        for (int i = 0; i < NUMBER_OF_POS; i++) {
            System.out.println("Value at position " + pos[i] + ": " + tree.get(pos[i]));
        }
        */
    }
}
