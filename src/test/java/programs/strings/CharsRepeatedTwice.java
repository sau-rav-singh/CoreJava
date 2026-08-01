package programs.strings;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Characters Repeated Twice
 *
 * Problem Statement:
 * Given a string, find all characters that appear at least twice and print their frequency.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of lowercase English letters.
 */
public class CharsRepeatedTwice {

    public static void main(String[] args) {
        String str = "aabccdad";
        Map<Character, Integer> result = findCharsRepeatedTwice(str);
        Assert.assertEquals(result.get('a'), Integer.valueOf(3));
        Assert.assertEquals(result.get('c'), Integer.valueOf(2));
        Assert.assertEquals(result.get('d'), Integer.valueOf(2));
    }

    /**
     * APPROACH: Frequency Array (Optimal for lowercase)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 26.
     */
    public static Map<Character, Integer> findCharsRepeatedTwice(String str) {
        Map<Character, Integer> result = new HashMap<>();
        int[] counter = new int[26];

        for (char c : str.toCharArray()) {
            counter[c - 'a']++;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] >= 2) {
                result.put((char) (i + 'a'), counter[i]);
            }
        }
        return result;
    }

    /**
     * APPROACH 2: HashMap (General purpose)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(K)
     * - K is the number of unique characters.
     */
    public static Map<Character, Integer> findCharsRepeatedTwiceHashMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        Map<Character, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= 2) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
}
