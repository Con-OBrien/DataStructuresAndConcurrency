import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    @Test
    void getFirst() {

    }

    @Test
    void addFirst() {

    }

    @Test
    void removeFirst() {

    }

    @Test
    void isEmpty() {
        CP3LinkedList<String> list = new CP3LinkedList<>();
        assertTrue(list.isEmpty());

        list.addFirst("Brad");
        assertFalse(list.isEmpty());
    }
}