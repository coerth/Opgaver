package dk.cphbusiness.dat.datastructures;

public class ListNodeImpl implements ListNode{
    private ListNode prev;
    private ListNode next;
    private int value;

    public ListNodeImpl(ListNode prev, ListNode next, int value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    @Override
    public ListNode getNext() {
        return this.next;
    }

    @Override
    public ListNode getPrev() {
        return this.prev;
    }

    @Override
    public void setNext(ListNode next) {
    this.next = next;
    }

    @Override
    public void setPrev(ListNode prev) {
    this.prev = prev;
    }

    @Override
    public int getValue() {
        return value;
    }
}
