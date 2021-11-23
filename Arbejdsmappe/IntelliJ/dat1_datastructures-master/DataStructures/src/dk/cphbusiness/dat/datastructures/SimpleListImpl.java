package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public class SimpleListImpl implements  SimpleList {

    private ListNode first;
    private ListNode last;
    private int size;

    public SimpleListImpl() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        if(size == 0){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.setNext(first);
            first.setPrevious(newNode);
            first = newNode;
        }
        size++;
    }

    @Override
    public void addLast(int value) {
        ListNode newNode = new ListNode(value);
        if(size == 0){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public int takeFirst() {
        if(size == 0){
            throw new NoSuchElementException("This list is empty");
        }

        int result = first.getValue();
        first = first.getNext();
        if(first == null){
            last = null;
        }
        else {
            first.setPrevious(null);
        }
        size--;

        return result;
    }

    @Override
    public int takeLast() {
        if(size == 0){
            throw new NoSuchElementException("This list is empty");
        }

        int result = last.getValue();
        last = last.getPrevious();
        if(last == null){
            first = null;
        }
        else {
            last.setNext(null);
        }

        size--;
        return result;
    }
}
