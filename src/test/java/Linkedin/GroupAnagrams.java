package Linkedin;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] grouped = new boolean[strs.length];
        String[] sortedStrings = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            sortedStrings[i] = new String(arr);
        }

        for (int i = 0; i < strs.length; i++) {
            if (grouped[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (!grouped[j] && sortedStrings[i].equals(sortedStrings[j])) {
                    group.add(strs[j]);
                    grouped[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }
    public static List<List<String>> groupAnagramsWithMap(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            String sortedStr = sortString(str);
            anagramMap.putIfAbsent(sortedStr, new ArrayList<>());
            anagramMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}