package Linkedin;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentString {
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple banana grape banana orange orange";
        String[] words=input.split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        frequencyMap.forEach((word, frequency) -> System.out.println(word + ": " + frequency));
        String secondMostFrequent = getSecondMostFrequent(frequencyMap);
        System.out.println("Second most frequent string: " + secondMostFrequent);
    }

    private static String getSecondMostFrequent(Map<String, Integer> frequencyMap) {
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
