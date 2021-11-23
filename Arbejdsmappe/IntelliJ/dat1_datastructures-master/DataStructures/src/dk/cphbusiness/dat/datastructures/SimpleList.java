package dk.cphbusiness.dat.datastructures;

public interface SimpleList
{
	int size();

	void addFirst(int value);

	void addLast(int value);

	int takeFirst();

	int takeLast();
}
