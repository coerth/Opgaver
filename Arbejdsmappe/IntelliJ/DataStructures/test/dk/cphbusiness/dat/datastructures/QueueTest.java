package dk.cphbusiness.dat.datastructures;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface QueueTest {

    Queue createNewQueue();

    @Test
    default void newQueueIsEmpty(){
        Queue q = createNewQueue();
        assertEquals(0,q.size());
    }

    @Test
    default void throwsNoSuchElementException(){
        Queue q = createNewQueue();
        assertThrows(NoSuchElementException.class, () -> q.dequeue());
    }

    @Test
    default void useCaseTest(){
        Queue q = createNewQueue();
        q.enqueue(5);
        assertEquals(1,q.size());
        q.dequeue();
        assertEquals(0,q.size());
        q.enqueue(20);
        q.enqueue(10);
        assertEquals(2, q.size());
        assertEquals(20,q.dequeue());
        assertEquals(1,q.size());
        q.enqueue(30);
        assertEquals(2,q.size());
        assertEquals(10, q.dequeue());
        assertEquals(30, q.dequeue());
        assertEquals(0, q.size());
    }

}
