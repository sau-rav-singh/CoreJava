package programs.strings;

import org.testng.Assert;

/**
 * String Compression
 *
 * Problem Statement:
 * Given a string, compress it by replacing consecutive repeating characters with
 * the character followed by its count. If a character appears only once, don't add a count.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of lowercase English letters.
 */
public class StringCompression {

    public static void main(String[] args) {
        Assert.assertEquals(compressString("aaabbbacfwww"), "a3b3acfw3");
        Assert.assertEquals(compressString("abc"), "abc");
    }

    /**
     * APPROACH: Single Pass (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - StringBuilder for result.
     */
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
}

