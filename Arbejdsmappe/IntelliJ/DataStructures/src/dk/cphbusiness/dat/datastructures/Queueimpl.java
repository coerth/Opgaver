package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public class Queueimpl implements Queue {
    private SimpleList list;

    public Queueimpl(SimpleList list) {

        this.list = list;
    }


    @Override
    public int size() {

        return list.size();
    }

    @Override
    public void enqueue(int value) {
        list.addEnd(value);
    }

    @Override
    public int dequeue(){
        int value = list.takeFront();
        return value;
    }
}
