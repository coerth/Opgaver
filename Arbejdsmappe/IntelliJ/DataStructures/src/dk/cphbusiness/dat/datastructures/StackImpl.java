package dk.cphbusiness.dat.datastructures;

public class StackImpl implements Stack {
    private SimpleList list;

    public StackImpl(SimpleList list) {
        this.list = list;
    }


    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(int value) {
    list.addFront(value);
    }

    @Override
    public int pop() {
        int value = list.takeFront();
        return value;
    }
}
