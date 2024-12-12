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

    public static List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] grouped = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (grouped[i]) continue;
            String current = strs[i];
            List<String> group = new ArrayList<>();
            group.add(current);

            for (int j = i + 1; j < strs.length; j++) {
                if (areAnagrams(current, strs[j])) {
                    group.add(strs[j]);
                    grouped[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }

    static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            String current = sortString(strs[i]);
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                String toBeComparedChar = sortString(strs[j]);
                if (current.equals(toBeComparedChar)) {
                    group.add(strs[j]);
                    strs[j] = "";
                }
            }
            if (!group.isEmpty())
                result.add(group);
        }

        return result;
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
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
}
