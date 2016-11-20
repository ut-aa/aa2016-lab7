package ee.ut.cs.aa.grading.dijkstra;

import ee.ut.cs.aa.grading.graph.Cost;
import ee.ut.cs.aa.grading.graph.Graph;

import java.util.Map;

/**
 * Interface for finding shortest paths to all vertices from starting vertex v.
 */
public interface ShortestPathsFromVertex<V, E> {

    /**
     * Find shortest paths from vertex v to every other vertex.
     * Possible algorithms are Dijkstra, Bellman-Ford and Floyd-Warshall.
     *
     * @param graph          Graph to find the paths on
     * @param startingVertex The vertex from where the paths to every other vertex is found
     * @param costFunction   Function that assigns a cost to every edge of the graph
     * @return Map from vertices to Paths that maps vertex u to path from u to the starting vertex.
     */
    Map<V, Path<V>> getShortestPathsFromVertex(Graph<V, E> graph, V startingVertex, Cost<E> costFunction);

}
