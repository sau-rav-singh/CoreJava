package programs.hashmaps;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Second Most Frequent String
 *
 * Problem Statement:
 * Given a string of space-separated words, find the second most frequent word in the string.
 * If there is no second most frequent word (i.e., all words have the same frequency), return null.
 *
 * Constraints:
 * - 1 <= input.length <= 10^5
 * - Words consist of lowercase English letters.
 */
public class SecondMostFrequentString {

    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple banana grape banana orange orange";
        String secondMostFrequent = getSecondMostFrequent(input);
        Assert.assertEquals(secondMostFrequent, "orange");
    }

    /**
     * APPROACH: HashMap (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through words.
     *
     * Space Complexity: O(N)
     * - HashMap storing word frequencies.
     */
    public static String getSecondMostFrequent(String input) {
        String[] words = input.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        String secondMostFrequent = null;
        int secondMaxFrequency = 0;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            String word = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                secondMostFrequent = word;
                maxFrequency = frequency;
            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
                secondMaxFrequency = frequency;
                secondMostFrequent = word;
            }
        }
        return secondMostFrequent;
    }
}

