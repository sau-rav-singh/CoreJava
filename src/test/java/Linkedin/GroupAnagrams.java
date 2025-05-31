package Linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String[] sortedStrings = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            sortedStrings[i] = new String(arr);
        }

        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                if (strs[j] != null && sortedStrings[i].equals(sortedStrings[j])) {
                    group.add(strs[j]);
                    strs[j] = null;
                }
            }
            result.add(group);
            strs[i] = null;
        }
        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] isGrouped = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            List<String> subList = new ArrayList<>();
            if (!isGrouped[i]) {
                subList.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (areAnagrams(strs[i], strs[j])) {
                        subList.add(strs[j]);
                        isGrouped[j] = true;
                    }
                }
            }
            if (!subList.isEmpty())
                result.add(subList);
        }
        return result;
    }

    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}