package data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    private Vector<Integer> vector = new Vector<>();

    @Test
    void size() {
        assertEquals(0, vector.size());
        vector.push(1);
        assertEquals(1, vector.size());
    }

    @Test
    void capacity() {
        assertEquals(16, vector.capacity());
        vector = new Vector<>(32);
        assertEquals(32, vector.capacity());
    }

    @Test
    void isEmpty() {
        assertTrue(vector.isEmpty());
        vector.push(1);
        assertFalse(vector.isEmpty());
    }

    @Test
    void at() {
        vector.push(1);
        assertEquals(1, vector.at(0));
        assertThrows(IndexOutOfBoundsException.class, () -> vector.at(1));
    }

    @Test
    void push() {
        vector.push(1);
        assertEquals(1, vector.at(0));
        assertEquals(1, vector.size());
    }

    @Test
    void insert() {
        vector.push(1);
        vector.push(2);
        vector.insert(1, 3);
        assertEquals(3, vector.at(1));
        assertEquals(3, vector.size());
    }

    @Test
    void prepend() {
        vector.push(1);
        vector.prepend(2);
        assertEquals(2, vector.at(0));
        assertEquals(2, vector.size());
    }

    @Test
    void pop() {
        vector.push(1);
        vector.push(2);
        assertEquals(2, vector.pop());
        assertEquals(1, vector.size());
    }

    @Test
    void delete() {
        vector.push(1);
        vector.push(2);
        vector.delete(0);
        assertEquals(2, vector.at(0));
        assertEquals(1, vector.size());
    }

    @Test
    void remove() {
        vector.push(1);
        vector.push(2);
        vector.remove(2);
        assertEquals(-1, vector.find(2));
        assertEquals(1, vector.size());
    }

    @Test
    void find() {
        vector.push(1);
        vector.push(2);
        assertEquals(0, vector.find(1));
        assertEquals(-1, vector.find(3));
    }
}