import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    private CP3LinkedList<String> e;

    @BeforeEach
    void start() {
        e = new CP3LinkedList<>();
    }
    @Test
    void addFirst() {
        e.addFirst("John");
        assertEquals("John",e.getFirst());

        System.out.println(e.getFirst());
    }

    @Test
    void getFirst() {
        e.addFirst("John");
        assertEquals("John",e.getFirst());

        System.out.println(e.getFirst());
    }

    @Test
    void removeFirst() {
        e.addFirst("Bob");

        String element;
        element = e.removeFirst();

        assertEquals("Bob",element);
    }

    @Test
    void isEmpty() {
       assertTrue(e.isEmpty());

        System.out.println("Test Passed");
    }

    @Test
    void size() {
        e.addFirst("Bobby");

        e.addFirst("Timmy");

        assertEquals(2,e.size());
    }

    @Test
    void addLast() {
      e.addFirst("John");
      e.addFirst("Mark");
      e.addFirst("Paul");

      e.addLast("Steve");

      assertEquals("Steve",e.getLast());

      System.out.print(e.getLast());

    }

    @Test
    void getLast() {
        e.addFirst("John");
        e.addFirst("Mark");
        e.addFirst("Paul");
        e.addLast("Paul");

        assertEquals("Paul",e.getLast());

        System.out.print(e.getLast());
    }

    @Test
    void removeLast() {
        e.addFirst("John");
        e.addFirst("Mark");
        e.addFirst("Paul");
        e.addLast("Steve");


        String element;
        element = e.removeLast();

        assertEquals(null,element);
    }


}