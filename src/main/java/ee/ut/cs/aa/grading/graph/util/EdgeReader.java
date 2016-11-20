package ee.ut.cs.aa.grading.graph.util;

import java.io.IOException;

public interface EdgeReader {

    /**
     * Reads the graph as distributed in the lab and returns all its edges.
     * Presumes that the graph is on the classpath.
     *
     * @param name of the file from where to read triples
     * @return iterable collection of triples corresponding to edges
     */

    Iterable<Triple> fileFromClassPath(String name) throws IOException;

    /**
     * Reads the graph as distributed in the lab and returns all its edges.
     * Presumes that path is either an absolute path of a file or a relative path, starting from the location
     * where the application is ran from.
     *
     * @param path to the file to read the graph from
     * @return iterable collection of triples corresponding to edges
     */
    Iterable<Triple> fileFromFullPath(String path) throws IOException;


    /**
     * Reads the graph as distributed in the lab and returns all its edges.
     * Presumes that the file is in the default location, as on the repo.
     *
     * @return iterable collection of triples corresponding to edges
     */
    Iterable<Triple> fileFromDefaultLocation() throws IOException;

}
