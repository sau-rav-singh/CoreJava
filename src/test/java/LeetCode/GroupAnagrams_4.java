package LeetCode;

import java.util.*;

public class GroupAnagrams_4 {

    //Given an array of strings strs, group the anagrams together. You can return the answer in any order.

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagramsOptimised(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(n)
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> anagrams = new ArrayList<>();
            if (strs[i] != null) {
                char[] sortedWordArray = strs[i].toCharArray();
                Arrays.sort(sortedWordArray);
                anagrams.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null) {
                        char[] sortedWordArray1 = strs[j].toCharArray();
                        Arrays.sort(sortedWordArray1);
                        if (Arrays.equals(sortedWordArray, sortedWordArray1)) {
                            anagrams.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                result.add(anagrams);
            }
        }
        return result;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    public static List<List<String>> groupAnagramsOptimised(String[] strs) {
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
