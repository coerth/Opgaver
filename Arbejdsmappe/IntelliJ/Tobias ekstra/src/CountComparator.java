import java.util.Comparator;

public class CountComparator<T> implements Comparator<T>
{
    int count;
    Comparator<T> actual;

    public CountComparator(Comparator<T> actual) {
        this.actual = actual;
    }


    @Override
    public int compare(T o1, T o2) {
        count++;

        return actual.compare(o1, o2);
    }
}
