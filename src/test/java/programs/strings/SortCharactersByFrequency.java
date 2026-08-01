package programs.strings;

import org.testng.Assert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * LeetCode 451: Sort Characters By Frequency
 *
 * Problem Statement:
 * Given a string, sort its characters based on their frequency in descending order.
 * If characters have the same frequency, maintain their original order.
 *
 * Constraints:
 * - 1 <= s.length <= 5 * 10^5
 * - s consists of uppercase and lowercase English letters and digits.
 */
public class SortCharactersByFrequency {

    public static void main(String[] args) {
        Assert.assertEquals(sortStrings("Aabb"), "bbAa");
        Assert.assertEquals(sortStringsWithMaps("Aabb"), "bbAa");
        Assert.assertEquals(sortStrings("tree"), "eert");
    }

    /**
     * APPROACH 1: Frequency Array and Sort (Optimal)
     *
     * Time Complexity: O(N + K log K)
     * - N for counting, K log K for sorting (K = 256 for ASCII).
     *
     * Space Complexity: O(K)
     * - Fixed size array for ASCII.
     */
    public static String sortStrings(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        Character[] chars = new Character[256];
        for (int i = 0; i < 256; i++) {
            chars[i] = (char) i;
        }

        Arrays.sort(chars, (a, b) -> freq[b] - freq[a]);

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (freq[c] > 0) {
                result.append(String.valueOf(c).repeat(freq[c]));
            }
        }
        return result.toString();
    }

    /**
     * APPROACH 2: HashMap and PriorityQueue (Optimal)
     *
     * Time Complexity: O(N log K)
     * - N for counting, K log K for heap operations.
     *
     * Space Complexity: O(K)
     * - Map and heap for unique characters.
     */
    public static String sortStringsWithMaps(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (Character c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(frequencyMap.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char c = entry.getKey();
            int freq = entry.getValue();
            sb.append(String.valueOf(c).repeat(freq));
        }

        return sb.toString();
    }
}

