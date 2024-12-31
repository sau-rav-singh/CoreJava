package RandomPractice;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] arr) {
        StringBuilder result = new StringBuilder(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int commonLength = longestCommonLength(result.toString(), arr[i]);
            result = new StringBuilder(result.substring(0, commonLength));
        }
        return result.toString();
    }

    static int longestCommonLength(String s1, String s2) {
        int commonLength = 0;
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }
        return commonLength;
    }
}
