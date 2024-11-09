package Codewars;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    //count the number of distinct characters in a string that appear more than once. The method should be case-insensitive

    public static void main(String[] args) {
        System.out.println(duplicateCount("Indivisibilities"));
    }

    public static int duplicateCount(String text) {
        Map<Character, Integer> hs = new HashMap<>();
        int count=0;
        for (char c : text.toLowerCase().toCharArray()) {
            hs.put(c, hs.getOrDefault(c, 0) + 1);
            if (hs.get(c) == 2) {
                count++;
            }
        }
        return count;
    }
}