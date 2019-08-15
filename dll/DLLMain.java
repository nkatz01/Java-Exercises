package dll;

/**
 * Uses some of the functionality of DoublyLinkedList.
 *
 * @author Carsten Fuhs
 */
public class DLLMain {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        System.out.println(dll + ".isEmpty(): " + dll.isEmpty());
        dll.addAtPosition(0, 2);
        dll.addAtPosition(1, 4);
        dll.addAtPosition(2, 5);
        dll.addAtPosition(1, 3);
        dll.addAtPosition(0, 1);
        System.out.println(dll + " has size " + dll.size());
        System.out.println(dll + ".isEmpty(): " + dll.isEmpty());
        dll.delete(4);
        System.out.println(dll + " has size " + dll.size());
        dll.delete(0);
        System.out.println(dll + " has size " + dll.size());
        dll.delete(1);
        System.out.println(dll + " has size " + dll.size());
        System.out.println(dll + ".isEmpty(): " + dll.isEmpty());
    }
}
