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

    public static List<List<String>> groupAnagrams(String[] strs) {
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
}
