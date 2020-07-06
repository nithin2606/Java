package fir;


//drawing a path for the rat in a given maze using backtracking algorithm
public class rat_maze {
	
	static int n;
	
	static void printSolution(int sol[][]) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" "+sol[i][j]+"");
			}
			System.out.println();
		}
	}
	
	static boolean isSafe(int maze[][],int x,int y) {
		return (x>=0&&x<n&&y>=0&&y<n&&maze[x][y]==1);
	}
	
	static boolean solveMaze(int maze[][]) {
		int sol[][] =new int[n][n];
		
		if (solveMazeUtil(maze, 0, 0, sol) == false) { 
            System.out.print("Solution doesn't exist"); 
            return false; 
        } 
		
		printSolution(sol);
		return true;
	}
	
	static boolean solveMazeUtil(int maze[][],int x,int y,int sol[][]) {
		if(x==n-1&&y==n-1&&maze[x][y]==1) {
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze,x,y)==true) {
			sol[x][y]=1;
			
			if(solveMazeUtil(maze,x+1,y,sol))  
				return true;
			if(solveMazeUtil(maze,x,y+1,sol))  
				return true;
			
			sol[x][y]=0;  //backtracking, that is after calling the same method recursively, if we dont find a
			//a solution we return false, that is we don't have solution
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
//		RateMaze rat=new RatMaze();
		int maze[][] = {{ 1, 0, 0, 0 }, 
                { 1, 1, 0, 1 }, 
                { 0, 1, 0, 0 }, 
                { 1, 1, 1, 1 } };
		
		n=maze.length;
		solveMaze(maze);
	}

}
