package user;

import java.util.Comparator;
import java.util.List;

public class CombinedComparator<T> implements Comparator<T>{

    private List<Comparator<T>> list;

    public CombinedComparator(List<Comparator<T>> list) {
        this.list = list;
    }

    @Override
    public int compare(T o1, T o2) {
        int c = 0;
        for(Comparator<T> comp : list){
            c = comp.compare(o1,o2);
            if(c != 0){
                return c;
            }
        }
        return c;
    }
}
