package Linkedin;

import java.util.*;

// QUESTION: Given an array of strings, group the anagrams together. An anagram is a word or phrase
// formed by rearranging the letters of a different word or phrase.
// Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
//          Output: [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]]
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            anagramMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}