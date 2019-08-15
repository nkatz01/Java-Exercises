package dll;

import dll.DoublyLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class DLLTest {

    /**
     * @return a DLL which should be [1,2,3,4,5]
     */
    private static DoublyLinkedList<Integer> buildIntegerDLL() {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addAtPosition(0, 2);
        dll.addAtPosition(1, 4);
        dll.addAtPosition(2, 5);
        dll.addAtPosition(1, 3);
        dll.addAtPosition(0, 1);
        return dll;
    }

    @Test
    public void test1() {
        DoublyLinkedList<Integer> dll = buildIntegerDLL();
        int value = dll.get(0);
        Assert.assertEquals(1, value);
    }

    @Test
    public void test2() {
        DoublyLinkedList<Integer> dll = buildIntegerDLL();
        Assert.assertEquals(5, dll.size());
    }
}
