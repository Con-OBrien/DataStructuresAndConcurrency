import java.util.LinkedList;

/*****************************************************
*    Title: MatrixGraph.java
*    Author: Koffman and Wolfgang
*    Site owner/sponsor: wiley.com
*    Date: 21/04/2010
*    Code version:
*    Availability: http://eu.wiley.com/WileyCDA/WileyTitle/productCd-EHEP001607.html(Accessed November 2014)- Only available to Instructors
*    Modified:  No
*****************************************************/

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    private int numVertices;
    private double[][] matrix;
    private LinkedList<Integer> adj[];
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        //complete this method
        if(matrix[source][dest] == 1.0) {
            return true;
        }
            return false;
    }

    public void insert(Edge edge) {
        //complete this method
        // if graph is undirected, insert two edges
        // otherwise, insert just one edge

           matrix[edge.getSource()][edge.getDestination()] = 1.0;

       if(!isDirected()) {
           matrix[edge.getDestination()][edge.getSource()] = 1.0;
       }

    }

    public void remove(Edge edge) {
        //complete this method
        // as for insert method
        matrix[edge.getSource()][edge.getDestination()] = 0.0;

        if(!isDirected()) {
            matrix[edge.getDestination()][edge.getSource()] = 0.0;
        }
    }
    
    public void breadthFirstTraversal(int start){
	//Output the vertices in breadth first order
        {
            // Mark all the vertices as not visited
            boolean visited[] = new boolean[numVertices];

            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[start]=true;
            queue.add(start);

        }
    }
    
    public void depthFirstTraversal(int start){
        //Output the vertices in depth first order
    }    
}
