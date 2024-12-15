package Linkedin;

import java.util.HashMap;
import java.util.HashSet;

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
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
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
        System.out.println(areIsomorphic("aab", "xxy")); // Output: true
        System.out.println(areIsomorphic("foo", "bar")); // Output: false
        System.out.println(areIsomorphic("paper", "title")); // Output: true
        System.out.println(areIsomorphic("abc", "xyz")); // Output: true
    }
}
