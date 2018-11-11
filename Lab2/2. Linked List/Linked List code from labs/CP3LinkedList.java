// code developed in Lab 1 - 9am group
import java.util.NoSuchElementException;

public class CP3LinkedList<E> {

    private class Node {
        public  E data;
        public Node next;

    }

    private Node first;

    public CP3LinkedList(){
        first = null;
    }

    public void addFirst(E element){
        Node node = new Node();
        node.data = element;
//        if (first == null){
//
//            node.next = null;
//        }
//        else {
//            node.next = first;
//
//        }
        node.next = first;
        first = node;
    }

    public E  getFirst(){
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public E  removeFirst(){
        if (first == null)
            throw new NoSuchElementException();
        E element = first.data;
        first = first.next;
        return element;
    }

    public boolean isEmpty(){
//        if (first == null)
////            return true;
////        else return false;
        return first == null;
    }



}
