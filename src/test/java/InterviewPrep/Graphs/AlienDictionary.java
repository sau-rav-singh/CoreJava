package InterviewPrep.Graphs;

import java.util.*;

public class AlienDictionary {
    // QUESTION: There is a new alien language that uses the English alphabet. However, the order among the
    // letters is unknown to you. You are given a list of strings words from the alien language's dictionary,
    // where the strings in words are sorted lexicographically by the rules of this new language.
    // Derive the order of letters in this alien language. If the order is invalid, return "".
    // Example: Input: words = ["wrt","wrf","er","ett","rftt"]
    //          Output: "wertf"
    // Time Complexity: O(C) where C is total length of all words
    // Space Complexity: O(1) since alphabet size is constant (26)

    public static String alienOrder(String[] words) {
        // Build graph
        Map<Character, Set<Character>> graph = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new HashSet<>());
                inDegree.putIfAbsent(c, 0);
            }
        }

        // Build edges by comparing adjacent words
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];

            // Check for invalid case: word1 is prefix of word2 but longer
            if (word1.length() > word2.length() && word1.startsWith(word2)) {
                return "";
            }

            int minLen = Math.min(word1.length(), word2.length());
            for (int j = 0; j < minLen; j++) {
                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (c1 != c2) {
                    if (!graph.get(c1).contains(c2)) {
                        graph.get(c1).add(c2);
                        inDegree.put(c2, inDegree.get(c2) + 1);
                    }
                    break;
                }
            }
        }

        // Topological sort using BFS
        Queue<Character> queue = new LinkedList<>();
        for (char c : inDegree.keySet()) {
            if (inDegree.get(c) == 0) {
                queue.offer(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            result.append(c);

            for (char neighbor : graph.get(c)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Check if all characters are used (no cycle)
        if (result.length() != graph.size()) {
            return "";
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] words1 = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(alienOrder(words1)); // Output: "wertf"

        String[] words2 = {"z", "x"};
        System.out.println(alienOrder(words2)); // Output: "zx"

        String[] words3 = {"z", "x", "z"};
        System.out.println(alienOrder(words3)); // Output: "" (invalid)
    }
}
