public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] arr) {
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int len = longestCommonLength(result, arr[i]);
            result = result.substring(0, len);
        }
        return result;
    }

    static int longestCommonLength(String str1,String str2){
        int commonLength=0;
        int minLength=Math.min(str1.length(),str2.length());
        while(commonLength<minLength && str1.charAt(commonLength)==str2.charAt(commonLength)){
            commonLength++;
        }
        return commonLength;
    }
}
