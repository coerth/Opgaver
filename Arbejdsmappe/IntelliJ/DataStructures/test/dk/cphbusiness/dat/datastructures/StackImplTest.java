package dk.cphbusiness.dat.datastructures;

public class StackImplTest implements StackTest{
    @Override
    public Stack createNewStack() {
        return new StackImpl(new SimpleListImpl());
    }
}
