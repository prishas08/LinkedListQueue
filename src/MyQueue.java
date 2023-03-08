public class MyQueue<T> {
	
	private MyLinkedList<T> queue;
	
	public MyQueue(T value)
	{
		queue = new MyLinkedList(value);
		
	}
	
	public MyQueue(int ...vals)
    {
        for (int i: vals)
        {
        	System.out.println(i + " ");
        }
    }
	
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
	
	public void offer(T item)
	{
		queue.add(item);
	}
	
	public T poll()
	{
		T val = queue.remove(0);
		return val;
		
	}
	public T peek()
	{
		T val = queue.get(0);
		return val;
		
	} 
	
	public int size()
	{
		return queue.size();
	}
	
	public void clear()
	{
		while(queue.isEmpty()==false)
		{
			queue.remove(0);
		}
	}
	

}
