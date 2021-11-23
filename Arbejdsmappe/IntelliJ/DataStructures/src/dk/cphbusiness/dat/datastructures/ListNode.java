package dk.cphbusiness.dat.datastructures;

public interface ListNode {
    ListNode getNext();
    ListNode getPrev();
    void setNext(ListNode next);
    void setPrev(ListNode prev);
    int getValue();

}
