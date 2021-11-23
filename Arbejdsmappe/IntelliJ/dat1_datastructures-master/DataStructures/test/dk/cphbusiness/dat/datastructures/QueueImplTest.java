package dk.cphbusiness.dat.datastructures;

public class QueueImplTest implements QueueTest{

    @Override
    public Queue createNewQueue() {
        return new QueueImpl(new SimpleListImpl());
    }
}
