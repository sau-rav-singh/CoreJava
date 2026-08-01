package programs.strings;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * String Permutations
 *
 * Problem Statement:
 * Given a string, generate all possible permutations of its characters.
 *
 * Constraints:
 * - 1 <= str.length <= 8
 * - str consists of lowercase English letters.
 */
public class StringPermutations {

    public static void main(String[] args) {
        Set<String> result = permute("abc");
        Assert.assertTrue(result.contains("abc"));
        Assert.assertTrue(result.contains("acb"));
        Assert.assertTrue(result.contains("bac"));
        Assert.assertTrue(result.contains("bca"));
        Assert.assertTrue(result.contains("cab"));
        Assert.assertTrue(result.contains("cba"));
        Assert.assertEquals(result.size(), 6);
    }

    /**
     * APPROACH 1: Recursive with Backtracking (Optimal)
     *
     * Time Complexity: O(N! * N)
     * - N! permutations, each takes O(N) to build.
     *
     * Space Complexity: O(N!)
     * - Storing all permutations.
     */
    static void printPermutn(String str, String ans) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        boolean[] alpha = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            if (!alpha[ch - 'a']) printPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }

    /**
     * APPROACH 2: Recursive with Set (Handles duplicates)
     *
     * Time Complexity: O(N! * N)
     * - N! permutations, each takes O(N) to build.
     *
     * Space Complexity: O(N!)
     * - Storing all permutations.
     */
    static Set<String> permute(String str) {
        if (str == null) {
            return null;
        } else if (str.isEmpty()) {
            Set<String> set = new HashSet<>();
            set.add("");
            return set;
        }
        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        Set<String> words = permute(remainingStr);
        Set<String> permutations = new HashSet<>();
        for (String word : words) {
            for (int j = 0; j <= word.length(); j++) {
                String s = word.substring(0, j) + firstChar + word.substring(j);
                permutations.add(s);
            }
        }
        return permutations;
    }
}

