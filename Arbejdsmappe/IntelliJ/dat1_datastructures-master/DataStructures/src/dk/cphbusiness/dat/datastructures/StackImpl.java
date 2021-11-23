package dk.cphbusiness.dat.datastructures;

public class StackImpl implements Stack
{
	private final SimpleList list;

	public StackImpl(SimpleList list)
	{
		this.list = list;
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void push(int value)
	{
		list.addFirst(value);
	}

	@Override
	public int pop()
	{
		return list.takeFirst();
	}
}
