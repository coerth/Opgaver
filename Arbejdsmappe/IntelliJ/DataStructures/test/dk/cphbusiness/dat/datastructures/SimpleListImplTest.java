package dk.cphbusiness.dat.datastructures;

public class SimpleListImplTest implements SimpleListTest{


    @Override
    public SimpleList createNewSimpleList() {
        return new SimpleListImpl();
    }
}
