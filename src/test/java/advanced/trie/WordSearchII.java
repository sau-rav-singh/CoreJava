package advanced.trie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearchII {
    // QUESTION: Given an m x n board of characters and a list of strings words, return all words on the board.
    // Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are
    // horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
    // Example: Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
    //          Output: ["eat","oath"]
    // Time Complexity: O(m * n * 4^L) where L is max word length
    // Space Complexity: O(N * L) for Trie where N is number of words

    private static class TrieNode {
        TrieNode[] children;
        String word;

        public TrieNode() {
            children = new TrieNode[26];
            word = null;
        }
    }

    private TrieNode root;

    public WordSearchII() {
        root = new TrieNode();
    }

    private void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.word = word;
    }

    public List<String> findWords(char[][] board, String[] words) {
        // Build trie from words
        for (String word : words) {
            insert(word);
        }

        Set<String> result = new HashSet<>();
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root, result);
            }
        }

        return new ArrayList<>(result);
    }

    private void dfs(char[][] board, int i, int j, TrieNode node, Set<String> result) {
        char c = board[i][j];
        if (c == '#' || node.children[c - 'a'] == null) {
            return;
        }

        node = node.children[c - 'a'];
        if (node.word != null) {
            result.add(node.word);
        }

        board[i][j] = '#'; // Mark as visited

        int rows = board.length;
        int cols = board[0].length;

        if (i > 0) dfs(board, i - 1, j, node, result);
        if (j > 0) dfs(board, i, j - 1, node, result);
        if (i < rows - 1) dfs(board, i + 1, j, node, result);
        if (j < cols - 1) dfs(board, i, j + 1, node, result);

        board[i][j] = c; // Restore
    }

    public static void main(String[] args) {
        WordSearchII solution = new WordSearchII();
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> result = solution.findWords(board, words);
        System.out.println("Found words: " + result); // Output: [eat, oath]
    }
}
