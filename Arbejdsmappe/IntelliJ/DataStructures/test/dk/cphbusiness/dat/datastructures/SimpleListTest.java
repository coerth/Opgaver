package dk.cphbusiness.dat.datastructures;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface SimpleListTest {

    SimpleList createNewSimpleList();

    @Test
    default void newSimpleListIsEmpty(){
        SimpleList s = createNewSimpleList();
        assertEquals(0, s.size());
    }

    @Test
    default void throwsNoSuchElementException(){
        SimpleList s = createNewSimpleList();
        assertThrows(NoSuchElementException.class, () -> s.takeFront());
        assertThrows(NoSuchElementException.class, () -> s.takeEnd());
    }

    @Test
    default void useCaseTest(){
        SimpleList s = createNewSimpleList();
        s.addFront(10);
        assertEquals(1, s.size());
        s.addFront(20);
        assertEquals(2,s.size());
        assertEquals(20,s.takeFront());
        s.addEnd(15);
        s.addEnd(40);
        assertEquals(3,s.size());
        assertEquals(10,s.takeFront());
        assertEquals(40,s.takeEnd());
        assertEquals(15,s.takeEnd());
        assertEquals(0,s.size());
    }

}
