public class BinarySearchTree<E extends Comparable<E>> {
    private class Node
    {
        public E data;
        public Node left;
        public Node right;
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;

    if (root == null) {
        root = newNode;
    }
    else {
        insertSub(root, newNode);
    }
    }
    private void insertSub(Node node, Node newNode) {
        int result = node.data.compareTo(newNode.data);


        if (result > 0) {
            //go left( allowing duplicates to go left)
            if (node.left == null) {
                node.left = newNode;
            }
            else {
                insertSub(node.left, newNode);
            }
        }
        else {
            if (node.right == null) {
                node.right = newNode;
            }
            else {
                insertSub(node.right, newNode);
            }
        }
    }



}
