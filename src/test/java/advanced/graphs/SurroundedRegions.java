package advanced.graphs;

public class SurroundedRegions {
    // QUESTION: Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally
    // surrounded by 'X'. A region is captured by flipping all 'O's into 'X's in that surrounded region.
    // Example: Input: board = [
    //   ["X","X","X","X"],
    //   ["X","O","O","X"],
    //   ["X","X","O","X"],
    //   ["X","O","X","X"]
    // ]
    //          Output: [
    //   ["X","X","X","X"],
    //   ["X","X","X","X"],
    //   ["X","X","X","X"],
    //   ["X","O","X","X"]
    // ]
    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n) in worst case due to recursion stack

    public static void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int rows = board.length;
        int cols = board[0].length;

        // Mark 'O's on the border and connected to border as safe
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }

        // Flip remaining 'O's to 'X' and restore safe 'O's
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private static void dfs(char[][] board, int i, int j) {
        int rows = board.length;
        int cols = board[0].length;

        if (i < 0 || i >= rows || j < 0 || j >= cols || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'S'; // Mark as safe

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };

        solve(board);

        System.out.println("Result:");
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
