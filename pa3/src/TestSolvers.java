import java.util.ArrayList;
import static org.junit.Assert.*;

/*
 * Write your JUnit tests here
 * Use the formatMaze() method to get nicer JUnit output
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSolvers {

	/* Helper method to compare two mazes */
	public void checkMaze(SearchWorklist wl, Maze startMaze, String[] expected) {
		Square s = MazeSolver.solve(startMaze, wl);
		if(expected == null) { assertNull(s); }
		else {
			ArrayList<Square> sp = startMaze.storePath();
			String actualStr = formatMaze(startMaze.showSolution(sp));
			String expectedStr = formatMaze(expected);
			assertEquals(expectedStr, actualStr);
		}
	}	

	/* Helper method to format String[] output as String */
	public String formatMaze(String[] arr) {
		String result = "";
		for (String s: arr)
			result += "\n"+s;
		return (result+"\n");
	}

	/* Add your own Worklist tests below */

	/* ************** HINT ******************** 
	 * Use the helper methods to create simple
	 * tests that are easier to debug. 
	 */
	@Test
	public void basicQueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "#___",
	            "__F_",
	            "S##_",
	            "____"
	        });
		String[] ans2 = {"#___",
	            "**F_",
	            "S##_",
	            "____"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void basicStackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "#___",
	            "__F_",
	            "S##_",
	            "____"
	        });
		String[] ans = {"#___",
	            "__F*",
	            "S##*",
	            "****"};
		checkMaze(wl, m, ans);
	}
	@Test
	public void noWallsQueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "__F_",
	            "____",
	            "S___"
	        });
		String[] ans2 = {"____",
	            "**F_",
	            "*___",
	            "S___"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void noWallsStackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "__F_",
	            "____",
	            "S___"
	        });
		String[] ans = {"____",
	            "__F*",
	            "___*",
	            "S***"};
		checkMaze(wl, m, ans);
	}
	@Test
	public void manyWallsQueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "___#",
	            "_#F#",
	            "_###",
	            "S__#"
	        });
		String[] ans2 = {"***#",
	            "*#F#",
	            "*###",
	            "S__#"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void manyWallsStackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "___#",
	            "_#F#",
	            "_###",
	            "S__#"
	        });
		String[] ans = {"***#",
	            "*#F#",
	            "*###",
	            "S__#"};
		checkMaze(wl, m, ans);
	}
	@Test
	public void startCloseToFinishQueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "____",
	            "____",
	            "SF__"
	        });
		String[] ans2 = {"____",
	            "____",
	            "____",
	            "SF__"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void startCloseToFinishStackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "____",
	            "F___",
	            "S___"
	        });
		String[] ans = {"____",
	            "____",
	            "F___",
	            "S___"};
		checkMaze(wl, m, ans);
	}
	@Test
	public void startFarFromFinishQueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "___F",
	            "____",
	            "____",
	            "S___"
	        });
		String[] ans2 = {"***F",
	            "*___",
	            "*___",
	            "S___"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void startFromFarFinishStackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "___F",
	            "____",
	            "____",
	            "S___"
	        });
		String[] ans = {"___F",
	            "___*",
	            "___*",
	            "S***"};
		checkMaze(wl, m, ans);
	}
	@Test
	public void QueueTest()
	{
		SearchWorklist wl2 = new QueueWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "____",
	            "____",
	            "SF__"
	        });
		String[] ans2 = {"____",
	            "____",
	            "____",
	            "SF__"};
		
		checkMaze(wl2, m , ans2);	
	}
	@Test
	public void StackTest()
	{
		SearchWorklist wl = new StackWorklist();
		Maze m = new Maze(new String[] {
	            "____",
	            "____",
	            "F___",
	            "S___"
	        });
		String[] ans = {"____",
	            "____",
	            "F___",
	            "S___"};
		checkMaze(wl, m, ans);
	}
	
	
}



