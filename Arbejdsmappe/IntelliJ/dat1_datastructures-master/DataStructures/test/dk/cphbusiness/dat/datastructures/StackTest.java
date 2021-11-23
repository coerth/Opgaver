package dk.cphbusiness.dat.datastructures;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface StackTest
{
	Stack createNewStack();

	@Test
	default void newStackIsEmpty()
	{
		Stack s = createNewStack();
		assertEquals(0, s.size());
	}

	@Test
	default void throwsNoSuchElementException()
	{
		Stack s = createNewStack();
		assertThrows(NoSuchElementException.class, () -> {s.pop();});
	}

	@Test
	default void useCaseTest()
	{
		Stack s = createNewStack();
		s.push(42);
		assertEquals(1, s.size());
		s.push(7);
		assertEquals(2, s.size());
		assertEquals(7, s.pop());
		assertEquals(1, s.size());
		s.push(9);
		assertEquals(2, s.size());
		assertEquals(9, s.pop());
		assertEquals(1, s.size());
		assertEquals(42, s.pop());
		assertEquals(0, s.size());
	}
}
