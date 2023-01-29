package CodingNinja;

public class Test {

    public static void main(String[] args) {
        int[][] maze = {{1, 0, 1},{1, 1, 1},{ 1 ,1, 1}}; 
        ratInAMaze(maze, 3);
    }
	public static void ratInAMaze(int maze[][], int n) {
		/* 
			* Your class should be named Solution.
			* Write your code here
		 */
		int path[][] = new  int [maze.length][maze.length];
		printAllPaths(maze, 0, 0, path);
	}

	public static void printAllPaths(int maze[][], int i, int j, int path[][]){
		int n = maze.length;
		if(i<0 || i >= n || j < 0 || j >=n || maze[i][j] == 0 || path[i][j] == 1){
			return;
		}
		// Include the cell in current path
		path[i][j] = 1;

		if(i == n-1 && j == n-1){
			for(int r = 0; r<n; r++){
				for(int c = 0; c<n; c++){
					System.out.print(path[r][c]+ " ");
                	}	System.out.println();
        
			}
			System.out.println();

			path[i][j] = 0;
		}

		// Explore all the directions
		// top
		printAllPaths(maze, i-1, j, path);
		
		// down
		printAllPaths(maze, i + 1, j, path);

		// left
		printAllPaths(maze, i, j - 1, path);

		// right
		printAllPaths(maze, i, j+1, path);
		path[i][j] = 0;
	}

}
