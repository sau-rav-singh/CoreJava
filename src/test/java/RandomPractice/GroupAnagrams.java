package RandomPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            List<String> group = new ArrayList<>();
            if (!visited[i]) {
                group.add(arr[i]);
                for (int j = i + 1; j < arr.length; j++) {
                    if (areAnagrams(arr[i], arr[j])) {
                        group.add(arr[j]);
                        visited[j] = true;
                    }
                }
            }
            if (!group.isEmpty())
                result.add(group);
        }
        System.out.println(result);
    }

    static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
