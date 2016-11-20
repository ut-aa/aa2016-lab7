package ee.ut.cs.aa.grading.graph;

import java.util.Set;

/**
 * Interface for undirected graph
 */
public interface Graph<V, E> {
    /**
     * Adds vertex to the graph.
     * <p/>
     * Should not add the vertex to the graph if equal object is present.
     *
     * @param vertex Vertex to be added to the graph
     * @return Boolean value indicating if vertex was added
     */
    boolean addVertex(V vertex);

    /**
     * Removes vertex from the graph.
     *
     * @param vertex Vertex to be removed from the graph
     * @return Whether the vertex was removed
     */
    boolean removeVertex(V vertex);

    /**
     * Get all the vertices of the graph.
     *
     * @return Set of vertices
     */
    Set<V> getVertices();

    /**
     * Adds an edge given between the two vertices.
     * <p/>
     * Should not add edge if there is already one present.
     * Should not overwrite an edge.
     *
     * @param one   One endpoint of an edge
     * @param other Other endpoint of an edge
     * @param edge  Edge to be added
     * @return Whether adding edge was successful.
     */
    boolean addEdge(V one, V other, E edge);

    /**
     * Remove the edge between two vertices.
     *
     * @param one   One endpoint of the edge
     * @param other Other endpoint of the edge
     * @return True if an edge was removed, false otherwise.
     */
    boolean removeEdge(V one, V other);

    /**
     * Returns all the neighbors of a vertex. That is, all the vertices that this vertex is connected via an edge.
     *
     * @param vertex Vertex whose neighbors are returned
     * @return An set containing all the neighbors.
     */
    Set<V> neighborsOf(V vertex);

    /**
     * Return an edge between two vertices
     *
     * @param one   One endpoint of the edge
     * @param other Other endpoint of the edge
     * @return Edge if there is one between two vertices, null if there is not.
     */
    E getEdge(V one, V other);

}
