import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Pair<String> p = new PairImpl<>("Første", "Sidste");
//
//        System.out.println(p.getFirst());
//        System.out.println(p.getLast());


        Integer[] array = {2,6,9,11,14,1,50,5,20,60,100,13,3,12,7,4,10,8,15,};

        HeapSort<Integer> hs = new HeapSort<Integer>(array, Comparator.naturalOrder());

        hs.sort();

        for(Integer i : array){
            System.out.println(i);
        }
    }
}
