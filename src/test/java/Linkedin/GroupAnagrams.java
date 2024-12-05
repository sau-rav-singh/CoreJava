package Linkedin;

import java.util.*;

public class GroupAnagrams {
    //With HashMap: More efficient in terms of time complexity O(nklog𝑘 ) , space complexity 𝑂 ( 𝑛 𝑘 )
    //Without HashMap: Less efficient in time complexity O(𝑛2𝑘logk ) , same space complexity 𝑂 ( 𝑛 𝑘 )

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(arr);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagramswithoutMap(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String current = strs[i];
            List<String> group = new ArrayList<>();
            group.add(current);
            for (int j = i + 1; j < strs.length; j++) {
                if (areAnagrams(current, strs[j])) {
                    group.add(strs[j]);
                    strs[j] = ""; // Mark this string as grouped
                }
            }
            if (!group.isEmpty()) {
                result.add(group);
            }
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
