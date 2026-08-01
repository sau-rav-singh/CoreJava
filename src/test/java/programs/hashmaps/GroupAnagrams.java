package programs.hashmaps;

import org.testng.Assert;

import java.util.*;

/**
 * LeetCode 49: Group Anagrams
 *
 * Problem Statement:
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
 *
 * Constraints:
 * - 1 <= strs.length <= 10^4
 * - 0 <= strs[i].length <= 100
 * - strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result1 = groupAnagramsOptimized(arr.clone());
        Assert.assertEquals(result1.size(), 3);

        List<List<String>> result2 = groupAnagramsBruteForce(arr.clone());
        Assert.assertEquals(result2.size(), 3);
    }

    /**
     * APPROACH 1: HashMap with Sorted Keys (Optimal)
     *
     * Time Complexity: O(N * K log K)
     * - N strings, K is average string length for sorting.
     *
     * Space Complexity: O(N * K)
     * - HashMap storing all strings.
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

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N² * K log K)
     * - N strings, comparing each pair with sorting.
     *
     * Space Complexity: O(N * K)
     * - Result list storing all strings.
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
}
