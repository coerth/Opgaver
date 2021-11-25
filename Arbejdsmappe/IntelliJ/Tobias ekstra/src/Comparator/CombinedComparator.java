package Comparator;

import java.util.Comparator;
import java.util.List;

public class CombinedComparator<T> implements Comparator<T> {

    private List<Comparator<T>> list;

    public CombinedComparator(List<Comparator<T>> list) {
        if(list == null || list.size() < 1){
            throw new IllegalArgumentException("The list must have at least one comparator!");
        }

        this.list = list;
    }


    @Override
    public int compare(T o1, T o2) {
        int c = 0;
        for(Comparator<T> comp : list){
            if(c != 0) return c;
        }
        return c;
    }
}
