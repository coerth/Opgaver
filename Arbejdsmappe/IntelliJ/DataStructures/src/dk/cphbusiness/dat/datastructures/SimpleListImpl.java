package dk.cphbusiness.dat.datastructures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SimpleListImpl implements SimpleList {
    ArrayList<Integer> list = new ArrayList<>();


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void addFront(int value) {
        list.add(value);

    }

    @Override
    public void addEnd(int value) {
        list.add(0,value);

    }

    @Override
    public int takeFront() {
        int value = 0;
        if(list.size() == 0){
            throw new NoSuchElementException();
        }
        try {
           value = list.get(list.size() - 1);
            list.remove(list.size() - 1);

        }
        catch (NoSuchElementException e){
            System.out.println(e);
        }
        return value;
    }

    @Override
    public int takeEnd() {
        int value = 0;

        if(list.size() == 0){
            throw new NoSuchElementException();
        }
        try {
             value = list.get(0);
             list.remove(0);
        }
        catch (NoSuchElementException e){
            System.out.println(e);
        }
        return value;
    }
}
