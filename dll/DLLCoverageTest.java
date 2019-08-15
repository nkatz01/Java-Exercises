package dll;

import static org.junit.Assert.*;

import org.junit.Test;

import dll.DoublyLinkedList;

/**
 * A set of test cases for the class DoublyLinkedList, trying to achieve
 * test coverage for DoublyLinkedList.
 *
 * @author Carsten Fuhs
 */
public class DLLCoverageTest {
    // some pairwise different integer values
    private static int SOME_INT = 42;
    private static int SOME_INT_2 = -9;
    private static int SOME_INT_3 = 16;

    /**
     * Helper function used by several test cases to generate a list
     * of 1 element.
     *
     * @return a list [value]
     */
    private static DoublyLinkedList<Integer> buildIntegerDLLSize1(int value) {
        DoublyLinkedList<Integer> res = new DoublyLinkedList<>();
        res.addAtPosition(0, value);
        return res;
    }

    /**
     * Helper function used by several test cases to generate a list
     * of 2 elements.
     *
     * @return a list [v1, v2]
     */
    private static DoublyLinkedList<Integer> buildIntegerDLLSize2(int v1, int v2) {
        DoublyLinkedList<Integer> res = new DoublyLinkedList<>();
        res.addAtPosition(0, v1);
        res.addAtPosition(1, v2);
        return res;
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_addAtPosition_indexNegative_1() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        empty.addAtPosition(-1, SOME_INT);
    }

    @Test
    public void test_addAtPosition_empty_index0_2() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        empty.addAtPosition(0, SOME_INT);
        int value = empty.get(0);
        assertEquals(SOME_INT, value);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void test_addAtPosition_empty_indexPositive_3() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        empty.addAtPosition(7, SOME_INT);
    }

    @Test
    public void test_addAtPosition_nonEmpty_index0_4() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT);
        list.addAtPosition(0, SOME_INT_2);
        int value = list.get(0);
        assertEquals(SOME_INT_2, value);
    }

    @Test
    public void test_addAtPosition_nonEmpty_index0_5() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT);
        list.addAtPosition(0, SOME_INT_2);
        int value = list.get(1);
        assertEquals(SOME_INT, value);
    }

    @Test
    public void test_addAtPosition_nonEmpty_indexPositive_end_6() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT);
        list.addAtPosition(1, SOME_INT_2);
        int value = list.get(1);
        assertEquals(SOME_INT_2, value);
    }

    @Test
    public void test_addAtPosition_nonEmpty_indexPositive_middle_7() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.addAtPosition(1, SOME_INT_3);
        int value = list.get(1);
        assertEquals(SOME_INT_3, value);
    }

    @Test
    public void test_addAtPosition_nonEmpty_indexPositive_middle_8() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.addAtPosition(1, SOME_INT_3);
        int value = list.get(2);
        assertEquals(SOME_INT_2, value);
    }

    @Test
    public void test_addAtPosition_nonEmpty_indexPositive_middle_9() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.addAtPosition(1, SOME_INT_3);
        int value = list.get(0);
        assertEquals(SOME_INT, value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_addAtPosition_nonEmpty_indexTooLarge_10() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.addAtPosition(10, SOME_INT_3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_get_indexNegative_11() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.get(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_get_empty_12() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.get(1);
    }

    @Test
    public void test_isEmpty_true_13() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        assertTrue(empty.isEmpty());
    }

    @Test
    public void test_isEmpty_false_14() {
        DoublyLinkedList<Integer> nonEmpty = buildIntegerDLLSize1(SOME_INT);
        assertFalse(nonEmpty.isEmpty());
    }

    @Test
    public void test_size_0_15() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        assertEquals(0, empty.size());
    }

    @Test
    public void test_size_1_16() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT_3);
        assertEquals(1, list.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_delete_indexNegative_17() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT_3);
        list.delete(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_delete_empty_18() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        empty.delete(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_delete_indexTooLarge_19() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        list.delete(20);
    }
    
    @Test
    public void test_delete_singletonList_20() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT_3);
        list.delete(0);
        assertEquals(0, list.size());
    }

    @Test
    public void test_delete_doubletonList_first_size_21() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.delete(0);
        assertEquals(1, list.size());
    }

    @Test
    public void test_delete_doubletonList_first_element_22() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.delete(0);
        int value = list.get(0);
        assertEquals(SOME_INT_3, value);
    }

    @Test
    public void test_delete_doubletonList_last_size_23() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.delete(1);
        assertEquals(1, list.size());
    }
    
    @Test
    public void test_delete_doubletonList_last_element_24() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.delete(1);
        int value = list.get(0);
        assertEquals(SOME_INT_2, value);
    }

    @Test
    public void test_delete_largeList_middle_size_25() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.addAtPosition(2, SOME_INT);
        list.delete(1);
        assertEquals(2, list.size());
    }

    @Test
    public void test_delete_largeList_middle_element_26() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.addAtPosition(2, SOME_INT);
        list.delete(1);
        int value = list.get(0);
        assertEquals(SOME_INT_2, value);
    }

    @Test
    public void test_delete_largeList_middle_element_27() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT_2, SOME_INT_3);
        list.addAtPosition(2, SOME_INT);
        list.delete(1);
        int value = list.get(1);
        assertEquals(SOME_INT, value);
    }

    // Note that in the next three test cases for toString(), we compare
    // String objects and not primitive types, so we need assertEquals
    // instead of assertSame.

    @Test
    public void test_toString_empty_28() {
        DoublyLinkedList<Integer> empty = new DoublyLinkedList<>();
        assertEquals("[]", empty.toString());
    }

    @Test
    public void test_toString_singletonList_29() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize1(SOME_INT);
        assertEquals("[" + SOME_INT + "]", list.toString());
    }

    @Test
    public void test_toString_doubletonList_30() {
        DoublyLinkedList<Integer> list = buildIntegerDLLSize2(SOME_INT, SOME_INT_2);
        assertEquals("[" + SOME_INT + "," + SOME_INT_2 + "]", list.toString());
    }
}
