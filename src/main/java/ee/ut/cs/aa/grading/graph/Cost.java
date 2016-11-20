package ee.ut.cs.aa.grading.graph;

/**
 * Interface for cost function.
 */
public interface Cost<E> {

    /**
     *
     * Cost function
     *
     * @param edge for what cost is returned
     * @return cost of the edge
     */
    double cost(E edge);
}
