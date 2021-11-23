public class PairImpl<T> implements Pair<T>{
   private final T first;
   private final T last;

    public PairImpl(T first, T last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public T getLast() {
        return last;
    }
}
