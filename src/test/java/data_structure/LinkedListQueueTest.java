package data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListQueueTest {

    LinkedListQueue<Integer> queue = new LinkedListQueue<>();

    @Test
    void enqueueTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.size());
        assertEquals(1,queue.popFront());
        assertEquals(3,queue.popBack());
    }

    @Test
    void dequeueTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int value = queue.dequeue();
        assertEquals(1, value);
        assertEquals(2, queue.size());

        value = queue.dequeue();
        assertEquals(2, value);
        assertEquals(1, queue.size());
    }

    @Test
    void emptyTest() {
        assertTrue(queue.empty());

        queue.enqueue(1);
        assertFalse(queue.empty());

        queue.dequeue();
        assertTrue(queue.empty());
    }
}