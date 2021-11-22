package dk.cphbusiness.dat.datastructures;

import java.util.NoSuchElementException;

public interface Stack
{
	int size();
	void push(int value);
	int pop();
}
