import java.util.ArrayList;
/* Class to implement a Maze solver */

public abstract class MazeSolver {
	
	public static Square solve(Maze maze, SearchWorklist wl) {
		/* Complete this method */
		Square start = maze.start;
		Square finish = maze.finish;
		Square current;
		Square neighbor;
		ArrayList<Square> visited = new ArrayList<>();
		
		wl.add(start);
		start.visit();
		visited.add(start);
		
		while (!wl.isEmpty())
		{
			
			current = wl.remove();
			visited.remove(current);
			
			if (current.equals(finish))
			{
				
				return current;
			}
			else
			{
				if (current.getRow() != 0)
				{
					neighbor = maze.contents[current.getRow()-1][current.getCol()];
					if (neighbor.isVisited() == false && neighbor.getIsWall() == false)
					{
						
						neighbor.visit();
						visited.add(neighbor);
						neighbor.setPrevious(current);
						wl.add(neighbor);
					}
				}
				if (current.getRow() != maze.rows - 1)
				{
					neighbor = maze.contents[current.getRow()+1][current.getCol()];
					if (neighbor.isVisited() == false && neighbor.getIsWall() == false)
					{
						
						neighbor.visit();
						visited.add(neighbor);
						neighbor.setPrevious(current);
						wl.add(neighbor);
					}
				}
				if (current.getCol() != maze.cols - 1)
				{
					neighbor = maze.contents[current.getRow()][current.getCol()+1];
					if (neighbor.isVisited() == false && neighbor.getIsWall() == false)
					{
						
						neighbor.visit();
						visited.add(neighbor);
						neighbor.setPrevious(current);
						wl.add(neighbor);
					}
				}
				if (current.getCol() != 0)
				{
					neighbor = maze.contents[current.getRow()][current.getCol()-1];
					if (neighbor.isVisited() == false && neighbor.getIsWall() == false)
					{
						
						neighbor.visit();
						visited.add(neighbor);
						neighbor.setPrevious(current);
						wl.add(neighbor);
					}
				}
				
				
				
			}
		}
		return null;
	}

	/* Add any helper methods you want */
}
