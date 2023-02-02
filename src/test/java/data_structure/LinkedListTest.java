package data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testSize() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());

        list.pushFront(10);
        list.pushFront(20);
        assertEquals(2, list.size());
    }

    @Test
    void testPushFront() {
        LinkedList list = new LinkedList();
        list.pushFront(10);
        list.pushFront(20);
        assertEquals(20, list.valueAt(0));
        assertEquals(10, list.valueAt(1));
    }

    @Test
    void testPopFront() {
        LinkedList list = new LinkedList();
        list.pushFront(10);
        list.pushFront(20);
        assertEquals(20, list.popFront());
    }

    @Test
    void testPushBack() {
        LinkedList<Integer> list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        System.out.println(list.valueAt(0));
        assertEquals(10, list.valueAt(0));
        assertEquals(20, list.valueAt(1));
    }

    @Test
    void testPopBack() {
        LinkedList list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        assertEquals(20, list.popBack());
    }

    @Test
    void testFront() {
        LinkedList list = new LinkedList();
        list.pushFront(10);
        list.pushFront(20);
        assertEquals(20, list.front());
    }

    @Test
    void testBack() {
        LinkedList list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        assertEquals(20, list.back());
    }

    @Test
    void testInsert() {
        LinkedList list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        list.insert(1, 15);
        assertEquals(15, list.valueAt(1));
    }

    @Test
    void testErase() {
        LinkedList list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        list.erase(0);
        assertEquals(20, list.valueAt(0));
    }

    @Test
    void testValueNFromEnd() {
        LinkedList list = new LinkedList();
        list.pushBack(10);
        list.pushBack(20);
        assertEquals(10, list.valueNFromEnd(1));
    }

    @Test
    public void reverse() {
        LinkedList<Integer> list = new LinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);

        list.reverse();

        assertEquals(4, list.popFront());
        assertEquals(3, list.popFront());
        assertEquals(2, list.popFront());
        assertEquals(1, list.popFront());
    }

    @Test
    public void testRemoveValue() {
        LinkedList list = new LinkedList();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        list.pushBack(4);

        assertEquals(2, list.removeValue(3));
        assertEquals(4, list.valueAt(2));
    }
}