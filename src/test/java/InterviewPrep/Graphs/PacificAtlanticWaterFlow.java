package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.List;

public class PacificAtlanticWaterFlow {
    // QUESTION: There is an m x n rectangular island that borders both the Pacific and Atlantic oceans.
    // The Pacific Ocean touches the island's left and top edges, and the Atlantic Ocean touches the island's
    // right and bottom edges. The island receives rain, and water flows to neighboring cells in 4 directions.
    // Return a 2D list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.
    // Example: Input: heights = [
    //   [1,2,2,3,5],
    //   [3,2,3,4,4],
    //   [2,4,5,3,1],
    //   [6,7,1,4,5],
    //   [5,1,1,2,4]
    // ]
    //          Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n)

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return result;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

        // DFS from Pacific border (top and left)
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, pacific, heights[i][0]);
        }
        for (int j = 0; j < cols; j++) {
            dfs(heights, 0, j, pacific, heights[0][j]);
        }

        // DFS from Atlantic border (bottom and right)
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, cols - 1, atlantic, heights[i][cols - 1]);
        }
        for (int j = 0; j < cols; j++) {
            dfs(heights, rows - 1, j, atlantic, heights[rows - 1][j]);
        }

        // Find cells that can reach both oceans
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> cell = new ArrayList<>();
                    cell.add(i);
                    cell.add(j);
                    result.add(cell);
                }
            }
        }

        return result;
    }

    private static void dfs(int[][] heights, int i, int j, boolean[][] visited, int prevHeight) {
        int rows = heights.length;
        int cols = heights[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || visited[i][j] || heights[i][j] < prevHeight) {
            return;
        }

        visited[i][j] = true;

        dfs(heights, i + 1, j, visited, heights[i][j]);
        dfs(heights, i - 1, j, visited, heights[i][j]);
        dfs(heights, i, j + 1, visited, heights[i][j]);
        dfs(heights, i, j - 1, visited, heights[i][j]);
    }

    public static void main(String[] args) {
        int[][] heights = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> result = pacificAtlantic(heights);
        System.out.println("Cells that can flow to both oceans:");
        for (List<Integer> cell : result) {
            System.out.println("[" + cell.get(0) + "," + cell.get(1) + "]");
        }
    }
}
