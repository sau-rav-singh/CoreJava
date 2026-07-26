package InterviewPrep.Graphs;

public class NumberOfIslands {
    // QUESTION: Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
    // return the number of islands. An island is surrounded by water and is formed by connecting adjacent
    // lands horizontally or vertically.
    // Example: Input: grid = [
    //   ["1","1","1","1","0"],
    //   ["1","1","0","1","0"],
    //   ["1","1","0","0","0"],
    //   ["0","0","0","0","0"]
    // ]
    //          Output: 1
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n) in worst case due to recursion stack

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    numIslands++;
                    dfs(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '0'; // Mark as visited

        // Visit all adjacent cells
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] grid1 = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid1)); // Output: 1

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid2)); // Output: 3
    }
}
