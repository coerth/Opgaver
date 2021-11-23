package dk.cphbusiness.dat.datastructures;

public class ListNode {
    private final int value;
    private ListNode previous;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
