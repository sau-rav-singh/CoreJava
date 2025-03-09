package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortStringCharsTest {
    public static String sortStrings(String s) {
        int[] freq = new int[256]; // Covers all ASCII characters
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        // Step 2: Create an array of characters for sorting
        Character[] chars = new Character[256];
        for (int i = 0; i < 256; i++) {
            chars[i] = (char) i;
        }
        // Step 3: Sort characters based on frequency in descending order
        Arrays.sort(chars, (a, b) -> freq[b] - freq[a]);

        // Step 4: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (freq[c] > 0) {
                result.append(String.valueOf(c).repeat(freq[c]));
            }
        }
        return result.toString();
    }

    //t:nlogn,s:n
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

    @Test
    public void test() {
        Assert.assertEquals(sortStrings("Aabb"), "bbAa");
        Assert.assertEquals(sortStringsWithMaps("Aabb"), "bbAa");
    }
}
