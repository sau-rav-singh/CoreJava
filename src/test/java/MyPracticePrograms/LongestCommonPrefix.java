package MyPracticePrograms;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] arr) {
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int len = commonPrefixLen(result, arr[i]);
            result = result.substring(0, len);
        }
        return result;
    }
    static int commonPrefixLen(String s1, String s2) {
        int commonLength = 0;
        int len = Math.min(s1.length(), s2.length());
        while (commonLength < len && s1.charAt(commonLength) == s2.charAt(commonLength)) {
            commonLength++;
        }
        return commonLength;
    }

}
