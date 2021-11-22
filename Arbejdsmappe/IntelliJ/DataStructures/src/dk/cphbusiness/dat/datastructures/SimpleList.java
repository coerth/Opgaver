package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public interface SimpleList {
    int size();
    void addFront(int value);
    void addEnd(int value);
    int takeFront();
    int takeEnd();
}
