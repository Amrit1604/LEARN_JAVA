package PRACTICE_QUES;

public class MazeSolver {
    static int[][] maze = {
        { 0, 1, 0, 0, 0 },
        { 1, 0, 1, 1, 0 },
        { 0, 0, 1, 0, 0 },
        { 0, 1, 1, 1, 0 },
        { 0, 0, 0, 1, 0 }
    };

    static boolean[][] visited;

    static boolean solveMaze(int x, int y, int goalX, int goalY) {
        // Base case: reached the goal
        if (x == goalX && y == goalY) {
            maze[x][y] = 9; // Mark goal in the path
            return true;
        }

        // Check if the current position is valid
        if (x < 0 || y < 0 || x >= maze.length || y >= maze[0].length || maze[x][y] == 1 || visited[x][y]) {
            return false;
        }

        visited[x][y] = true;

        // Mark the current path
        maze[x][y] = 9;

        // Try moving in all four directions
        if (solveMaze(x + 1, y, goalX, goalY) ||  // Down
            solveMaze(x - 1, y, goalX, goalY) ||  // Up
            solveMaze(x, y + 1, goalX, goalY) ||  // Right
            solveMaze(x, y - 1, goalX, goalY)) {  // Left
            return true;
        }

        // Backtrack: Unmark the current cell
        maze[x][y] = 0;
        visited[x][y] = false;
        
        return false;
    }

    public static void main(String[] args) {
        visited = new boolean[maze.length][maze[0].length];
        int startX = 0, startY = 0; // Starting point
        int goalX = 4, goalY = 4;  // Goal point

        if (solveMaze(startX, startY, goalX, goalY)) {
            System.out.println("Path found:");
        } else {
            System.out.println("No path exists.");
        }

        // Print the maze with the path
        for (int[] row : maze) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

