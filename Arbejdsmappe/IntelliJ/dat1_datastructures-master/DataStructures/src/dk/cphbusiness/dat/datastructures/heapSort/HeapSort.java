package dk.cphbusiness.dat.datastructures.heapSort;
import java.util.*;

public class HeapSort<T> {

    private int[] array;
    //private Comparator<T> comparator;
    private int treeSize;

    public HeapSort(int[] array) {
        this.array = array;
        this.treeSize = array.length;
        //this.comparator = comparator;
    }

    private  int leftChild(int x){
        int res = 2*x+1;
        return (res < treeSize) ? res : -1;
    }

    private  int rightChild(int x){
        int res = 2*x+2;
        return (res < treeSize) ? res : -1;
    }

    public void sort(){
        initialHeapify();

        while (treeSize > 0){
            heapifyNode(0);
            swap(0, treeSize-1);
            treeSize--;
        }
    }

    private void initialHeapify(){

        for(int i = treeSize/2 ; i >= 0; i--){ //behøves kun at køre på halvdelen da tæt på halvdelen vil være på laveste niveau

            heapifyNode(i);
        }
    }

    private void heapifyNode(int x){

        int left = leftChild(x);
        if(left < 0){
            return;
        }
        int largestChild = left;

        int right = rightChild(x);
        if(right > 0 && array[right] > array[left]){
        //if(right > 0 && comparator.compare(array[right],array[left] ) > 0){
            largestChild = right;
        }

        if(array[largestChild] > array[x]){
        //if(comparator.compare(array[largestChild],array[x]) > 0){
            swap(largestChild, x);
            heapifyNode(largestChild); // skal kaldes for at rykke den mindre værdi længere ned i systemet

        }

    }

    private void swap(int a, int b) {

        int tmp = array[a];
        array[a] =  array[b];
        array[b] = tmp;
    }


}
