import java.util.ArrayList;
import java.util.Stack;

public class MazeSolverQueue<T> extends MazeSolver 
{
	
	private Maze m;
	//private MyQueue<T> queue;
	
	public MazeSolverQueue(Maze maze) 
	{
		super(maze);
		makeEmpty();
	}


	@Override
	public void makeEmpty() 
	{
		
		squareQueue = new MyQueue<Square>();
		m = new Maze();
		squareQueue.offer(m.getStart());
		
	}

	@Override
	public boolean isEmpty() 
	{
		if(squareQueue.size()==0)
		{
			return true;
		}
		return false;
	}

	@Override
	public void add(Square s)
	{
		squareQueue.offer(s);
		squareQueue.peek().previous = s;
		
	}

	@Override
	public Square next() 
	{
		
		ArrayList<Square> solverList = new ArrayList<Square>();
		solverList = m.getNeighbors(squareQueue.peek());
		//System.out.println(solverList);

		for(int i = 0; i < solverList.size(); i++)
		{
			if(solverList.get(i).getType()==0 && solverList.get(i).getStatus()!='o')
			{
				return solverList.get(i);
			}
			if(solverList.get(i).getType()==3)
			{
				solved=true;
			}
		}
		return null;
	}

	

	

}
