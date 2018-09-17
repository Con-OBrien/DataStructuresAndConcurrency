import java.util.NoSuchElementException;

public class CP3LinkedList<E> {
    private class Node {
        public E data;
        public Node next;
    }
    private Node first;

    public CP3LinkedList() {
        first = null;
    }
    public E getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public void addFirst(E element) {
        Node node = new Node();
        node.data = element;
        node.next = null;
            first = node;
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
}
