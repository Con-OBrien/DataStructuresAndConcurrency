import java.util.NoSuchElementException;

public class CP3LinkedList<E> {
    private class Node {
        private E data;
        private Node next;

    }
    private Node first;
    private Node last;

    public CP3LinkedList() { first = null; last = null; }

    public void addFirst(E element) {
        Node newLink = new Node();
        newLink.data = element;
        newLink.next = first;
        first = newLink;
    }

    public E getFirst() {
        if(first == null)
            throw new NoSuchElementException();
        return  first.data;
    }

    public E removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        return element;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public int size() {
        int size = 0;
        Node current = first;

        while (current != null) {

            size++;
            current = current.next;
        }
        return size;
    }
    public void addLast(E element) {
        Node node = new Node();
        node.data = element;
        Node current = first;

        while(current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    public E getLast() {
        Node current = first;

        if(current == null)
             throw new NullPointerException();
        while(current.next != null)
        {
            current = current.next;
        }

        return current.data;

    }

    public E removeLast() {
        Node current = first;


        while(current.next != null)
        {
            current = current.next;
        }

      current.data = null;
        current.next = null;

        return current.data;
    }
}

