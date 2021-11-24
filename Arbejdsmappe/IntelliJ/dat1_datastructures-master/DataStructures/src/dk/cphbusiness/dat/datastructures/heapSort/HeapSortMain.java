package dk.cphbusiness.dat.datastructures.heapSort;

public class HeapSortMain {

    public static void main(String[] args) {

        int[] array = {2,6,9,11,14,1,5,13,3,12,7,4,10,8,15};

        HeapSort<Integer> hs = new HeapSort<Integer>(array);

        hs.sort();

        for(Integer i : array){
            System.out.println(i);
        }

    }


}
