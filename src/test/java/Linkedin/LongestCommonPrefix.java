package Linkedin;

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
    static int commonPrefixLen(String a, String b) {
        int commonLength=0;
        int minL=Math.min(a.length(),b.length());
        for(int i=0;i<minL;i++){
            if(a.charAt(i)==b.charAt(i)){
                commonLength++;
            }else{
                break;
            }
        }
        return commonLength;
    }
}
