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
    }

    @Test
    void depthFirstTraversal() {
    }
}