package dk.cphbusiness.dat.datastructures;

public class QueueImpl implements Queue
{
	private final SimpleList list;

	public QueueImpl(SimpleList list)
	{
		this.list = list;
	}

	@Override
	public int size()
	{
		return list.size();
	}

	@Override
	public void enqueue(int value)
	{
		list.addLast(value);
	}

	@Override
	public int dequeue()
	{
		return list.takeFirst();
	}
}
