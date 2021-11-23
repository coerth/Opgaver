package dk.cphbusiness.dat.datastructures;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public interface SimpleListTest
{
	SimpleList createNewSimpleList();

	@Test
	default void newSimpleListIsEmpty()
	{
		SimpleList sl = createNewSimpleList();
		assertEquals(0, sl.size());
	}

	@Test
	default void throwsNoSuchElementExceptionOnTakeFirst()
	{
		SimpleList sl = createNewSimpleList();
		assertThrows(NoSuchElementException.class, () -> {sl.takeFirst();});
	}

	@Test
	default void throwsNoSuchElementExceptionOnTakeLast()
	{
		SimpleList sl = createNewSimpleList();
		assertThrows(NoSuchElementException.class, () -> {sl.takeLast();});
	}

	@Test
	default void useCaseTest()
	{
		SimpleList sl = createNewSimpleList();

		sl.addLast(42);
		//[42]
		assertEquals(1, sl.size());

		sl.addLast(9);
		//[42, 9]
		assertEquals(2, sl.size());

		sl.addFirst(7);
		//[7, 42, 9]
		assertEquals(3, sl.size());

		sl.addFirst(11);
		//[11, 7, 42, 9]
		assertEquals(4, sl.size());

		assertEquals(9, sl.takeLast());
		//[11, 7, 42]
		assertEquals(3, sl.size());

		assertEquals(11, sl.takeFirst());
		//[7, 42]
		assertEquals(2, sl.size());

		assertEquals(42, sl.takeLast());
		//[7]
		assertEquals(1, sl.size());

		assertEquals(7, sl.takeFirst());
		//[]
		assertEquals(0, sl.size());
	}
}
