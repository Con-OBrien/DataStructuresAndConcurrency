import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    CP3LinkedList e;
    @Test
    void getFirst() {
        e.addFirst("Bob");
        assertEquals("Bob", e.getFirst());
    }
    @BeforeEach
    void start() {
        e = new CP3LinkedList();
    }
    @Test
    void addFirst() {
        e.addFirst("Bob");
        assertEquals("Bob",e.getFirst());
    }

    @Test
    void removeFirst() {
        e.addFirst("John");
        assertEquals("John",e.removeFirst());
    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> list = new CP3LinkedList<>();
        assertTrue(list.isEmpty());

        list.addFirst("Brad");
        assertFalse(list.isEmpty());
    }


    @Test
    void isSizeEmpty() {

    }
}