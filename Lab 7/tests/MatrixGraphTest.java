import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {

    private Graph graph;
    @Test
    void isEdge() {
    }
    @BeforeEach
    public void setUp() {
       graph = new MatrixGraph(5, false);
    }
    @Test
    void insert() {
        Edge edge = new Edge(2,3);
        graph.insert(edge);
        assertTrue(graph.isEdge(2,3));
    }

    @Test
    void remove() {
        Edge edge = new Edge(2,4);
        graph.insert(edge);
        graph.remove(edge);
        assertFalse(graph.isEdge(2,4));
    }

    @Test
    void breadthFirstTraversal() {
        Edge edge = new Edge(0,1);
        Edge edge2 = new Edge(1,3);
        Edge edge3 = new Edge(2,4);
        graph.insert(edge);
        graph.insert(edge2);
        graph.insert(edge3);


    }

    @Test
    void depthFirstTraversal() {
    }
}