import java.util.*;

public class HeapSort<T> {

    private T[] array;
    private Comparator<T> comparator;
    private int treeSize;

    public HeapSort(T[] array, Comparator<T> comparator) {
        this.array = array;
        this.treeSize = array.length;
        this.comparator = comparator;
    }

    public T[] sort(){

        if(array.length <= 1) return array;

        initialHeapify();

       while (treeSize > 0){
                   heapifyNode(0);
           swap(0, treeSize-1);
           treeSize--;
        }
       return array;
    }

    private void initialHeapify(){

        for(int i = treeSize/2 ; i >= 0; i--){ //behøves kun at køre på halvdelen da tæt på halvdelen vil være på laveste niveau

            heapifyNode(i);
        }
    }

    private void heapifyNode(int x){

        int left = (2*x+1 < treeSize) ? 2*x+1 : -1;
        if(left < 0){
            return;
        }
        int largest = left;

        int right = (2*x+2 < treeSize) ? 2*x+2 : -1;;
        if(right > 0 && comparator.compare(array[right],array[left] ) > 0){
            largest = right;
        }

        if(comparator.compare(array[largest],array[x]) > 0){
            swap(largest, x);
            heapifyNode(largest); // skal kaldes for at rykke den mindre værdi længere ned i systemet
        }
    }

    private void swap(int a, int b) {

        T tmp = array[a];
        array[a] =  array[b];
        array[b] = tmp;
    }
}
