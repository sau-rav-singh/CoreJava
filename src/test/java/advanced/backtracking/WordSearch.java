package advanced.backtracking;

public class WordSearch {
    // QUESTION: Given an m x n grid of characters board and a string word, return true if word exists in the grid.
    // The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally
    // or vertically neighboring. The same letter cell may not be used more than once.
    // Example: Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    //          Output: true
    // Time Complexity: O(m * n * 4^L) where L is word length
    // Space Complexity: O(L) for recursion stack

    public static boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || 
            board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#'; // Mark as visited

        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                       dfs(board, word, i - 1, j, index + 1) ||
                       dfs(board, word, i, j + 1, index + 1) ||
                       dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // Restore
        return found;
    }

    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word)); // Output: true

        String word2 = "SEE";
        System.out.println(exist(board, word2)); // Output: true
    }
}
