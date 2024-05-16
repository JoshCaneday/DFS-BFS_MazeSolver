import java.util.ArrayList;
/*
 * Class to implement SearchWorklist as a Stack and a Queue.
 * You can use any built-in Java collections for this class.
 */

class StackWorklist implements SearchWorklist {
	ArrayList<Square> holder;
	
	public StackWorklist() {
		holder = new ArrayList<>();
	}
	
	public void add(Square c)
	{
		holder.add(c);
		
	}
	
	public Square remove()
	{
		if (holder.size() != 0)
		{
			return(holder.remove(holder.size()-1));
		}
		return null;
		//idk what to do for the else
		
	}
	
	public boolean isEmpty()
	{
		if (holder.size() == 0)
		{
			return true;
		}
		return false;
		
	}
}

class QueueWorklist implements SearchWorklist {
	ArrayList<Square> holder;
	
	public QueueWorklist() {
		holder = new ArrayList<>();
	}
	
	public void add(Square c) {
		holder.add(c);
		
	}
	
	public Square remove() {
		if (holder.size() != 0)
		{
			return(holder.remove(0));
		}
		return null;
		//idk for the else
		
	}
	
	public boolean isEmpty() {
		
		if (holder.size() == 0)
		{
			return true;
		}
		return false;
	}
}

public interface SearchWorklist {
	void add(Square c);
	Square remove();
	boolean isEmpty();
}
