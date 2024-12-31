package Linkedin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestUniqueCharSubstring {
    //Time Complexity: O(n)
    //Space Complexity: O(min(n, m))
    public static int lengthOfLongestUniqueCharSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static String findLongestUniqueSubstring(String inputString) {
        int stringLength = inputString.length();
        int currentSubstringStart = 0;
        int currentSubstringLength;
        int maximumSubstringLength = 0;
        int maximumSubstringStart = 0;
        int index;

        Map<Character, Integer> characterIndices = new HashMap<>();
        characterIndices.put(inputString.charAt(0), 0);

        for (index = 1; index < stringLength; index++) {
            char currentCharacter = inputString.charAt(index);
            if (!characterIndices.containsKey(currentCharacter)) {
                characterIndices.put(currentCharacter, index);
            } else {
                int previousIndex = characterIndices.get(currentCharacter);
                if (previousIndex >= currentSubstringStart) {
                    currentSubstringLength = index - currentSubstringStart;
                    if (maximumSubstringLength < currentSubstringLength) {
                        maximumSubstringLength = currentSubstringLength;
                        maximumSubstringStart = currentSubstringStart;
                    }
                    currentSubstringStart = previousIndex + 1;
                }
                characterIndices.put(currentCharacter, index);
            }
        }
        if (maximumSubstringLength < index - currentSubstringStart) {
            maximumSubstringLength = index - currentSubstringStart;
            maximumSubstringStart = currentSubstringStart;
        }
        return inputString.substring(maximumSubstringStart, maximumSubstringStart + maximumSubstringLength);
    }

    static String longestSubStr(String str) {
        Set<Character> hs = new HashSet<>();
        int k = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            while (hs.contains(str.charAt(i))) {
                hs.remove(str.charAt(k));
                k++;
            }
            hs.add(str.charAt(i));

            if (i - k + 1 > maxLength) {
                maxLength = i - k + 1;
                startIndex = k;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String s = "abb";
        int length = lengthOfLongestUniqueCharSubstring(s);
        System.out.println("Length of the longest substring: " + length);
        System.out.println(findLongestUniqueSubstring("GEEKSFORGEEKS"));
        System.out.println(longestSubStr("GEEKSFORGEEKS"));
    }
}