package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public interface Queue {
    int size();
    void enqueue(int value);
    int dequeue();
}
