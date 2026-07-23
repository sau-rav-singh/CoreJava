package Linkedin;

import org.testng.Assert;
import java.util.HashMap;
import java.util.HashSet;

// QUESTION: Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic
// if the characters in s can be replaced to get t. All occurrences of a character must be replaced
// with another character while preserving the order of characters. No two characters may map to
// the same character, but a character may map to itself.
// Example: Input: "aab", "xxy" -> Output: true
//          Input: "bar", "foo" -> Output: false
public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (map.getOrDefault(c1, c2) != c2) {
                return false;
            }
            if (!map.containsKey(c1)) {
                if (mappedValues.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                mappedValues.add(c2);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Assert.assertTrue(areIsomorphic("aab", "xxy"));
        Assert.assertFalse(areIsomorphic("bar", "foo"));
        Assert.assertTrue(areIsomorphic("paper", "title"));
        Assert.assertTrue(areIsomorphic("abc", "xyz"));
    }
}