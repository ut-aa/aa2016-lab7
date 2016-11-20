package ee.ut.cs.aa.grading.dijkstra;

/**
 * Path implementation, using the idea from linked lists.
 */
public class Path<V> {

    public final V v;
    public final Path<V> next;

    public Path(V v, Path<V> next) {
        this.v = v;
        this.next = next;
    }

    @Override
    public String toString(){
        if (next == null){
            return v.toString();
        }
        return v.toString() + " --- " + next.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Path<?> path = (Path<?>) o;

        if (!v.equals(path.v)) return false;
        return !(next != null ? !next.equals(path.next) : path.next != null);

    }

    @Override
    public int hashCode() {
        int result = v.hashCode();
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
