package programs.hashmaps;

import java.util.*;

// QUESTION: Given an array of strings, group the anagrams together. An anagram is a word or phrase
// formed by rearranging the letters of a different word or phrase.
// Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//          Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println("Brute Force Approach (O(n²)):");
        List<List<String>> result1 = groupAnagramsBruteForce(arr.clone());
        for (List<String> group : result1) {
            System.out.println(group);
        }

        System.out.println("\nOptimized Approach (O(n*k log k)):");
        List<List<String>> result2 = groupAnagramsOptimized(arr);
        for (List<String> group : result2) {
            System.out.println(group);
        }
    }

    /**
     * Approach 1: Brute Force
     * Time Complexity: O(n² * k log k) where n is number of strings, k is avg string length
     * Space Complexity: O(n)
     * Use when interviewer asks NOT to use HashMap
     */
    public static List<List<String>> groupAnagramsBruteForce(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> anagrams = new ArrayList<>();
            if (strs[i] != null) {
                char[] sortedWordArray = strs[i].toCharArray();
                Arrays.sort(sortedWordArray);
                anagrams.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null) {
                        char[] sortedWordArray1 = strs[j].toCharArray();
                        Arrays.sort(sortedWordArray1);
                        if (Arrays.equals(sortedWordArray, sortedWordArray1)) {
                            anagrams.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                result.add(anagrams);
            }
        }
        return result;
    }

    /**
     * Approach 2: HashMap with Sorted Keys
     * Time Complexity: O(n * k log k) where n is number of strings, k is avg string length
     * Space Complexity: O(n)
     * Use when HashMap is allowed
     */
    public static List<List<String>> groupAnagramsOptimized(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
