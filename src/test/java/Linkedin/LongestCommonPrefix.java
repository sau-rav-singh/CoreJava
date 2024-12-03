package Linkedin;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(findLongestCommonPrefix(strs));
    }

    public static String findLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }

        String prefix = strs[0].substring(0, minLength);
        for (int i = 0; i < minLength; i++) {
            boolean ans = true;
            for (String str : strs) {
                if (!str.startsWith(prefix)) {
                    ans = false;
                    break;
                }
            }
            if (!ans) {
                prefix = prefix.substring(0, minLength - 1);
                minLength--;
            }
        }
        return prefix;
    }
}
