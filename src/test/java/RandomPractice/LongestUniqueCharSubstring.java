package RandomPractice;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueCharSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubStr("GEEKSFORGEEKS"));
    }
    static String longestSubStr(String str) {
        Set<Character> hs=new HashSet<>();
        int j=0,k=0,maxLen=0;
        for(int i=0;i<str.length();i++){
            while(hs.contains(str.charAt(i))){
                hs.remove(str.charAt(j));
                j++;
            }
            hs.add(str.charAt(i));
            k++;
            if(k-j>maxLen){
                maxLen=k-j;
            }
        }
        return str.substring(j,k+1);
    }
}
