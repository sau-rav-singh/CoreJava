package programs.strings;

import org.testng.Assert;

/**
 * Remove String Duplicates
 *
 * Problem Statement:
 * Given a string, remove duplicate characters from it while preserving the order of
 * first occurrence.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of ASCII characters.
 */
public class RemoveStringDuplicates {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String result = removeDuplicates(str);
        Assert.assertEquals(result, "geksfor");
    }

    /**
     * APPROACH: Boolean Array (Optimal for ASCII)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 256 for ASCII.
     */
    public static String removeDuplicates(String str) {
        boolean[] visited = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch]) {
                visited[ch] = true;
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    /**
     * APPROACH 2: LinkedHashSet (General purpose)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - LinkedHashSet for unique characters.
     */
    public static String removeDuplicatesSet(String str) {
        java.util.LinkedHashSet<Character> set = new java.util.LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
