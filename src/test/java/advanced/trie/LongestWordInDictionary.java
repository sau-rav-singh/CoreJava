package advanced.trie;

import java.util.Arrays;

public class LongestWordInDictionary {
    // QUESTION: Given an array of strings words, return the longest word in words that can be built one character
    // at a time by other words in words. If there is more than one possible answer, return the longest word with
    // the smallest lexicographical order.
    // Example: Input: words = ["w","wo","wor","worl","world"]
    //          Output: "world"
    // Time Complexity: O(N * L) where N is number of words and L is average word length
    // Space Complexity: O(N * L)

    private static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    public LongestWordInDictionary() {
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
        node.isEndOfWord = true;
    }

    private boolean canBuild(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            node = node.children[index];
            if (node == null || !node.isEndOfWord) {
                return false;
            }
        }
        return true;
    }

    public String longestWord(String[] words) {
        // Sort words by length (descending) and lexicographical order
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });

        // Insert all words into trie
        for (String word : words) {
            insert(word);
        }

        // Find the longest word that can be built
        for (String word : words) {
            if (canBuild(word)) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LongestWordInDictionary solution = new LongestWordInDictionary();
        String[] words1 = {"w", "wo", "wor", "worl", "world"};
        System.out.println(solution.longestWord(words1)); // Output: world

        String[] words2 = {"a", "banana", "app", "ap", "apply", "apple"};
        System.out.println(solution.longestWord(words2)); // Output: apple
    }
}
